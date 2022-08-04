package level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int[] arr = new int[26];
		int max = 0;
		int res = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if((int)(str.charAt(i) - 'a') >= 0) {
				arr[(int)(str.charAt(i) -'a')]++;
			}else {
				arr[(int)(str.charAt(i) -'A')]++;
			}
		}
		
		for(int i=0; i<26; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				res = i;
			}else if(arr[i] == max){
				res = (int)'?';
			}
		}
		
		if(res == (int)'?') {
			System.out.println("?");
		}else {
			System.out.println((char)(res+(int)'A'));
		}
		
		br.close();
	}
}
