package level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String str = br.readLine();
//		System.out.println(str.split(" ").length);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(st.countTokens());
		
		br.close();
	}
}
