import java.util.Arrays;

public class DeleteElementClass {

	public static void main(String[] args) {
		int[] arr= {7,29,34,25};
		System.out.println("Printing out contents before deletion");
		System.out.print(Arrays.toString(arr));
		
		int dPosition = 2;
		for(int i = dPosition-1; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("\n Printing out contents after deletion");
		for(int i = 0; i < arr.length - 1; i++) {	
		System.out.print((arr[i]+" "));
		}
	}

}
