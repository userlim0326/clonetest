package answer2;

public class Card {
	public static int serialNum = 20231109;
	public int cardNum;
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	public void showInfo() {
		System.out.println(cardNum);
	}
}
