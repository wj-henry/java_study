package exam08;

import java.lang.reflect.Method;

public class Reflection { // 리플렉션 

	public static void main(String[] args) {

		try {
			Class cls=Class.forName("exam08.Exam"); // ""안에 있는 클래스에 있는 모든 것을 cls에 넣어라는거
			//패키지명과 클래스명만 잇어도 싸그리 다 읽고 실행시킬 수 있음
			Method[] m= cls.getDeclaredMethods(); // 모든 함수를 가져와서 배열함수에 넣어라
			for(int i=0;i<m.length;i++) {
				System.out.println(m[i].toString());
			}
			Exam e=(Exam)cls.newInstance(); //newInstance: Exam e=new Exam(); 대체해주는거
			
			Method pMethod=cls.getMethod("print", String.class);
			pMethod.invoke(e, "나나나");
			// Exam e=new Exam();
			// e.print("나나나"); 와 동일한건데 리플렉션한거
			
		}catch(Exception ec) {
			System.out.println(ec);
		}
	}
}
