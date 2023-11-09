package cooperation;

public class Subway {
	public int lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //take 메서드 만들기
		this.money += money;// this.money >> public int money
							// += money >> int money
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println("지하철 " + lineNumber+"호선의 승객은 "+passengerCount
				+"명이고, 수입은 " + money + "원 입니다.");	
	}
}
