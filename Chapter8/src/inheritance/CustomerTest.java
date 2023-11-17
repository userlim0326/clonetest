package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(1001, "이순신");
//		lee.customerID = 1001;
//		lee.customerName = "이순신";
		System.out.println(lee.showCustomerInfo());
		System.out.println("상품의 가격은 " + lee.calcPrice(10000) + "원 입니다.");
		// 결과: 10000원, 보너스 포인트 100추가
		System.out.println(lee.showCustomerInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.customerID = 2000;
		kim.customerName = "김유신";
		System.out.println(kim.showCustomerInfo());
		System.out.println("상품의 가격은 " + kim.calcPrice(10000) +" 원 입니다.");
		// 결과: 9000원, 보너스 포인트 500추가
		System.out.println(kim.showCustomerInfo());
		
		
		
		
	}

}
