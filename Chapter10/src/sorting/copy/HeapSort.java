package sorting.copy;

import java.util.Arrays;
import java.util.Collections;

public class HeapSort  implements Sort {
	String sort = "HeapSort";
	@Override
	public void ascending(String[]arr) {
		// TODO Auto-generated method stub
		System.out.println(sort + " ascending");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public void descending(String[]arr) {
		// TODO Auto-generated method stub
		System.out.println(sort + " descending");
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("숫자를 정렬하는 알고리즘 " + sort + " 입니다." );
	}

}
