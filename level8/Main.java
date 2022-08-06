package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[10001];
		
		for(int i=2; i<=100; i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<=10000; j += i) {
				prime[j] = true;
			}
		}
		
		for(int k=0; k<t; k++) {
			int n = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			
			for(int i=n/2; i>=2; i--) {
				
				if(!prime[i] && !prime[n-i]) {
					a = i;
					b = n-i;
					break;
				}
			}
			
			sb.append(a).append(' ').append(b).append('\n');
		}

		System.out.println(sb);
		br.close();
	}
}
