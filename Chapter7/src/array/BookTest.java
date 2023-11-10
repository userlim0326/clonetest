package array;

class Book { // 이렇게 하지 않고 Book class파일을 만들어서 하는걸 권장 이건 편의상 하는거임
	private String bookName; // private로 만들어서 getter&setter 생성해야함
	private String bookAuthor;
	
	public Book () {
		bookName = "이름없음";		//>아래 new 생성자들 실행결과가 null, null >> 이름없음, 저자없음
		bookAuthor = "저자없음";
	}

	public Book(String bookName, String bookAuthor) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public void showInfo() {
		System.out.println(bookName + "," + bookAuthor);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.showInfo(); // >> null, null >>이름없음, 저자없음
		
		
		//객체 배열 선언 : 실제로 생성자를 불러서 인스턴스를 만들지 않음
		Book[] books = new Book[5];
		//반드시 직접적으로 아래와 같이 new 생성자()를 실행시켜야 객체 사용 가능
		//>> 위에서 선언한게 없으면 5개 다 null, null
//ex)		public Book () {
//			bookName = "이름없음";
//			bookAuthor = "저자없음";
//		}
//	아래 new 생성자들 실행결과가 null, null >> 이름없음, 저자없음 으로 바뀜
//		books[0] = new Book(); >> 이름없음, 저자없음
//		books[1] = new Book();
//		books[2] = new Book();
//		books[3] = new Book();
//		books[4] = new Book();
		
		books[0] = new Book("태백산맥","조정래"); 
		books[1] = new Book("데미안","헤르만 헤세");
		books[2] = new Book("어덯게 살 것인가","유시민");
		books[3] = new Book("토지","박경리");
		books[4] = new Book("어린왕자","생택쥐페리");
				
		for(int i = 0; i<books.length; i++) {
			books[i].showInfo();
		}
	}

}
