
public class FibonacciClass {

	public static void main(String[] args) {
		System.out.println(getFibonacci());

	}
	public static int getFibonacci() {
		System.out.print("0 1 1 ");
		int f = 2;
		int g = 1;
		int h = 1;
		for(int i = 1; i <= 8; i++) {		
		System.out.print(f+ " ");
		f=f+g;
		g=f-g;	
		h=g-h;
		}
		return f;
	}
}
