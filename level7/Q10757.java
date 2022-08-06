package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10757 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int max = Math.max(a.length(), b.length());
		
		int[] A = new int[max];
		int[] B = new int[max];
		int[] res = new int[max+1];
		
		for(int i=0; i<a.length(); i++) {
			A[i] = a.charAt(a.length()-1-i)-'0';
		}
		
		for(int i=0; i<b.length(); i++) {
			B[i] = b.charAt(b.length()-1-i)-'0';
		}
		
		for(int i=0; i<max; i++) {
			res[i] = res[i] + A[i] + B[i];
			if(res[i] >= 10) {
				res[i] -= 10;
				res[i+1]++;
			}
		}
		
		if(res[max] == 1) {
			for(int i=max; i>=0; i--) {
				System.out.print(res[i]);
			}
		}else {
			for(int i=max-1; i>=0; i--) {
				System.out.print(res[i]);
			}
		}
		
		br.close();
		
		// 여러가지 문법을 배울 수 있는 코드였다.
//	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "utf-8"));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        StringBuilder bigStr1 = new StringBuilder(st.nextToken());
//        StringBuilder bigStr2 = new StringBuilder(st.nextToken());
//
//        int biggerLen = bigStr1.length()>=bigStr2.length() ? bigStr1.length() : bigStr2.length();
//
//        // bigint1 이 길이가 같거나 더 큰 arr
//        int[] bigint1   = new int[biggerLen];
//        int[] bigint2   = new int[biggerLen];
//        int[] result    = new int[biggerLen+1];
//
//        Arrays.fill(bigint1, 0);
//        Arrays.fill(bigint2, 0);
//
//        int temp = 0;
//
//        bigStr1.reverse();
//        bigStr2.reverse();
//
//        for(int i = 0 ; i<bigStr1.length() ; i++) {
//            bigint1[i] = Character.getNumericValue(bigStr1.charAt(i));
//        }
//        for(int i = 0 ; i<bigStr2.length() ; i++) {
//            bigint2[i] = Character.getNumericValue(bigStr2.charAt(i));
//        }
//
//        // plus
//        for(int i = 0 ; i<biggerLen ; i++) {
//            // 이전 시행의 덧셈에서 자릿수 올림 체크
//            if(temp>=10) {
//                temp = 1;
//            } else {
//                temp = 0;
//            }
//
//            temp = temp + bigint1[i] + bigint2[i];
//            result[i] = temp%10;
//        }
//        if(temp>=10) {
//            result[result.length-1] = 1;
//        }
//
//        // 출력은 배열 마지막부터
//        if(result[result.length-1] != 0) {
//            bw.write(Integer.toString(result[result.length-1]));
//        }
//        for(int i = result.length-2 ; i>=0 ; i--) {
//            bw.write(Integer.toString(result[i]));
//        }
//        bw.close();
	}
}
