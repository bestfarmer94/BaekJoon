package level3;

import java.io.*;

public class Q1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		
		if(a < 10) {
			a = 10*a;
		}
		
		int b = a/10;
		int c = a%10;
		int d = 0;
		
		while(true) {
			
			count++;
			d = (b+c)%10;
			b = c;
			c = d;
			
			if((10*b + c) == a) {
				break;
			}
		}
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		
	}

}
