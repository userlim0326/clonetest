//package innerclass;
//
//class Outer2 {
//	int outNum = 100;
//
//	InnerTest getRunnable(int i) {
//
////	return new Runnable() {
////		@Override 
////		public void run() {
////			//num = 200;
////			//i= 10;
////			System.out.println(i);
////			System.out.println(num);
////		}
////	};
////	
//		return new InnerTest() {
//			int outNum = 100;
//
//			@Override
//			public void run() {
//				System.out.println("Runnable이 구현된 익명 클래스 변수");
//			}
//		};
//
//	}
//	InnerTest runner = new InnerTest() {
//		@Override
//		public void run() {
//			System.out.println("Runnable이 구현된 익명 클래스 변수");
//		}
//	};
//}
//
//public class AnonymousInnerTest {
//	public static void main(String[]args) {
//		Outer2 out = new Outer2();
//		InnerTest runnerble = out.getRunnable(10);
//		runnerble.run();
//		out.runner.run();
//	}
//}
