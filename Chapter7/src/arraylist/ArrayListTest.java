package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <> : generic 제네릭?
		// ArrayList는 배열이지만 새로운 변수를 만들기 때문에 마지막에 ()가 필요함.
		ArrayList<String> strList = new ArrayList<String>();
		//add() : ArrayList에 데이터를 저장하는 메서드
		strList.add("태백산맥");
		strList.add("데미안");
		strList.add("어떻게 살 것인가");
		strList.add("토지");
		strList.add("어린왕자");
		
		//size() : ArrayList에 저장된 데이터의 갯수를 반환하는 메서드
		System.out.println(strList.size());
		
		for (int i = 0; i < strList.size(); i++) {
			//get() : ArrayList의 데이터를 가지고 오는 메서드, 인덱스를 사용
			System.out.println(strList.get(i));
		}
		
		System.out.println("===향상된 for문, for each문");
		for(String str : strList) {
			System.out.println(str);
		}
		
		//toString() : 기본자료형의 경우 저장되어있는 모든 데이터를 출력
		System.out.println(strList.toString());
		
	}

}
