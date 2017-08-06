package exam09;

import java.util.Random;

public class ExamThread extends Thread { // ������: �����ϴ°ſ��� ������ �ִµ� ����Ǵµ����� ������ ����, ����ɶ����� ��� ������ �޶�����

	int threadid;

	public ExamThread(int threadid) {
		this.threadid = threadid;
	}

	public void run() {
		System.out.println("��" + this.threadid + " ID �������� ��������");
		try {
			int time = (int) (Math.random() * 3000) + 1;
			Thread.sleep(time); // 1000ms= 1��
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��" + this.threadid + " ID �������� ��������");

	}

	public static void main(String[] args) {
		System.out.println("���� �� ���α׷��� �������Ӥ�");
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
		System.out.println("���� �� ���α׷��� �������Ӥ�");
	}
}
