package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> { //class{} >  BinaryOperator를 구현한 클래스 정의

	@Override
	public String apply(String s1, String s2) { //public(){} > reduce() 메서드가 호출될 때 불리는 메서드, 두 문자열 길이 비교
		// TODO Auto-generated method stub
		if (s1.getBytes().length >= s2.getBytes().length) {

			return s1;
		} else {
			return s2;
		}
	}

}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = { "안녕하세요~~~", "hello", "Good morning", "반갑습니다^^" };
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> { // 람다식 직접 구현하는 방법
			//	^ 요소 개수만큼 반복해서 호출하고 결과적으로 가장 긴 문자열을 반환함
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();// BinaryOperator를 구현한 클래스 사용
		System.out.println(str);
	}

}
