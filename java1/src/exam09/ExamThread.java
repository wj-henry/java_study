package exam09;

import java.util.Random;

public class ExamThread extends Thread { // 쓰레드: 실행하는거에는 순서가 있는데 실행되는데에는 순서가 없다, 실행될때마다 결과 순서가 달라진다

	int threadid;

	public ExamThread(int threadid) {
		this.threadid = threadid;
	}

	public void run() {
		System.out.println("난" + this.threadid + " ID 쓰레드의 시작점임");
		try {
			int time = (int) (Math.random() * 3000) + 1;
			Thread.sleep(time); // 1000ms= 1초
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("난" + this.threadid + " ID 쓰레드의 종료점임");

	}

	public static void main(String[] args) {
		System.out.println("내가 이 프로그램의 시작점임ㅋ");
		ExamThread eh1 = new ExamThread(1);
		ExamThread eh2 = new ExamThread(2);
		ExamThread eh3 = new ExamThread(3);
		ExamThread eh4 = new ExamThread(4);
		ExamThread eh5 = new ExamThread(5);
		ExamThread eh6 = new ExamThread(6);
		ExamThread eh7 = new ExamThread(7);
		ExamThread eh8 = new ExamThread(8);
		ExamThread eh9 = new ExamThread(9);
		ExamThread eh10 = new ExamThread(10);
		eh1.start();
		eh2.start();
		eh3.start();
		eh4.start();
		eh5.start();
		eh6.start();
		eh7.start();
		eh8.start();
		eh9.start();
		eh10.start();
		System.out.println("내가 이 프로그램의 종료점임ㅋ");
	}
}
