package level15_BackTracking;

import java.io.*;
import java.util.*;

public class Main {

	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n,m,0);
		
		System.out.println(sb);
		br.close();
	}
	
	static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int i : arr) {
				sb.append(i).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<n; i++) {		// depth 0 1 2까지 반복문을 거치고 depth = 2부터 0~n까지 해결하고, depth = 1 로 올라가고,
			if(!visit[i]) {				// 다시 depth = 2의 0 ~ n
				visit[i] = true;		// true를 찍어주면서 depth++ 할때마다 0부터 visit[i]가 false인 곳까지 올라오게 된다.
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);	// depth가 arr항에 해당하게 된다.
				visit[i] = false;
			}
		}
	}
}
