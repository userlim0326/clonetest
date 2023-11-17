package polymorphism;

public class VIPCustomer extends Customer { //부모(Customer)에게서 상속
	private int agentID;
	public double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //super로
										//자식(하위)클래스에서 부모(상위)클래스에 접근.
		customerGrade = "VIP";			//VIPCustomer		Customer
		bonusRatio = 0.05; //5%적립
		saleRatio = 0.1;	// 10% 할인
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	@Override //이미 오버라이드가 된 내용; 수동으로 @Override적었는데도 오류 없음
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 번호는 " + agentID +
									" 입니다.";
	}
	public int getAgentID() {
		return agentID;
	}
}
