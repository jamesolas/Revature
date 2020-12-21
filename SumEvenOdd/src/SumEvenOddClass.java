import java.util.Arrays;

public class SumEvenOddClass {

	public static void main(String[] args) {
		int[] arr = {11, 9, 7, 2, 13, 6, 12};
		int[] arrE = new int[8];
		int[] arrO = new int[8];
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arrE[x] = arr[i];
					x++;
			}else {
				arrO[y] = arr[i];
					y++;
			}
		}
		System.out.println("Even Numbers: "+Arrays.toString(arrE));
		System.out.println("Odd Numbers: "+Arrays.toString(arrO));
		
		int sumE = 0;
		int sumO = 0;
		for(int i = 0; i < arrE.length; i++) {
			sumE += arrE[i];
		}
		for(int i = 0; i < arrO.length; i++) {
			sumO += arrO[i];
		}
		System.out.println("Sum of Even Numbers: "+sumE);
		System.out.println("Sum of Odd Numbers: "+sumO);
		
		System.out.println("The Maximum value is: " + Math.max(sumE, sumO));
	}

}
