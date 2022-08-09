package level11;

import java.io.*;
import java.util.*;

public class Q2751 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		//  Collections.sort() 가 좀더 빠르다고 한다.
		//	사용하려면 ArrayList<>()를 사용했어야 함.
		Arrays.sort(a);
		
		for(int i=0; i<n; i++) {
			sb.append(a[i]).append('\n');
		}
		
		
		// Counting sort
		// Arrays.sort의 경우 느리다고 한다. 시간 초과되어 실패될 경우 이런식으로도 해볼 수 있다.
		
//		boolean[] arr = new boolean[2000001];	
//        
//		int N = Integer.parseInt(br.readLine());
//        
//		for(int i = 0; i < N; i++) {
//			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
//		}
// 
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i]) {
//				sb.append((i - 1000000)).append('\n');
//			}
//		}
		
		System.out.println(sb);
		br.close();
	}
}
