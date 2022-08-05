package level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1316 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			String str = br.readLine();
			boolean[] a = new boolean[26];
			char prev = str.charAt(0);
			int res = 0;
			
			for(int j=0; j<str.length(); j++) {
				a[str.charAt(0) - 'a'] = true;
				if(str.charAt(j) != prev) {
					if(a[str.charAt(j) - 'a'] == false) {
						a[str.charAt(j) - 'a'] = true;
						prev = str.charAt(j);
					}else {
						res = 1;
						break;
					}
				}
			}
			
			if(res == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
