package cooperation;

public class Bus {
	public int busNumber;
	public int passengerCount;
	public int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //take 메서드 만들기
		this.money += money;// this.money >> public int money
							// += money >> int money
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println("버스 " + busNumber+"번의 승객은 "+passengerCount
				+"명이고, 수입은 " + money + "원 입니다.");	
	}
}
