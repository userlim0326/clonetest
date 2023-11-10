package array;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"Java","Android","C","Python","HTML"};

		
		
//		for(배열의 자료형 변수이름 : 배열이름) {
//			실행문;
//		}
		for(String str : strArr) { //	for(String배열의 자료형 str변수이름 : strArr배열이름) { 
			System.out.println(str);//		System.out.println(str);실행문;
		}							//	}
		
		Book[] books = new Book[3];	//	클래스(자료형(객체))[] 배열이름 = new 클래스[배열의 갯수]; (객체 배열 선언)
		books[0] = new Book("책이름1","저자1");
		books[1] = new Book("책이름2","저자2");
		books[2] = new Book("책이름3","저자3");
		for(Book book : books) {	// for(클래스(자료형(객체)) 배열이름(복사 대상) : 배열이름(복사 출처) {
			book.showInfo();		//		배열이름(복사 대상).showInfo();
		}							// }

	}

}
