//3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindEvenOdd {

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
		System.out.print("Even: "+li2);
			System.out.println("");
			
			for(int i = 0; i < li1.size(); i++) {
				if(li1.get(i) % 2 != 0) {
					int j = 0;
					li3.add(j, li1.get(i));
					j++;
				}
			}
		Collections.sort(li3);
		System.out.println("Odd: "+li3);
	}	
}
