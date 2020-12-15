
public class PalindromeClass {

	public static void main(String[] args) {
		String x = "racecar";
		String y = "hello";
		System.out.println(x+" is "+Palindrome(x));
		System.out.println(y+" is "+Palindrome(y));
	}
	
	public static boolean Palindrome(String str) {
		int i = 0, j = str.length() - 1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;}
			i++;
			j--;
			
			}
		return true;
		}
}
