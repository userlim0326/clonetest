package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			byte[] bs = new byte[26];
			byte a = 'a';
			for(int i=0; i<bs.length; i++) {
				bs[i] = a;
				a++;
			}
			
			fos.write(bs);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("output.txt 파일이 저장되었습니다.");
	}

}
