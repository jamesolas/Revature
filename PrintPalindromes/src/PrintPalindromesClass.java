//Task  - Print all palindromes between 1000 and 9999 with the above style
public class PrintPalindromesClass {

	public static void main(String[] args) {
		for(int i = 1000; i <= 9999; i++) {
			String strnum = Integer.toString(i);
			StringBuffer str = new StringBuffer(strnum);
			str.reverse();
			
			if(new StringBuffer(strnum).reverse().toString().equals(strnum)) {
				System.out.print(i+ " ");
			}
		}
	}

}
