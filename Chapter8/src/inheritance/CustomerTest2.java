package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(1001, "이순신");
		System.out.println("상품의 가격은 " + lee.calcPrice(10000) + " 원 입니다.");
		// >> 10000원
		VIPCustomer kim = new VIPCustomer(2000, "김유신");
		System.out.println("상품의 가격은 " + kim.calcPrice(10000) +" 원 입니다.");
		// >> 9000원
		
		//묵시적 class 형 변환
		Customer ahn = new VIPCustomer(10003, "안");
//		System.out.println(ahn.agentID);
//		//agentID는 부모클래스인 Customer에는 존재하지 않기때문에 에러 발생
//		
//		System.out.println(ahn.getAgentID());
		// >> 하위 클래스를 상위 클래스로 형 변환 했을 경우
		//		하위 클래스에만 존재하는 멤버변수나 메서드는 사용할 수 없음
		
		// 상위 클래스 Customer에 존재하는 멤버 변수, 메서드는 사용가능
		System.out.println(ahn.customerGrade);
		System.out.println(ahn.customerID);
		System.out.println(ahn.getCustomerName());
		
		
		// 가상 메서드
		//재정의(오버라이드)된 메서드는 하위 클래스의 메서드가 실행된다.
		System.out.println("상품의 가격은 " + ahn.calcPrice(10000) + " 원 입니다.");
		//ctrl+클릭으로 calcPrice 누를시 Customer메서드인
		//(Customer public int clacPrice)로 가지만
		//실행 결과는 VIPCustomer에 오버라이드된 메서드인
		//(VIPCustomer public int clacPrice)로 적용되어
		//Customer메서드가 실행하지 않고 VIPCustomer메서드에 있는 할인이 적용됨.
		// >> 9000원
		
		
		
	}

}
