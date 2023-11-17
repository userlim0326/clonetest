package interfacetest;

//인터페이스 : 상속과 다형성(하나의 이름으로 여러가지 클래스를 만드는)을 위한 설계도
public interface Calc {
	// 인터페이스에서 선언한 변수는 상수로서 선언되고
	// final을 적어주지 않아도 상수로서 선언이 된다.
	double PI = 3.14;
	int ERROR = -999999999;
	int MAX_VALUE = 99999;
	int MIN_VALUE = 0;
	
	//인터페이스에서 선언한 메서드는 자동적으로 추상(abstract) 메서드로 만들어짐.
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	//디폴트(default) 메서드 : 인터페이스 안에서 추상메서드가 아닌 일반(구현된) 메서드를 사용하고 싶을 때 사용
	// 디폴트 메서드는 재정의(오버라이드) 가능함.
	default void description() {	//>> 일반메서드처럼 사용하면됨. {}구현 가능, ;로 마무리 불가능
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
		myStaticMethod();
	}
	//void description(); >> 이건 추상메서드임 xxx
	//추상 메서드는 내용을 구현하지 않고 ;로 끝남.
	
	
	//정적(static) 메서드 : 인터페이스의 이름으로 인스턴스를 생성하지 않고 부를 수 있는 메서드
	static int total(int [] arr) {
		int total = 0;
		for(int i : arr) {
			total += i; //total에 i를 계속 더함.
		}
		//myMethod(); static은 일반 메서드를 부를 수 없다.
		myStaticMethod(); // >> 일반 메서드가 아니라서 부를 수 있다.
		return total;
	}
	
	//private 메서드 : 인터페이스 안에서만 부를 수 있고, 외부에서는 부를 수 없도록 만드는 접근제어자
	private void myMethod() {
		System.out.println("Calc의 private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("Calc의 private static 메서드 입니다.");
	}
	
}
