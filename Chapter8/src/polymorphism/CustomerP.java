package polymorphism;

public class CustomerP extends Customer {
	private double saleRatio;
	
	public CustomerP(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "PLATINUM";
		bonusRatio = 0.05;
		saleRatio = 0.075;
	}
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio; 
		return price - (int)(price * saleRatio);
	}
}
