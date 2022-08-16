package level18_greedy;

import java.io.*;
import java.util.*;

public class Q13305 {

	public static void main(String[] args) throws Exception {
		
		// 숫자가 너무 커서 long을 사용해야 했나보다.
//		도시까지의 거리는 1이상 1,000,000,000 이하의 자연수이다. 리터당 가격은 1 이상 1,000,000,000 이하의 자연수이다. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] distance = new long[n-1];
		
		for(int i=0; i<n-1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		long[] price = new long[n];
		
		for(int i=0; i<n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = price[0] * distance[0];
		long tempPrice = price[0];
		
		for(int i=1; i<n-1; i++) {
			if(price[i]< tempPrice) {
				tempPrice = price[i];
			}
			sum += tempPrice * distance[i];
		}
		
		sb.append(sum);
		System.out.println(sb);
		br.close();
	}
}
