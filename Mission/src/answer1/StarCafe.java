package answer1;

public class StarCafe {
	public String name;
	public int money;
	
	public StarCafe(){
		this.name = "별다방";
	}
	public void takeCoffee(int price) {
		if(price == 4000) {
			System.out.println("별다방에서 아메리카노를 구입했습니다.");
		}
		else if(price == 4800) {
			System.out.println("별다방에서 라떼를 구입했습니다.");
		}
		
		money += price;
	}
	public void showInfo() {
		System.out.println(name + "의 수입은 " + money + "원 입니다.");
	}
}
