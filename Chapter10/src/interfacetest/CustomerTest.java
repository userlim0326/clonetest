package interfacetest;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.sell();
		customer.buy();
		
		Buy buy = customer;
		buy.buy();
//		buy.sell(); //Buy에는 buy라는 메서드 하나만 존재해서 불가능
		
		Sell sell = customer;
		sell.sell();
//		sell.buy(); //sell에는 sell이라는 메서드 하나만 존재해서 불가능
		
		customer.order(); //default 메서드가 중복될 경우 상속을 받는 자식 클래스에서 구현해야 실행가능.
		buy.order();		// 구현함 >>> Customer 고객 주문 x 3
		sell.order();
	}

}
