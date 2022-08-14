package level18_greedy;

import java.io.*;
import java.util.*;

public class Q1931 {

	public static void main(String[] args) throws Exception {
		
//		문제
//		한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
//		각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
//		단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
//		회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] time = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// Integer가 아니라 int 라고 해야 한다. 안그러면 sort에 빨간줄 그임.
		
		// 아래의 것을 간략하게 표현한 것.
//		Arrays.sort(num, (a,b)->{
//			if(a[1]==b[1]) {
//				return a[0]-b[0];
//			} else {
//				return a[1]-b[1];
//			}
//		});
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
			
				return o1[1] - o2[1];
			}
		});
		
		int count = 1;
		int end = time[0][1];
		for(int i=1; i<n; i++) {
			if(time[i][0] >= end) {
				count++;
				end = time[i][1];
			}
		}
		
		sb.append(count);
		System.out.println(sb);
		br.close();
	}
}
