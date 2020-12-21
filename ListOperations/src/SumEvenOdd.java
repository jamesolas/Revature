//)Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SumEvenOdd {

	public static void main(String[] args) {
		List<Integer> li1 = new LinkedList<>();
		li1.add(1);
		li1.add(2);
		li1.add(3);
		li1.add(4);
		System.out.println(li1);
		
		List<Integer> li2 = new LinkedList<>();
		List<Integer> li3 = new LinkedList<>();
	
		for(int i = 0; i < li1.size(); i++) {
			if(li1.get(i) % 2 == 0) {
				int j = 0;
				li2.add(j, li1.get(i));
				j++;
			}
		}
		Collections.sort(li2);
		System.out.print("Even numers: "+li2);
		
			System.out.println("");
			
			for(int i = 0; i < li1.size(); i++) {
				if(li1.get(i) % 2 != 0) {
					int j = 0;
					li3.add(j, li1.get(i));
					j++;
				}
			}
		Collections.sort(li3);
		System.out.println("Odd numbers: "+li3);
		
		int evenSum = 0;
		
		for(int i: li2) {
			evenSum += i;
		}
		System.out.println("Even Sum: "+evenSum);
		
		int oddSum = 0;
		
		for(int i: li3) {
			oddSum += i;
		}
		System.out.println("Odd Sum: "+oddSum);
	
		System.out.println("Max is: "+Math.max(evenSum, oddSum));
		
	
	}	

}
