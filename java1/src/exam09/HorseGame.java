package exam09;

import java.util.ArrayList;
import java.util.List;

public class HorseGame extends Thread {
	public Horse h;

	public HorseGame(Horse h) {
		this.h = h;
	}

	public void run() {
		h.startHorse();
		try {
			Thread.sleep(h.speed);
			h.runningHorse();
		} catch (Exception e) {
			e.printStackTrace();
		}
		h.endHorse();
	}

	public static void main(String[] args) {
		System.out.println("경기가 시자~~~~~~~ㄱ합니다");
		String[] horseNames = { "슈퍼스타", "오늘밤주인공은", "나야나", "내마음속에","저장" };
		List<HorseGame> horseList=new ArrayList<HorseGame>();
		for (int i = 0; i < horseNames.length; i++) {
			int speed = (int) (Math.random() * 3000) + 1000;
			Horse h = new Horse(speed, horseNames[i]);
			HorseGame hg = new HorseGame(h);
			hg.start();
			try {
				hg.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(HorseGame hg: horseList) {
			try {
				hg.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("경기가 끝났습니다");
	}
}
