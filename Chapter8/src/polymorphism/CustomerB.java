package polymorphism;

public class CustomerB extends Customer { // 부모(Customer)에게서 상속

	public CustomerB(int customerID, String customerName) {
		super(customerID, customerName); // super로
								// 자식(하위)클래스에서 부모(상위)클래스에 접근.
		customerGrade = "BRONZE";	// CustomerB 		Customer
		bonusRatio = 0;
	}

	

}
