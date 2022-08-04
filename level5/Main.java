package level5;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n <= 99) {
			
			System.out.println(n);
			
//		1000은 등차수열이 아닌데 문제에서의 예시 답은 예외처리를 안해준다.(?)
//		}else if(n == 1000){
//			
//			System.out.println(function(n) -1);
//			
		}else {
			
			System.out.println(function(n));
		}
	}
	
	static int function(int n) {
		
		int count = 0;
		
		for(int i=100; i<=n; i++) {
			
			int a = i%10;
			int b = (i/10)%10;
			int c = i/100;
			
			if((a-b) == (b-c)) {
				count++;
			}
		}
		
		return count+99;
	}
	
}
