package exam09;

public class CartGame extends Thread{

	public Cart c;

	public CartGame(Cart c) {
		this.c = c;
	}

	public void run() {
		c.goCart();
		try {
			Thread.sleep(c.speed);
			c.runningCart();
		} catch (Exception e) {
			e.printStackTrace();
		}
		c.endCart();
	}

	public static void main(String[] args) {
		String[] cartNames = { "슈퍼스타(카트1)", "오늘밤주인공은", "나야나", "내마음속에","저장" };
		for (int i = 0; i < cartNames.length; i++) {
			int speed = (int) (Math.random() * 3000) + 1000;
			Cart c = new Cart(speed, cartNames[i]);
			CartGame cg = new CartGame(c);
			cg.start();
		}
	}
}
