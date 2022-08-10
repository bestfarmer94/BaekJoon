package level11;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					
					temp = y[i];
					y[i] = y[j];
					y[j] = temp;
				}else if(x[i] == x[j] && y[i] > y[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					
					temp = y[i];
					y[i] = y[j];
					y[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			sb.append(x[i]).append(' ').append(y[i]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
