package level10;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int x = 0;
		while(n != 0) {
			String str = Integer.toString(num);
			
			for(int i=0; i<str.length()-2; i++) {
				if(str.charAt(i) == '6' && str.charAt(i+1) == '6' && str.charAt(i+2) == '6') {
					x= num;
					n--;
					break;
				}
			}
			
			num++;
		}
		
		sb.append(x);
		System.out.println(sb);
		br.close();
	}
}
