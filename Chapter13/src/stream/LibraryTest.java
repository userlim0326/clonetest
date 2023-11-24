package stream;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice()  {
		return price;
	}
}

public class LibraryTest {
	public static void main(String[]args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		
		//스트림 생성하고 출력하기
		
		System.out.println("= 모든 책의 가격 합 =");
		
		System.out.println(bookList.stream().mapToInt(b -> b.getPrice()).sum());
		
		
//		int total = bookList.stream().mapToInt(b -> b.getPrice()).sum();
//		System.out.println(" 모든 책의 가격 합은 " + total + "입니다");
		
		System.out.println(" =책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력=");
		
		bookList.stream()
		.filter(b -> b.getPrice() >= 20000)
		.map(b -> b.getName())
		.forEach(bn -> System.out.println(bn));
		
		//오름차순 출력 sorted()
		
		//내림차순 출력 : 익명 내부 클래스: sorted(new Comparator<String>() {
		//									public int compare(String o1, String o2) {
		//									return o1.compareTo(o2)*-1;
		//								};
		//							}).forEach(bn -> System.out.println(bn));
		
		//람다식 내림차순
		// .sorted((o1, o2) -> o1.compareTo(o2)*-1)
	}
}
