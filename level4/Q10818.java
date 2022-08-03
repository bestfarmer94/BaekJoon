package level4;

import java.io.*;
import java.util.*;

public class Q10818 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		bw.write(arr[0] + " " + arr[N-1]);
		// Arrays.stream(arr).min().getAsInt() : 최솟값 구하는 방법이라고 한다.
		
		br.close();
		bw.close();
		
	}

}