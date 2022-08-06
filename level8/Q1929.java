package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 기존 방법, 맞긴 했는데 굉장히 오래걸린다고 한다.
//		for(int i=m; i<=n; i++) {
//			int a = i;
//			
//			for(int j=2; j<=Math.sqrt(i); j++) {
//				if(i%j == 0) {
//					a = 1;
//					break;
//				}
//			}
//			
//			if(a != 1) {
//				System.out.println(a);
//			}
//		}
		
		boolean[] a = new boolean[n+1];
		a[0] = true;
		a[1] = true;
		
		for(int j=2; j<=Math.sqrt(n); j++) {
			if(a[j]) continue;
			for(int k=j*j; k<=n; k += j) {
				a[k] = true;
			}
		}
		
		for(int i=m; i<=n; i++) {
			
			if(!a[i]) sb.append(i).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
