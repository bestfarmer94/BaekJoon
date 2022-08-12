package level12;

import java.io.*;
import java.util.*;

public class Q1269 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		// 엄청 간단하게 풀어서 가져왔다.
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i =0; i<n+m; i++) {
//			int x = sc.nextInt();
//			if(map.containsKey(x)) {
//				map.remove(x);
//			}else {
//				map.put(x,0);
//			}
//		}
//		
//		System.out.println(map.size());
		
		
		HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> b = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		
		int count = n;
		
		for(int i=0; i<m; i++) {
			int element = Integer.parseInt(st.nextToken());
			
			if(a.contains(element)) {
				a.remove(element);
				count--;
			}else {
				b.add(element);
				count++;
			}
		}
		
		sb.append(count);
		System.out.println(sb);
		br.close();
	}
}
