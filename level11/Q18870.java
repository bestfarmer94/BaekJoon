package level11;

import java.io.*;
import java.util.*;

public class Q18870 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// int[] arr2 = arr; 이런식으로 하면 arr2를 정렬해도 같이 되더라...
		for(int i=0; i<n; i++) {
			arr[i] = arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr2);
		
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
		
		int ranking = 0;
		
		for(int i : arr2) {
			if(!rank.containsKey(i)) {
				rank.put(i, ranking);
				ranking++;
			}
		}
		
		for(int i : arr) {
			sb.append(rank.get(i)).append(' ');
		}
		
		System.out.println(sb);
		br.close();
	}
}
