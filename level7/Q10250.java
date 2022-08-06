package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			// 조금 복잡하게 생각 한 것 같다.
//			if(n%h ==0) {
//				if(n/h < 10) {
//					System.out.println(h+"0"+n/h);
//				}else {
//					System.out.println(h+""+(n/h));
//				}
//				
//			}else {
//				if(n/h+1 <10) {
//					System.out.println((n%h)+"0"+(n/h+1));
//				}else {
//					System.out.println((n%h)+""+(n/h+1));
//				}
//			}
			
			// 어차피 방번호는 한자리 수여도 0x로 표현하니까, 층수를 *100 해서 숫자로 바꿈
			System.out.println(n%h==0 ? h*100+n/h : (n%h)*100+n/h+1);
		}
		
		br.close();
	}
}
