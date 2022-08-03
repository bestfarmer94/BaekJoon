package level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3052 {

	public static void main(String[] args) throws Exception {
		
		// 풀었던 방식
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			arr[i] = Integer.parseInt(br.readLine())%42;
//		}
//		
//		int count = 0;
//		
//		for(int i=0; i<10; i++) {
//			for(int j=i+1; j<10; j++) {
//				if(arr[i] == arr[j]) {
//					arr[j] = -1;
//				}
//			}
//			
//			if(arr[i] >= 0) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		br.close();
		
		
		
		// Hashset 방식
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashSet<Integer> h = new HashSet<Integer>();
// 
//		
//		for (int i = 0; i < 10; i++) {
//			h.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		
//		System.out.print(h.size());
		
		
		
		boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);

	}

}
