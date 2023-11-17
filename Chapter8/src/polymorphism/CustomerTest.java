package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(1001, "이순신");
		Customer kim = new VIPCustomer(2000, "김유신", 1116);
		Customer gm = new CustomerG(1500, "금사과");
		Customer jang = new CustomerB(0003, "동장혁");
		Customer disco = new CustomerP(9924, "디스코");
		
		
		customerTest(lee, 10000);
		customerTest(kim, 10000);
		customerTest(gm, 10000);
		customerTest(jang, 10000);
		customerTest(disco, 10000);

	}
	public static void customerTest(Customer customer, int price) {
		System.out.println(customer.customerName + "님이 "
							+ customer.calcPrice(price) + "원을"
									+ " 지불하셨습니다.");
		System.out.println(customer.showCustomerInfo());
	}

}
