package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			int[] arr = new int[5];
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println(e); // 예외 클래스의 toString() 메서드호출
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			if(fis != null) {
				try {
					fis.close(); //파일 입력 스트림 닫기 close()메서드 호출
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally : 에러가 나던 나지않던 항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");	//정상 출력
	}
}
