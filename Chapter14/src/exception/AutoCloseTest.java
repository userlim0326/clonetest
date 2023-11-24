package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try-with-resource : try(close() 실행해야할 인스턴스 선언 코드)
		try (AutoCloseObj obj = new AutoCloseObj()) { // AutoCloseObj obj = new AutoCloseobj() >사용할 리소스 선언
			throw new ArrayIndexOutOfBoundsException(); // 강제 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("예외 부분입니다");
		}
		
		AutoCloseObj obj2 = new AutoCloseObj();
		try(obj2) {	// 다른 참조 변수로 다시 선언해야 함
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}

}
