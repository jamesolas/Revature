
public class ValidateDLClass {

	public static void main(String[] args) {
		String str = "D1234567";
		if(str.matches("[A-Z]{1}[0-9]{7}")) {
			System.out.println("Valid DL");
			}else {
			System.out.println("Not a valid DL");
			}
		}
}
