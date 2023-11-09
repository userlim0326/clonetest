package cooperation;

public class Taxi {
	public int taxiNumber;
	public int passengerCount;
	public int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) { //take 메서드 만들기
		this.money += money;// this.money >> public int money
							// += money >> int money
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println("택시 " + taxiNumber+"번의 승객은 "+passengerCount
				+"명이고, 수입은 " + money + "원 입니다.");	
	}
}
