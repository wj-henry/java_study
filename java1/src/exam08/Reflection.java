package exam08;

import java.lang.reflect.Method;

public class Reflection { // ���÷��� 

	public static void main(String[] args) {

		try {
			Class cls=Class.forName("exam08.Exam"); // ""�ȿ� �ִ� Ŭ������ �ִ� ��� ���� cls�� �־��°�
			//��Ű����� Ŭ������ �վ �α׸� �� �а� �����ų �� ����
			Method[] m= cls.getDeclaredMethods(); // ��� �Լ��� �����ͼ� �迭�Լ��� �־��
			for(int i=0;i<m.length;i++) {
				System.out.println(m[i].toString());
			}
			Exam e=(Exam)cls.newInstance(); //newInstance: Exam e=new Exam(); ��ü���ִ°�
			
			Method pMethod=cls.getMethod("print", String.class);
			pMethod.invoke(e, "������");
			// Exam e=new Exam();
			// e.print("������"); �� �����Ѱǵ� ���÷����Ѱ�
			
		}catch(Exception ec) {
			System.out.println(ec);
		}
	}
}
