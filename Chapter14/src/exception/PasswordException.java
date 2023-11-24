package exception;

public class PasswordException {
	// 예외상황 : 비번이 null 인 경우, 문자열로만이루어진경우, 5자 미만인 경우
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordFormatException {
		// 비번이 null 인 경우
		if (password == null) {
			throw new PasswordFormatException("비밀번호는 null일 수 없습니다.");
			// 문자열로만이루어진경우
		} else if (password.matches("[a-zA-Z]+")) { //소문자 a~z, 대문자 A~Z사용
			throw new PasswordFormatException("비밀번호는 영어와 숫자로 쓰세요.");
			// 5자 미만인 경우
		} else if (password.length() < 5) {
			throw new PasswordFormatException("비밀번호는 5자 이상으로 쓰세요.");
		}
		this.password = password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordException ptest = new PasswordException();

		String password = null; // 비밀전호 값이 null 인 경우
		try {
			ptest.setPassword(password);
		} catch (PasswordFormatException e) {
			System.out.println(e.getMessage());
		}

		password = "abcdefg"; // 비밀전호가 문자열로만 이루어진 경우
		try {
			ptest.setPassword(password);
		} catch (PasswordFormatException e) {
			System.out.println(e.getMessage());
		}

		password = "1234"; // 비밀번호 값이 5자 미만인 경우
		try {
			ptest.setPassword(password);
		} catch (PasswordFormatException e) {
			System.out.println(e.getMessage());
		}

//		String pass = new String("abc");
//		System.out.println(pass.matches("[a-zA-Z]+")); //true
//		
//		
//		String pass2 = new String("abc1");
//		System.out.println(pass2.matches("[a-zA-Z]+")); //false

	}

}
