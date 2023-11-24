package lambda;

public class TestMyNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스형 max변수에 대입
		System.out.println(max.getMax(10, 20));
		// 자료형 생략하기 : 조건에 상관없이 생략 가능
		// 매개변수 괄호 생략하기 : 매개변수가 하나라면 괄호 생략 가능
		// 중괄호 생략하기 : 실행문이 한 문장이라면 중괄호 생략 가능
		// return 생략하기 : 구현부분이 return문 하나라면 return 생략 가능
	}
	public int getMax(int x, int y) {
		return x>=y ? x : y; //람다식을 쓰려면 함수형 인터페이스(현재 :  MyNumber인터페이스)를 만들어 놔야함.
	}

}
