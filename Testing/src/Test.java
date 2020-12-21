import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String str = "That is a car";
		//System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		String ar[] = str.split(" ");
		System.out.println(Arrays.toString(ar));
		//System.out.println(sb);
		for (int i = 0; i < ar.length; i++) {
			int l = 0;
			int r = String.valueOf(ar[i]).length();
			//sb.append(ar[i].substring(0)).append(" ");
			//sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(ar[i].substring(1)).append(" ");
			//while(l < r-1) {
			sb.append(ar[i].charAt(l));
			if(r==1) {
				sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
				l++;
			}
			if(l==r-1) {
				System.out.println("l==r-1");
				l++;
				sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
			}else {
				l++;
			}
			
		//}
		}
		System.out.println(sb.toString().trim());
	}
}
