package array;

public class Book { // 이렇게 하지 않고 Book class파일을 만들어서 하는걸 권장 이건 편의상 하는거임
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
