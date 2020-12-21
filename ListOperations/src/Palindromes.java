import java.util.LinkedList;
import java.util.List;

//Find all Palindrome numbers in a list

public class Palindromes {

	public static void main(String[] args) {
		List<Integer> li1 = new LinkedList<>();
			li1.add(101);
			li1.add(200);
			li1.add(202);
			li1.add(301);
		System.out.print(li1+" ");
		System.out.println(" ");
		
		for(int i = 0; i < li1.size(); i++) {
			String str = String.valueOf(li1.get(i));
			int l = 0;
			int r = str.length()-1;
			
			while(l < str.length()) {
				if(str.charAt(l) != str.charAt(r)) {
					l++;
					r--;
				}else{
					l++;
					r--;
					if(l == str.length()) {
						System.out.print(li1.get(i)+" ");
					}
				}
			}
		}
		
		
		
	}

}
