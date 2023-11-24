package exception;

//try-with-resource문을 사용했을 때 반드시 close()가 실행되도록 만들어주는 클래스
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {	// close 메서드 구현
		// TODO Auto-generated method stub
		System.out.println("리소스가 close( ) 되었습니다");
	}

}
