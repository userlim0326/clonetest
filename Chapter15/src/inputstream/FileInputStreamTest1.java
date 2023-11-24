package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			// 폴더 및 파일의 상대 위치
			// 최상위 폴더 : 프로젝트 이름으로 되어있는 폴더
			// / : 폴더의 하위 폴더로 이동
			// ./ : 현재 파일이 있는 위치
			// ../ : 현재 파일의 한단계 상위 폴더
			// 절대경로 : 전체 경로를 적는 것을 말함.
			// 상대경로 : 최상위 폴더를 기준으로 파일 경로를 적는 것을 말함.
			fis = new FileInputStream("input.txt"); // input.txt 파일 입력 스트림 생성
//			System.out.println(fis.read()); // 1바이트 읽기
//			System.out.println(fis.read()); // 1바이트 읽기
//			System.out.println(fis.read()); // 1바이트 읽기
			int i;
			while((i = fis.read())!= -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {

			try {
				fis.close(); // 열린 스트림은 finally 블록에서 닫음
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) { // 스트림이 null인 경우
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}