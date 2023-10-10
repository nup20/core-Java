package multidimension;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]=new int[2][2];
		arr [0][0]=100;
		arr [0][1]=200;
		arr [1][0]=300;
		arr [1][1]=400;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++){
			for(int  j=0;j<arr.length;j++){
			System.out.println(arr[i][j]);
			}
		}
		
		
				
	}

}
