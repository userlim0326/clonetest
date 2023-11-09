package singleton;

//1.싱글톤 패턴으로 클래스 구현하기
//2.자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는
//제작될 때마다 고유 번호가 부여됩니다. 자동차 번호는 10001부터 시작되어 자동차가 생성될 때마다 1씩 증가
//이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 만들어 보세요.
//CarFactoryTest 코드가 수행될 수 있도록 구현해 봅시다.
public class CarFactory {
//	public static in serialNum = 10000;
	//1.
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	//2.
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
//	public static int serialNum = 10000;
//
//	private static CarFactory instance = new CarFactory();
//
//	private CarFactory() {
//	}
//
//	public static CarFactory getInstance() {
//		if (instance == null) {
//			instance = new CarFactory();
//		}
//		return instance;
//	}
//
// public Car createCar() {
//		serialNum++;
//		Car car = new Car(serialNum);
//		return car;
//	}