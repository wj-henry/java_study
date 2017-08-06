package exam09;

public class StaticExam {

	static int publicNum=0;
	int privateNum=0;
	
	public static void main(String[] args) {
		StaticExam se=new StaticExam();
		se.publicNum=1;
		se.privateNum=1;
		System.out.println(se.publicNum);
		System.out.println(se.privateNum);
		
		StaticExam se2=new StaticExam();
		se2.publicNum=2;
		se2.privateNum=2;
		System.out.println(se.publicNum); // 출력하면 publicnum은 2로 나오고 privatenum은 1로 나옴, 스태틱은 메모리 공간을 무조건 1개만 만들기 때문에 바꾸는대로 게속 바뀜 
		System.out.println(se.privateNum);
	}
}
