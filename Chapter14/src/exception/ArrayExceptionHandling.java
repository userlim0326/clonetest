package exception;

import java.io.IOException;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일 에러 : 이클립스에서 확인할 수 있는(빨간줄이 뜨는)에러
		int[] arr = new int[5];
//		int [] arr = new int[5]; 같은 이름의 변수를 두번 선언했기 때문에 컴파일 에러 발생
		
		
		// 런타임 에러 : 실행하기 전에는 알 수 없는 에러, 실행 중에 발생하는 에러
//		for (int i = 0; i <= 5; i++) {
//			arr[i] = i;						겉으로 보기엔 에러가 없음
//			System.out.println(arr[i]);
//		}
		
// >>   0
//		1
//		2
//		3
//		4
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//			at exception.ArrayExceptionHandling.main(ArrayExceptionHandling.java:14) > 런타임 에러
		
//		try {
//			예외가 발생할 수 있는 코드 부분
//		} catch(처리할 예외 타입 e) {
//			try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분
//		}
		
		try { // 예외가 발생할 수 있는 코드
			for(int i=0; i <=5; i++) {
				arr[i] = i;					
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) { //try문에서 에러가 발생했을 때 실행되는 코드
			System.out.println(e);
			System.out.println("예외처리 부분");
		} catch(Exception e) {
			System.out.println("IOException 실행");
		}
		System.out.println("프로그램 종료");
	}

}
