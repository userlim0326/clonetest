package array;				//객체가 저장하는것은 메모리주소이다

import java.util.Arrays;

public class BookCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books1 = new Book[3];
		books1[0] = new Book("태백산맥", "조정래");
		books1[1] = new Book("데미안", "헤르만 헤세");
		books1[2] = new Book("어떻게 살 것인가", "유시민");

		Book[] books2 = new Book[3];
		
		//객체의 메모리 주소만 복사 : 얕은 복사 >>같은 메모리주소를 복사
		System.arraycopy(books1, 0, books2, 0, 3); // > books1의 0번째값 부터 books2의 0번째값에 3개까지(2번째값까지) 복사
		System.out.println("----------변경 전-----------");
		for(int i = 0; i < books2.length; i++) { // 반복문은 객체 확인 가능
			books1[i].showInfo();
			books2[i].showInfo();
		}

		
		System.out.println(Arrays.toString(books1)); // 객체의 경우 메모리 주소 반환		
		System.out.println(Arrays.toString(books2)); // 객체의 내용(멤버변수) 확인 불가 >> 메모리주소가 나옴 >> 얇은 복사를 해서 현재 메모리주소가 같음
		
		System.out.println("----------변경 후-----------");
		
		books2[0].setBookName("토지");
		books2[0].setBookAuthor("박경리");
		for(int i = 0; i < books2.length; i++) { // 반복문은 객체 확인 가능
			books1[i].showInfo();
			books2[i].showInfo();
		}

	}

}
