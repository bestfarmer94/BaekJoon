package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<6; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(i < 2) {
				sb.append(1-a).append(' ');
			}else if(i < 5){
				sb.append(2-a).append(' ');
			}else {
				sb.append(8-a);
			}
			
		}
		
		System.out.println(sb);
		br.close();
	}
}

