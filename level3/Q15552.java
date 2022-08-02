package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int a = Integer.parseInt(br.readLine());
		int b,c = 0;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<a; i++) {
			st = new StringTokenizer(br.readLine());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			bw.write((b+c) + "\n");
		}
		
		br.close();
		bw.flush();
	}

}
