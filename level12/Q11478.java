package level12;

import java.io.*;
import java.util.*;

public class Q11478 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		HashSet<String> str = new HashSet<String>();
		
		for(int i=1; i<S.length()+1; i++) {
			
//			subString(start index, end index);
//			ex) String a = "ababc";
//			a.subString(2, 5); abc 출력
//			start index는 0~4 로 세면서
//			end index는 1~5 로 센다.
//			ex) a.subString(2,3) -> a 출력
			
			for(int j=0; j<S.length()+1-i; j++) {
				str.add(S.substring(j, j+i));
			}
		}
		
		sb.append(str.size());
		System.out.println(sb);
		br.close();
	}
}
