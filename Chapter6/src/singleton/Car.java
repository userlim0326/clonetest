package singleton;

public class Car {
	private static int serialNum = 10000;
//	public String carName;
	public int carNum;
	public Car() {
		++serialNum;
		this.carNum = serialNum;
	}
	public int getCarNum() {
		return carNum;
	}
}
