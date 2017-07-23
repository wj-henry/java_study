package exam05;

public class StringExam {

	String str="123";
		
	public static void main(String[] args) {
		StringExam se=new StringExam();
		String str2="123";
		String str3=new String("123");
		String str4="123";
		
		System.out.println(se.str==str2);  // ==은 메모리 주소를 비교하는거, equals는 값을 비교하는거
		System.out.println(se.str==str3);
		System.out.println(se.str==str4);
		System.out.println(str2==str4);
	}
}
