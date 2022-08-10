package level11;

import java.io.*;
import java.util.*;

public class Q1427 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		// 굉장하다. 문법의 정수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		char[] arr = br.readLine().toCharArray();
//		
//		Arrays.sort(arr);
//		
//		String sb = new StringBuilder(new String(arr)).reverse().toString();
//		
//		System.out.println(sb);
		
		
		String n = br.readLine();
		char[] arr = new char[n.length()];
		
		for(int i=0; i<n.length(); i++) {
			arr[i] = n.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n.length(); i++) {
			sb.append(arr[i]);
		}
		
		sb.reverse();
		System.out.println(sb);
		br.close();
	}
}
