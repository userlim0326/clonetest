package finaltest;

public final class Student { //final class는 다른class에서 상속 불가
	int studentID;
	String studentName;
	
	public void showInfo() {
		System.out.println(studentID + ", " + studentName);
	}
}
