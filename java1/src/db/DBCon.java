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
			Class.forName(driver); //=중급수준인 리플렉션 활용
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
		con = DriverManager.getConnection(url, id, pwd); //con에다 접속정보를 넣는거
	}
	
	public void printListFromTable(String sql) {
		List<HashMap<String, String>> list = getListFromTable(sql); // 밑에서 생성된 리스트값이 여기로 옴, 컬럼 값을 담을땐 해쉬맵(랜덤하게 나열), 로우 값을 담을땐 어레이리스트(순서대로 출력하니까)
		if(list!=null) {
			for(HashMap<String, String> hm : list) { //for each문, 자동으로 반복되게 해주는 반복문
				System.out.println(hm);
			}
		}
	}
	public List<HashMap<String, String>> getListFromTable(String sql){
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql); //하이디SQL에서 입력창 만드는거와 같음
			ResultSet rs = ps.executeQuery();//하이디SQL에서 쿼리넣고 실행하는거와 같음, 메타데이타와 데이터를 갖고잇음
			ResultSetMetaData rsmd = rs.getMetaData();  //메타데이타=이게 무슨 데이타다라고 기준을 말해주는거, 항목 이름
			int maxNum = rsmd.getColumnCount();//getColumnCount=컬럼 수를 세는거, 49행까지는 메타데이터 값을 넣는것들
			List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();//while문보다 앞에 잇는이유=반복문이 돌때마다 새로운 값이 입력되는걸 막기위해
			while(rs.next()) { // rs.next()=다음행으로 넘어가는거, 값이 잇어야 트루값 전달
				HashMap<String, String> hm = new HashMap<String, String>();
				for(int i=1;i<=maxNum;i++) { //컬럼개수(maxnum)와 작거나 같을때까지
					String colName = rsmd.getColumnLabel(i); // getColumnLabel= 컬럼 이름(=uiname, uinum 등등)을 가져오는거, 데이터베이스 항목에 이름이 있는데 다른 명령어로 이름을 바꿔서 할지 모르기 때문에
					hm.put(colName, rs.getString(colName)); //컬럼에 있는 데이터를 하나씩 가져오는 반복문
				}
				list.add(hm); //받아온 값을 저장하는거
			}
			return list;// 데이터가 들어간 해쉬맵 데이터로 구성된거를 위에 리스트 써놓은곳에 리턴
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
	}
}
