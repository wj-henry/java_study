package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "박경훈,25,서울/";
		data += "김경훈,37,경기/";
		data += "이경훈,31,경기/";
		data += "민경훈,22,경기";
		String[] datas = data.split("/");
		ArrayList<HashMap> dataList=new ArrayList<HashMap>();

		for (int i = 0; i < datas.length; i++) {
			String[] inDatas=datas[i].split(",");
			HashMap<String, String> hm=new HashMap<String, String>();//hashmap은 순서가 없음, 출력하는 순서는 내맘대로 정할 수 잇음
			for(int j=0;j<inDatas.length;j++) {
				if(j==0) {
					hm.put("이름", inDatas[j]);
				} else if(j==1) {
					hm.put("나이", inDatas[j]);
				} else if(j==2) {
					hm.put("주소", inDatas[j]);
				}
			dataList.add(hm);
			}
		}
		for(HashMap hm : dataList) {   //for 반복문을 축약한거
			System.out.println("주소"+hm.get("주소"));
			System.out.println("나이"+hm.get("나이"));
			System.out.println("이름"+hm.get("이름"));
		}
	}
}
