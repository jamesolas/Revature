//Task – convert every word’s last character to upper case and print the sentence.
public class LastCharClass {

	public static void main(String[] args) {
		String str = "That is a car";
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		StringBuilder rev = new StringBuilder();
		String ar[] = str.split(" ");
			for(int i = 0; i < ar.length; i++) {
				//sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(ar[i].substring(1)).append(" ");
				//sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(String.valueOf(ar[i].charAt(ar[i].length()-1)).substring(1)).append(" ");
				//sb.append(ar[i].substring(0)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
				//sb.append(ar[i].substring(0)).append(" ");
				rev.append(ar[i]);
				rev.delete(rev.length()-1,rev.length());
				char last = Character.toUpperCase(ar[i].charAt(ar[i].length()-1));
				rev.insert(rev.length(), last).append(" ");
				
			}
				
				System.out.println(rev.toString().trim());
	}
}