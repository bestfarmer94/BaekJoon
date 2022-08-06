package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = n/5;
		int res = 0;
		
		if(n%5 == 0) {
			res = a;
		}else {
			for(int i=a; i>=0; i--) {
				if((n-i*5)%3 == 0) {
					res = i+(n-i*5)/3;
					break;
				}
			}
		}
		
		if(res == 0) {
			System.out.println(-1);
		}else {
			System.out.println(res);
		}
		
		//	발상이 좋아서 가져왔다.
//		int sug = Integer.parseInt(br.readLine());
//		int cnt = 0;
//		
//		while(true) {
//			if(sug % 5 == 0) {				
//				System.out.println(sug / 5 + cnt);
//				break;
//			}
//			else if(sug < 0) {
//				System.out.println(-1);
//				break;
//			}
//			sug -= 3;
//			cnt ++;			
//		}
		
	}
}
