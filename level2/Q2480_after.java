package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2480_after {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int total = 0;
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); 
		// 0번 항부터 4개까지만
		// Arrays.sort(arr, 0, 4);
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			total = 10000 + 1000*arr[0];
		}else if((arr[0] == arr[1]) || (arr[1] == arr[2])){
			total = 1000 + 100*arr[1];
		}else {
			total = 100 * arr[2];
		}
		
		System.out.println(total);
		sc.close();
	}

}