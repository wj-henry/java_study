package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam { // List - ���� ���� �ʿ����, ������ Ÿ�� �ٵ�, but �ڷ����� �ȵ�

	public static void main(String[] args) {
		// ArrayList ġ�� ��Ʈ�� ����Ʈ O ������ ����Ʈ, add=���� ����, get=�迭 �� �� ���

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			a1.add(i);
		}

		for (int i = 0; i < a1.size(); i++) { // ����� �� ����������.size
			System.out.println(a1.get(i));
		}

		HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("�ȳ�", "nihao");
			
			System.out.println(hm.get(0));
	}
}
