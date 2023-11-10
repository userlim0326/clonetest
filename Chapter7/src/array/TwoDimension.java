package array;

public class TwoDimension { // 2차원 배열

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열
		int[][] arr = new int[3][3]; // 첫번째 3은 {}내의 {} 개수, 두번째 3은 {}내의 숫자 개수
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for(int i=0; i < arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		System.out.println("----------------------");
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		
		// 3차원 배열
		int[][][] arr3 = new int[2][2][2]; 
		int[][][] arr4 = {{{1,2},{3,4}},{{5,6},{7,8}}};
		// 첫번째 2 >> 제일 큰 중괄호 세트가 두개 {{1,2},{1,2}} / {{1,2},{1,2}}
		// 두번째 2 >> 그 안에 두개 {{1,2} / {1,2}}
		// 세번째 2 >> 그 안에 두개{1/2}
		for(int i = 0; i < arr4.length; i++) {
			for(int j = 0; j <arr4[i].length; j++) {
				for(int k = 0; k <arr4[i][j].length; k++) {
					System.out.println(arr4[i][j][k]);
				}
			}
		}
		System.out.println("----------------------");


		//4차원 배열
		int[][][][] arr5 = new int [2][2][2][2];
		int[][][][] arr6 = {{{{1,2},{1,2}},{{1,2},{1,2}}}
							,{{{1,2},{1,2}},{{1,2},{1,2}}}}; 
		for(int i = 0; i < arr6.length; i++) {
			for(int j = 0; j <arr6[i].length; j++) {
				for(int k = 0; k <arr6[i][j].length; k++) {
					for(int l = 0; l <arr6[i][j][k].length; l++) {
						System.out.println(arr6[i][j][k][l]);
					}
				}
			}
		}
	}

}
