package polymorphism;

public class CustomerG extends Customer { // 부모(Customer)에게서 상속
	
	public double saleRatio;

	public CustomerG(int customerID, String customerName) {
		super(customerID, customerName); // super로
								// 자식(하위)클래스에서 부모(상위)클래스에 접근.
		customerGrade = "GOLD"; // CustomerG 		Customer
		bonusRatio = 0.05; // 5%적립
		saleRatio = 0.05; // 5% 할인
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

}
