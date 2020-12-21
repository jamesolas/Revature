import java.util.Arrays;

public class EvenOddClass {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr2[x] = arr[i];
					x++;
			}else {
				arr3[y] = arr[i];
					y++;
			}
		}
		System.out.println("Even Numbers: "+Arrays.toString(arr2));
		System.out.println("Odd Numbers: "+Arrays.toString(arr3));
	}

}
