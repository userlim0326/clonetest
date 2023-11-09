package card;

public class PersonCard {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			Person lim = new Person();
			System.out.println("사원 번호 : " + lim.yourID + " ,"
							+ " 카드 번호 : " + lim.yourIDC);
		}
	}

}
