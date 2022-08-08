package level9;

import java.io.*;

public class Q2447 {

	static char[][] star;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		star = new char[n][n];
		
		star(0, 0, n, false);
		
		for(int i=0; i<n; i++) {
			// 2차원 배열을 이렇게 출력할 수도 있다.
			sb.append(star[i]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
	
	static void star(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i=x; i<x+n; i++) {
				for(int j=y; j<y+n; j++) {
					star[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n == 1) {
			star[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		
		for(int i=x; i<x+n; i+=size) {
			for(int j=y; j<y+n; j+=size) {
				count++;
				
				if(count != 5) {
					star(i, j, size, false);
				}
				
				if(count == 5) {
					star(i, j, size, true);
				}
			}
		}
	}
}
