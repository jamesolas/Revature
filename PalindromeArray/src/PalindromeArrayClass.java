
public class PalindromeArrayClass {

	public static void main(String[] args) {
		int[] arr = {101, 24, 44, 5665, 11, 10201, 243};
		
		for(int i = 0; i < arr.length; i++) {
			String str = String.valueOf(arr[i]);
			
			int l = 0;
			int r = str.length()-1;
					
				while(l < str.length()) {
			
				if(str.charAt(l) != str.charAt(r)) {
					l++;
					r--;
					}else {
						l++;
						r--;	
				
						if(l == str.length()) {
							System.out.println(str+" is a palindrome");
						}
					
					}
			
				}
		
		}
	}
}
