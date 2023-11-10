package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// student클래스를 만들고 멤버 변수로 studentID, studentName을 선언합니다.
		// studentArray배열에 1001,Thomas 1002,James 1003,Edward를
		// 저장하고 출력하는 프로그램을 만들어 보세요.
		//---출력결과---
		// 1001,Thomas
		// 1002,James
		// 1003,Edward
		
		
		
		//studentArray 객체 배열 선언
		// 자료형 배열이름[] = new 자료형[배열의 갯수];	>> 자료형 : Student2, 배열이름 : studentArray, new 자료형[배열의 갯수];
		Student2 [] studentArray = new Student2[3]; 
//		Student2 studentArray[] = new Student2[3];
		
		// 객체를 사용하기 위해 직접적으로 new 생성자()를 실행 >> public Student2(int studentID, String studentName)
		studentArray[0] = new Student2(1001, "Thomas");
		studentArray[1] = new Student2(1002, "James");
		studentArray[2] = new Student2(1003, "Edward");
//		System.out.println(studentArray.length); // 위의 Student2 studentArray[] = new Student2[3]; 선언 >> 3
		
		System.out.println("---출력결과---");
		for(int i = 0; i<studentArray.length; i++) { // int i = 0; i < 3; i++ >> length로 변수값을 바꿀 때 직접적으로 숫자 바꾸는 횟수를 줄여줌.
			studentArray[i].showInfo();
//	 >>		Student2 class에서 선언한 showInfo
//			public void showInfo() {
//				System.out.println(studentID + "," + studentName); >> studentID,studentName을 i가 3이 되기 전까지 출력
//			}
		}
	}

}
