package exam09;

public class Cart {
		
	public int speed = 0;
	public String name;

	public Cart(int speed, String name) {
			this.speed = speed;
			this.name = name;
		}

	public void goCart() {
			System.out.println(this.name + "이(가) 뛰기 시작함");
		}

	public void runningCart() {
			System.out.println(this.name + "이(가) 뛰는 중임");
		}

	public void endCart() {
		System.out.println(this.name + "이(가) 결승점에 도착함ㅋ");
	}
}
