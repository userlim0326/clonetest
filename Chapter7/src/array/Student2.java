package array;
//student클래스를 만들고 멤버 변수로 studentID, studentName을 선언합니다.
		// studentArray배열에 1001,Thomas 1002,James 1003,Edward를
		// 저장하고 출력하는 프로그램을 만들어 보세요.
		//---출력결과---
		// 1001, Thomas
		// 1002, James
		// 1003, Edward

public class Student2 {
	//1. student 클래스를 만들고 멤버 변수로 studentID, studentName을 선언합니다. >>현재 패키지에 Student가class가 이미 있어서 Student2로 선언
	private int studentID;
	private String studentName;
	
	public Student2() {
		studentID = 1000; //>> 선언된 값이 없을때 기본값
		studentName = "오류";
	}
	
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println(studentID + "," + studentName);
	}
}
