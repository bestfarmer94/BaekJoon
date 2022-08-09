package level11;

import java.io.*;
import java.util.*;

public class Q2108 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int sum = 0;
		int[] count = new int[8001];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[arr[i]+4000]++;
		}

		int average;
		
		if(sum > 0) {
			if((double)sum/n - sum/n >= 0.5) {
				average = sum/n + 1;
			}else {
				average = sum/n;
			}
		}else {
			if(sum/n -(double)sum/n <= 0.5) {
				average = sum/n;
			}else {
				average = sum/n -1;
			}
		}
		
		Arrays.sort(arr);
		int median = arr[n/2];	// 중앙값
		
		int mostcount = 0;
		
		for(int i=0; i<8001; i++) {
			mostcount = Math.max(mostcount, count[i]);
		}
		
		ArrayList<Integer> mode = new ArrayList<Integer>();
		
		for(int i=0; i<8001; i++) {
			if(count[i] == mostcount) {
				mode.add(i-4000);
			}
		}
		
		Collections.sort(mode);
		
		int range = arr[n-1] - arr[0];
		
		sb.append(average).append('\n');
		sb.append(median).append('\n');
		if(mode.size() > 1) {
			sb.append(mode.get(1)).append('\n');
		}else {
			sb.append(mode.get(0)).append('\n');
		}
		sb.append(range);
		System.out.println(sb);
		br.close();
	}
}
