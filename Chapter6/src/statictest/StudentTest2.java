package statictest;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		System.out.println(lee.studentID);
		
		Student kim = new Student();
		System.out.println(kim.studentID);
		
		
		for(int i = 0; i <100; i++) {
			Student ahn = new Student();
			System.out.println(ahn.studentID);
//			public Student() {
//				serialNum++;
//				studentID = serialNum;
//			}	이로 인해 studentID가 단순 반복만해도 1씩 늘어남(serialNum++;)
		}
	}
}

