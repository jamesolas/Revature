import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something for a");
		String a = sc.nextLine();
		System.out.println("Enter something for b");
		String b = sc.nextLine();
		System.out.println("Enter something for c");
		String c = sc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
