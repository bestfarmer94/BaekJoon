package level11;

import java.io.*;
import java.util.*;

public class Q11650 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a1, a2) -> {
			if(a1[0] == a2[0]) {
				return a1[1] - a2[1];
			}else {
				return a1[0] - a2[0];
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
