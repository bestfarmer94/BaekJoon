package level5;

public class Q4673 {

	public static void main(String[] args) {
		
		boolean[] b = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			
			int a = d(i);
			
			if(a < 10001) {
			
				b[a] = true;
			}
		}
		
		for(int i=1; i<10001; i++) {
			
			if(!b[i]) {
				
				System.out.println(i);
			}
		}
	}

	static int d(int i) {
		
		int d = i;
		
		while(i != 0) {
			
			d += i%10;
			i /= 10;
		}
		
		return d;
	}
}
