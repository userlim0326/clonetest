package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream(); // 스트림 생성; 스트림을 변수로 만들어 사용하더라도 재사용이 불가능함.
		stream.forEach(s -> System.out.print(s + " ")); // 배열의 요소를 하나씩 출력
		System.out.println();
//		stream.forEach(s -> System.out.print(s + " ")); //스트림은 한번 최종연산이 실행되면 재사용 불가하여 오류발생.
//		System.out.println();

		sList.stream().sorted().forEach(s -> System.out.println(s));
		sList.stream().sorted().forEach(s -> System.out.println(s));
		for(String str : sList) {
			System.out.println(str);
		}
		// sList.stream() > 스트림 새로 생성, sorted() > 정렬,
		// forEach(s->System.out.println(s) > 요소를 하나씩 꺼내어 출력
	}

}
