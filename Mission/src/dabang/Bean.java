package dabang;

public class Bean {
	public int money;
	public String bean;

	public Bean(int money) {
		this.money = money;
	}

	public void take(String bean) {
		bean = "라테";

	}

	public void showInfo() {
		System.out.println("콩다방의 " + bean + "가 결제됩니다. 가격은 " + money + "입니다.");
	}

}
