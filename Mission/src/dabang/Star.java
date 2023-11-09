package dabang;

public class Star {
	public int money;
	public String star;

	public Star(int money) {
		this.money = money;
	}

	public void take(String star) {
		star = "아메리카노";
	}

	public void showInfo() {
		System.out.println("별다방의" + star + "가 결제됩니다. 가격은 " + money + "입니다.");
	}

}
