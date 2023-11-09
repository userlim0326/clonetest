package card;

public class Person {
	public static int serialNum=0;
	public int yourID;
	public String yourName;
	public int yourIDC;
	
	public Person() {
		++serialNum;
		yourID = serialNum;
		yourIDC = yourID;
	}
}
