package exam08;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam02 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>(); //�ؽ��� ��� ���� = ���� Ű���� ������ �� �ֱ� ������, Ű�� ������ ����
		hm.put("key", 3);
		
		ArrayList list=new ArrayList();
		list.add(hm);
	}
}
