package sorting.copy;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort  implements Sort {
	String sort = "QuickSort";
	@Override
	public void ascending(String[]arr) {
		// TODO Auto-generated method stub
		System.out.println(sort + " ascending");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public void descending(String[]arr) {
		// TODO Auto-generated method stub
		System.out.println(sort + " descending");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("숫자를 정렬하는 알고리즘 " + sort + " 입니다." );
	}

}
