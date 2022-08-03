package level4;

import java.io.*;
import java.util.*;

public class Q2577_before {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int n = a * b * c;
		int count = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(n != 0) {
			
			arr.add(n%10);
			n = n/10;
		}
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<arr.size(); j++) {
				
				if(arr.get(j) == i) {
					count++;
				}
			}
			
			System.out.println(count);
			count = 0;
		}
		
		br.close();
		
	}

}
