
public class OddClass {

	public static void main(String[] args) {
		System.out.println(isOdd(5));
		System.out.println(isOdd(6));
		System.out.println("Printing odd numbers between 1 and 20");
		for(int i = 0; i <= 20; i++) {
			if(isOdd(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	public static boolean isOdd(int o) {
		boolean b = false;
		for(int i = 1; i <= 20; i++) {
			if(o % 2 == 1) {
				b = true;
			}	
		}
		return b;
	}
}
