//package innerclass;
//
//class OutClass {
//	private int num = 10;
//	private static int sNum =20;
//	
//	private InClass inClass;
//	
//	public OutClass() {
//		inClass = new InClass();
//	}
//	
//	class InClass {
//		int inNUm=100;
//		//static int sInNum=200;
//		
//		void inTest() {
//			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
//			System.out.println("OutClass num = " + sNum + "(외부 클래스의 정적 변수)");
//
//		}
//	}
//}
//class Outer {
//	int outNum =100;
//	static int sNum = 200;
//	
//	InnerTest getRunnable(int i) {
//		int num = 100;
//		class MyRunnable implements Runnable {
//			int localNum = 10;
//			
//			@Override 
//			public void run() {
//				System.out.println("i="+i);
//				System.out.println("num="+i);
//				System.out.println("localNum="+localNUm);
//				System.out.println("outNum="+outNum);
//				System.out.println("sNum="+sNum);
//				
//			}
//		}
//		return new MyRunnable();
//	}
//}
//public class LocalInnerTest {
//
//}
