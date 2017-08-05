package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBCon {
	private Connection con;
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/study";
	private String id = "root";
	private String pwd = "dlfhqrp!@";
	
	public DBCon(){
		try {
			Class.forName(driver); //=�߱޼����� ���÷��� Ȱ��
			dBConnecte();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return con;
	}
	
	private void dBConnecte() throws SQLException {
		con = DriverManager.getConnection(url, id, pwd); //con���� ���������� �ִ°�
	}
	
	public void printListFromTable(String sql) {
		List<HashMap<String, String>> list = getListFromTable(sql); // �ؿ��� ������ ����Ʈ���� ����� ��, �÷� ���� ������ �ؽ���(�����ϰ� ����), �ο� ���� ������ ��̸���Ʈ(������� ����ϴϱ�)
		if(list!=null) {
			for(HashMap<String, String> hm : list) { //for each��, �ڵ����� �ݺ��ǰ� ���ִ� �ݺ���
				System.out.println(hm);
			}
		}
	}
	public List<HashMap<String, String>> getListFromTable(String sql){
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql); //���̵�SQL���� �Է�â ����°ſ� ����
			ResultSet rs = ps.executeQuery();//���̵�SQL���� �����ְ� �����ϴ°ſ� ����, ��Ÿ����Ÿ�� �����͸� ��������
			ResultSetMetaData rsmd = rs.getMetaData();  //��Ÿ����Ÿ=�̰� ���� ����Ÿ�ٶ�� ������ �����ִ°�, �׸� �̸�
			int maxNum = rsmd.getColumnCount();//getColumnCount=�÷� ���� ���°�, 49������� ��Ÿ������ ���� �ִ°͵�
			List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();//while������ �տ� �մ�����=�ݺ����� �������� ���ο� ���� �ԷµǴ°� ��������
			while(rs.next()) { // rs.next()=���������� �Ѿ�°�, ���� �վ�� Ʈ�簪 ����
				HashMap<String, String> hm = new HashMap<String, String>();
				for(int i=1;i<=maxNum;i++) { //�÷�����(maxnum)�� �۰ų� ����������
					String colName = rsmd.getColumnLabel(i); // getColumnLabel= �÷� �̸�(=uiname, uinum ���)�� �������°�, �����ͺ��̽� �׸� �̸��� �ִµ� �ٸ� ��ɾ�� �̸��� �ٲ㼭 ���� �𸣱� ������
					hm.put(colName, rs.getString(colName)); //�÷��� �ִ� �����͸� �ϳ��� �������� �ݺ���
				}
				list.add(hm); //�޾ƿ� ���� �����ϴ°�
			}
			return list;// �����Ͱ� �� �ؽ��� �����ͷ� �����ȰŸ� ���� ����Ʈ ��������� ����
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
	}
}
