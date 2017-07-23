package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam { // List - 갯수 정의 필요없음, 데이터 타입 다됨, but 자료형은 안됨

	public static void main(String[] args) {
		// ArrayList 치고 컨트롤 쉬프트 O 눌러서 임포트, add=숫자 삽입, get=배열 내 값 출력

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			a1.add(i);
		}

		for (int i = 0; i < a1.size(); i++) { // 출력할 때 참조변수명.size
			System.out.println(a1.get(i));
		}

		HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("안녕", "nihao");
			
			System.out.println(hm.get(0));
	}
}
