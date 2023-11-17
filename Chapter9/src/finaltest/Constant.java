package finaltest;

public class Constant {
	int num = 10;
	final int NUM = 100; //final에서 초기화한 변수는 변경 불가
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 200; //위 각주를 토대로 오류 발생
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
