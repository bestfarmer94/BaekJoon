package level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11654 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자 하나의 경우 BufferedReader도 안쓰고, System.in.read()만 써도 된다.
		
		int a = br.readLine().charAt(0);
//		int a = System.in.read();
		
		System.out.println(a);
		
		br.close();
	}
}
