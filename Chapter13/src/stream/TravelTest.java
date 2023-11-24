package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100); // 고객 생성
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

		List<TravelCustomer> customerList = new ArrayList<>();

		customerList.add(customerLee);
		customerList.add(customerKim); // ArrayList에 고객 추가
		customerList.add(customerHong);

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		//중간 연산 map()사용 ;; 클래스가 가진 자료중 이름만 출력할 경우
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
					//스트림 		중간연산(map)			최종연산
		
		//mapToInt : 중간연산 > int 값을 가지고 오는 메서드
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
								//스트림		중간연산(mapToInt)			최종연산(sum)
		System.out.println("총 여행 비용은 :" + total + "입니다");

		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		//중간 연산 filter()사용 ;; 조건을 넣고 참인 경우만 추출할 경우
		customerList.stream().filter(c -> c.getAge() >= 20)
					//스트림 		중간연산1(filter)	
		.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		//중간연산2(map)		//오름차순				최종연산
		
		// 나이가 20이상인 이순신, 김유신만 출력; sorted 로 인해 김유신,이순신 순서로 출력
	}

}
