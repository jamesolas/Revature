
public class Prime {

	public static void main(String[] args) {
		System.out.println(isPrime(4));
		
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	public static boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}
}
