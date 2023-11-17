package interfacetest;

// 인터페이스는 상속받을 때 extends가 아닌 implements를 사용해야함.
// 인터페이스는 여러 개를 상속 받을 수 있음
// 인터페이스는 추상클래스, 일반 클래스 둘 다 상속 받을 수 있음.
public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}
