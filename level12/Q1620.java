package level12;

import java.io.*;
import java.util.*;

public class Q1620 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, String> pokemon = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			String monster = br.readLine();
			pokemon.put(Integer.toString(i+1), monster);
			pokemon.put(monster, Integer.toString(i+1));
		}
		
		for(int i=0; i<m; i++) {
			sb.append(pokemon.get(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
