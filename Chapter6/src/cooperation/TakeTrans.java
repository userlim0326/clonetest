package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 택시 클래스 추가
		// 1. Edward 학생이 택시를 타게 되었습니다. 택시 요금은 10000원 입니다.
		// Edward의 소지금 : 15000원
		// 위의 과정을 실행하기 위한 코드를 작성해보세요.
		Student james = new Student("James", 5000);
		Student thomas = new Student("Thomas", 10000);
		Student edward = new Student("Edward", 15000);

		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();

		Subway subwayGreen = new Subway(2);
		thomas.takeSubway(subwayGreen);
		thomas.showInfo();
		subwayGreen.showInfo();

		Taxi taxi4885 = new Taxi(4885);
		edward.takeTaxi(taxi4885);
		edward.showInfo();
		taxi4885.showInfo();
	}

}
