package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {	//두 예외를 메서드가 호출될 때 처리하도록 미룸
		FileInputStream fis = new FileInputStream(fileName);	//FileNotFoundException발생 가능
		Class c = Class.forName(className);				//ClassNotFoundException 발생 가능
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
//		test.loadClass("a.txt", "java.lang.String");  
		// 메서드를 호출할 때 예외를 처리(에러발생); 밑의 두가지 방법 참조
	
	//Surround with try/multi-catch > 여러 예외를 한번에 처리하기
//	try {		생성됨
//		test.loadClass("a.txt", "java.lang.String");
//	} catch (FileNotFoundException | ClassNotFoundException e) {	여러 예외를 한 문장으로 처리함
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//	//Surround with try/catch > 예외 상황마다 처리하기
//	
//	try {	생성됨
//		test.loadClass("a.txt", "java.lang.String");
//	} catch (FileNotFoundException e) {		각 예외 상황마다
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (ClassNotFoundException e) {	다른 방식으로 처리함
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

		try {	
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {		
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 직전");
	}
}

