package level4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int[] arr = new int[m];
			int total = 0;
			double avg = 0;
			int count = 0;
			
			for(int j=0; j<m; j++) {
				
				arr[j] = Integer.parseInt(st.nextToken());
				total += arr[j];
			}
			
			avg = total / m;
			
			for(int j=0; j<m; j++) {
				
				if(arr[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f", (double)count/m*100);
			System.out.println("%");
		}
		
		br.close();
	}
}
