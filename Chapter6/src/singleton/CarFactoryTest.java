package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//싱글톤 패턴으로 클래스 구현하기
		//자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는
		//제작될 때마다 고유 번호가 부여됩니다. 자동차 번호는 10001부터 시작되어 자동차가 생성될 때마다 1씩 증가
		//이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 만들어 보세요.
		
		CarFactory factory = CarFactory.getInstance(); //싱글톤 패턴
		Car mySonata = factory.createCar(); // 메서드에서 Car 실행
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum()); //10001출력
		System.out.println(yourSonata.getCarNum()); //10002출력
	}

}
