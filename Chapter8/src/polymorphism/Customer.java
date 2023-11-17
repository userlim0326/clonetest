package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;	//멤버변수 설정
	public int bonusPoint;
	public double bonusRatio;
	
	//생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() { //init : 이니셜라이즈 (초기화)
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1% 적립
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}
}
