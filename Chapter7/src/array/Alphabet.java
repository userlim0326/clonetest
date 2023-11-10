package array;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 char[][] 안에 알파벳 소문자를
		// 2글자씩 13줄로 출력하는 프로그램을 작성하세요.
		char[][] alphabets = new char[13][2];
		char a = 'a';
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = a;
				a++;
				System.out.print(alphabets[i][j]);
			}
			System.out.println();
		}

	}

}
