package answer1;

public class Customer {
	public String name;
	public int money;

	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void takeStarCafe(StarCafe cafe, int price) {
		cafe.takeCoffee(price); //takecoffee메서드를 각 카페 클래스에 넣어야 오류가 안생김.
		money -= price; // money - price를 다시 money에 저장하는 복합연산자
	}

	public void takeBeanCafe(BeanCafe cafe, int price) {
		cafe.takeCoffee(price);
		money -= price;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
