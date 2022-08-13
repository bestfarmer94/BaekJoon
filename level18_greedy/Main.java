package level18_greedy;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=n-1; i>=0; i--) {
			if(coin[i] <= k) {
				count += k / coin[i];
				k %= coin[i];
			}
			
			if(k == 0) {
				break;
			}
		}
		
		sb.append(count);
		System.out.println(sb);
		br.close();
	}
}
