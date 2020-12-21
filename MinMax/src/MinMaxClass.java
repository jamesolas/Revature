import java.util.Arrays;

public class MinMaxClass {

	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 1, 20, 10};
		int maxNum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];}
			}
		System.out.println(Arrays.toString(arr));
		System.out.println("The maximum number is "+maxNum);
	}

}
