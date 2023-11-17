package inheritance;

public class VIPCustomer extends Customer { //상속 : 상속받는 클래스 뒤에 extends 뒤에 상속하는 부모 클래스 설정
//	private int customerID;	//고객 아이디
//	private String customerName; // 고객 이름
//	private String customerGrade; // 고객 등급		위처럼
											//  상속부모 class내에 private으로 되어있었으면
//	int bonusPoint; // 보너스 포인트(적립금)			상속받았어도 customerGrade에
//	double bonusRatio; // 적립 비율				오류 발생함
	
	public int agentID; // VIP고객 담당 상담원
	double saleRatio; // 할인율
	
	
	public VIPCustomer() {
		//super : 자식(하위)클래스에서 부모(상위)클래스에 접근할 때 사용한다.
//		super(); // super를 이용해 생성자 사용 >> ctrl + super 클릭시Public Customer로 이동하게됨.
//		System.out.println(super.customerID); //super를 이용해 멤버변수 사용
//		super.showCustomerInfo(); //super를 이용해 메서드 사용
		
		//상속받은 부모 클래스의 생성자는 반드시 실행되어야함.
		//기본 생성자가 없는 경우 직접 super를 이용해 생성자를 실행해야한다.
		//예) 부모 클래스 생성자 public Parent(int age, String name) >> super(50, "이순신")
		super(0, "이름없음");
		customerGrade = "VIP";	//
		bonusRatio = 0.05; //결제시 원가의 5%를 보너스 포인트로 적립
		saleRatio = 0.1;	//10% 할인
		System.out.println("VIPCustomer() 생성자 실행");
	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";	
		bonusRatio = 0.05; 
		saleRatio = 0.1;	
	}
	
	
	// 메서드 오버라이드(메서드 재정의
	// 상위 클래스에 존재하는 메서드를 하위 클래스에 수정하여 사용할 수 있도록 하는 기능
	
	@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price*saleRatio);
		}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio); //10% 할인 적용된 가격 출력
//	}
	
	// 메서드 오버로드
	// 메소드를 같은 이름으로 여러 개 만들 수 있도록 하는 기능
	// 매개변수의 개수와 자료형이 다를 경우에 다른 메서드로 인식하게 됩니다.
	public void showInfo() {}	//기본생성자
	public void showInfo(int i) {}	//매개변수의 개수와 자료형이 같으면 오류
	public void showInfo(int i, int j) {} //하나라도 다르면 다른 메서드로 인식
	public void showInfo(String str) {}
	public void showInfo(String str, String str2) {}
	public void showInfo(String str, int i2) {}
	//이렇게 해놓으면 main에서 System.out.pritnln실행시 ()에 들어갈 수 있는 자료형이 많아짐
	
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은" + customerGrade
//				+ "이며, 보너스 포인트는" + bonusPoint + " 입니다.";
//		
//	}
}



