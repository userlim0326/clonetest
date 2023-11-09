package statictest;

public class StudentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생마다 각각 다른 학생카드가 발급되며 카드 번호는 학생번호에 100을 더한 값입니다.
		// 학생이 생성될 때마다 자동으로 학생카드의 값도 설정 되도록 만들어 보세요.
		Student lee = new Student();
		System.out.println(lee.studentID + "," + lee.studentIDC);
		
		Student kim = new Student();
		System.out.println(kim.studentID  + "," + kim.studentIDC);
		
		
		for(int i = 0; i <100; i++) {
			Student ahn = new Student();
			System.out.println("학생 번호 : " + ahn.studentID 
							+ " 카드 번호 : " + ahn.studentIDC);
//			public Student() {
//				serialNum++;
//				studentID = serialNum;
//			}	이로 인해 studentID가 단순 반복만해도 1씩 늘어남(serialNum++;)
		}
	}
}

