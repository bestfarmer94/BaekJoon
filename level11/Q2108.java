package level11;

import java.io.*;
import java.util.*;

public class Q2108 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int sum = 0;
		int[] count = new int[8001];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[arr[i]+4000]++;
		}

		int average;
		
		if(sum > 0) {
			if((double)sum/n - sum/n >= 0.5) {
				average = sum/n + 1;
			}else {
				average = sum/n;
			}
		}else {
			if(sum/n -(double)sum/n <= 0.5) {
				average = sum/n;
			}else {
				average = sum/n -1;
			}
		}
		
		Arrays.sort(arr);
		int median = arr[n/2];	// 중앙값
		
		int mostcount = 0;
		
		for(int i=0; i<8001; i++) {
			mostcount = Math.max(mostcount, count[i]);
		}
		
		ArrayList<Integer> mode = new ArrayList<Integer>();
		
		for(int i=0; i<8001; i++) {
			if(count[i] == mostcount) {
				mode.add(i-4000);
			}
		}
		
		Collections.sort(mode);
		
		int range = arr[n-1] - arr[0];
		
		sb.append(average).append('\n');
		sb.append(median).append('\n');
		if(mode.size() > 1) {
			sb.append(mode.get(1)).append('\n');
		}else {
			sb.append(mode.get(0)).append('\n');
		}
		sb.append(range);
		System.out.println(sb);
		br.close();
		
//		//입력값의 범위 지정 : -4000 ~ 4000
//				int[] arr = new int[8001];
//				
//				/**
//				 * sum = 총 합계
//				 * max = 최댓값
//				 * min = 최솟값
//				 * median = 중앙값
//				 * mod = 최빈값
//				 * 
//				 */
//				int sum = 0;
//				int max = Integer.MIN_VALUE;
//				int min = Integer.MAX_VALUE;
//				int median = 10000;
//				int mod = 10000;
//				
//				for(int i = 0; i < N; i++) {
//					int v = Integer.parseInt(br.readLine());
//					sum += v;
//					arr[v + 4000]++;
//					
//					if(max < v) {
//						max = v;
//					}
//					if(min > v) {
//						min = v;
//					}
//				}
//				
//				int count = 0; // 중앙값 빈도 누적 수
//				int mod_max = 0; //최빈값의 최댓값
//				
//				boolean flag = false;
//				
//				for(int i = min + 4000; i <= max + 4000; i++) {
//					
//					if(arr[i] > 0 ) {
//						
//						/*
//						 * 중앙값 찾기
//						 */
//						if(count < (N + 1) / 2) {
//							count += arr[i]; //i값의 빈도수를 count에 누적
//							median = i - 4000;
//						}
//						
//						/*
//						 * 최빈값 찾기
//						 */
//						if(mod_max < arr[i]) {
//							mod_max = arr[i];
//							mod = i - 4000;
//							flag = true;
//						}
//						// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
//						else if(mod_max == arr[i] && flag == true) {
//							mod = i - 4000;
//							flag = false;
//						}
//					}
//				}
//				
//				System.out.println((int)Math.round((double)sum/N));
//				System.out.println(median);
//				System.out.println(mod);
//				System.out.println(max - min);
	}
}
