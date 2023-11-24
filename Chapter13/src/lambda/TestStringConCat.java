package lambda;

public class TestStringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
			
		//람다식 : StringConCat 인터페이스 사용; 클래스를 구현하지 않는 장점이 있지만
		//							인터페이스에 메서드가 하나가 아니면 오류가 발생함.
		int i = 100;
		StringConCat concat2 = (s, v) -> {
		//	int i = 200; >> 람다식 내부에서 변경하면 오류가 발생함; 변경불가능하기 때문
			System.out.println(s + "," + v);
		};
		concat2.makeString(s1, s2);
		
		
		StringConCat concat3 = new StringConCat() { //익명 개체를 생성하는 람다식
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
//		concat3.makeString(s1, s2);
	}

}
