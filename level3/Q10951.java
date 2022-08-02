package level3;

import java.io.*;
import java.util.*;

public class Q10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		int a,b = 0;
		
		while((str=br.readLine()) != null) {
			st = new StringTokenizer(str);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b) + "\n");
		}
		
		br.close();
		bw.flush();
		
	}

}
