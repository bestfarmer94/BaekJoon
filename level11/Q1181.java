package level11;

import java.io.*;
import java.util.*;

public class Q1181 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		
//		// 문법의 정수가 담겨있다
//		HashSet<String> arr = new HashSet<>();
//        for(int i=0; i<N; i++){
//            arr.add(br.readLine());
//        }
//        ArrayList<String> list = new ArrayList<>(arr);
//
//        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
		
		
		String[] str = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length() - o2.length();
				}
			}
		});
		
		sb.append(str[0]).append('\n');
		
		for(int i=1; i<n; i++) {
			if(!str[i].equals(str[i-1])) {
				sb.append(str[i]).append('\n');
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}