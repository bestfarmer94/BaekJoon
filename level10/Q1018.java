package level10;

import java.io.*;
import java.util.*;

public class Q1018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		int min = 65;
		
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				int count = 0;
				
				for(int k=i; k<i+8; k++) {
					for(int l=j; l<j+8; l++) {
						if((k+l)%2 == 0) {
							if(board[k][l] == 'B') {
								count++;
							}
						}else {
							if(board[k][l] == 'W') {
								count++;
							}
						}
					}
				}
				
				// 습관 들이자.
//				if(count > 32) {
//					count = 64 - count;
//				}
				
//				if(min > count) {
//					min = count;
//				}
				
				count = Math.min(count, 64-count);
				min = Math.min(count, min);
			}
		}
		
		sb.append(min);
		System.out.println(sb);
		br.close();
	}
}
