package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			// num+=10;
			System.out.println("InstaticClass inNum = " + inNum + "()");
			System.out.println("InstaticClass sInNum = " + sInNum + "()");
			System.out.println("OutClass sNum = " + sNum + "()");

		}

		static void sTest() {
			// num += 10;
			// inNUm += 10;
			System.out.println("OutClas sNum = " + sNum + "()");
			System.out.println("OutClas sNum = " + sNum + "()");

		}
	}
}

public class InnerTest {
	public static void man(String[] args) {
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
