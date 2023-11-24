package stream;
//stream의 연산은  중간연산과 최종연산이 있으며, 중간연산이 여러 개 호출되어도 최종연산이 없으면 호출할 수 없다.
import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for (int i : arr) { //향상된 for문 >>for each문;
			sum += i;
		}
		System.out.println(sum);
		
		int sumVal = Arrays.stream(arr).sum(); // sum()연산으로 arr 배열에저장된 값을 모두 더함
		
		
		int [] arr2 = new int[10];
		arr2[0] = 1;
		arr2[1] = 2;
		
		int count = (int)Arrays.stream(arr2).count(); // count() 연산으로 arr배열의 요소 개수를 반환함
		//(int) > count() 메서드의 반환 값이 long이므로 int로 전환
		
		System.out.println(sumVal);
		System.out.println(count);
		}

}
