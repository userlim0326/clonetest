package exception;

public class IDFormatException extends Exception {
	public IDFormatException(String message) {	//(String message) >생성자의 매개변수로 예외상황 메시지를 받음
		super(message);
	}
}
