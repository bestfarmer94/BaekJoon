package level2;

import java.util.Scanner;

public class Q2480_before {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if(a<b) {
			d=a;
			a=b;
			b=d;
		}
		if(a<c) {
			d=a;
			a=c;
			c=d;
		}
		if(b<c) {
			d=b;
			b=c;
			c=d;
		}
		
		if(a==b && b==c) {
			System.out.println(10000 + 1000*a);
		}else if((a==b) || (b==c)){
			System.out.println(1000 + 100*b);
		}else {
			System.out.println(100*a);
		}
		
		sc.close();
	}

}
