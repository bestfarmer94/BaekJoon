package level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11729 {
	
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb2 = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 3, 2);
		sb2.append(count);
		
		System.out.println(sb2);
		System.out.println(sb);
		br.close();
	}
	
	static void hanoi(int n, int start, int to, int mid) {
		
		count++;
		
		if(n==1) {
			
			sb.append(start).append(' ').append(to).append('\n');
			return;
		}
		
		hanoi(n-1, start, mid, to);
		sb.append(start).append(' ').append(to).append('\n');
		hanoi(n-1, mid, to, start);
	}
}