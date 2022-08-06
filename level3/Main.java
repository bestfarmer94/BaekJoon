package level3;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			x -= a*b;
		}
		
		sb.append(x == 0 ? "Yes" : "No");
		System.out.println(sb);
		
		br.close();
	}
}
