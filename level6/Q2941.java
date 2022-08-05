package level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2941 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = str.length();
		
		// 문자열을 바꿀 수 있다.
//		str = str.replace("dz=", "a").replace("lj", "a").replace("nj", "a").replace("=", "").replace("-", "");
//		System.out.println(Integer.toString(str.length()));
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == '=') {
				
				if(str.charAt(i-1) == 'z' && i >= 2) {
					if(str.charAt(i-2) == 'd') {
						count -= 1;
					}
				}
				
				count -= 1;
				
			}else if(str.charAt(i) == '-'){
				count -= 1;
				
			}else if(str.charAt(i) == 'j' && i>=1){
				
				if(str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n') {
					count -= 1;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
