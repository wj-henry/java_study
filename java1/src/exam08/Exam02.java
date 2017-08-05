package exam08;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam02 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>(); //해쉬맵 사용 이유 = 내가 키값을 정해줄 수 있기 때문에, 키와 벨류로 구성
		hm.put("key", 3);
		
		ArrayList list=new ArrayList();
		list.add(hm);
	}
}
