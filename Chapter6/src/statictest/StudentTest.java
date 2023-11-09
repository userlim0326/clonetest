package statictest;

public class StudentTest {
	//지역(로컬) 변수 : 메서드의 안에서 만들어진 변수로 메서드 밖에서는 사용할 수 없음.
	//멤버(인스턴스) 변수 : 클래스 안에서 만들어진 변수로 인스턴스를 생성하여 클래스 밖에서 사용할 수 있음.
	//스태틱(정적) 변수 : static 으로 선언된 변수로 클래스 이름을 사용하여 어디서든 사용이 가능하고
						//프로그램이 실행될 때 생성되어 단 하나의 값만을 공유한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		System.out.println(lee.serialNum); //int.serialNum이 1000으로 설정되어서 1000
		lee.serialNum++;
		
		Student kim = new Student();
		System.out.println(kim.serialNum);
		kim.serialNum++;
		
		System.out.println(Student.serialNum);//class Student를 직접적으로 부른것 >>이 방식을 권유
		Student.showInfo2(); //Student 의 public static void 이하 showInfo(){}를 적용
	}

}
