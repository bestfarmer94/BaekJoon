package level4;

import java.io.*;

public class Q2577_after {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String str = Integer.toString(a * b * c);
        
        int[] num = new int[10];
        
        for(int i = 0; i < str.length(); i++){
            num[str.charAt(i) - '0']++;
        }
        
        for (int i = 0; i <= 9; i++) {
            System.out.println(num[i]);
        }
        
        br.close();
    }
}