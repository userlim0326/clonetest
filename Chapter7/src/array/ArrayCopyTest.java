package array;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {10,20,30,40,50};
		int [] arr2 = {1,2,3,4,5};
//반복문 사용해서 복사하기
//		for(int i = 1; i < arr1.length; i++) { 
//			arr2[i] = arr1[i]; 
//
//		}
		
		//반복문 사용안하고 복사하기
		//복사할 대상, 시작 인덱스, 복사 결과물, 복사 결과 대상의 시작 인덱스, 복사 갯수
		System.arraycopy(arr1, 1, arr2, 1, 4); // arr1의 {}중 1번째 값부터 arr2의 1번째에서 4번쨰까지 복사함
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " +	Arrays.toString(arr2));
				
	}

}
