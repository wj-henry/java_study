package exam09;

public class Cart {
		
	public int speed = 0;
	public String name;

	public Cart(int speed, String name) {
			this.speed = speed;
			this.name = name;
		}

	public void goCart() {
			System.out.println(this.name + "��(��) �ٱ� ������");
		}

	public void runningCart() {
			System.out.println(this.name + "��(��) �ٴ� ����");
		}

	public void endCart() {
		System.out.println(this.name + "��(��) ������� �����Ԥ�");
	}
}
