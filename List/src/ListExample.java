import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
			li.add(1);
			li.add(5);
			li.add(10);
			li.add(6);
			System.out.println(li);
			li.add(null);
			System.out.println(li);
			li.set(3, 12);
			System.out.println(li);
			System.out.println("list size: " + li.size());
			li.remove(2);
			System.out.println(li);
			System.out.println("li contains 20: " + li.contains(20));
			System.out.println("li contains 1: " + li.contains(1));
			
			for (int i = 0; i < li.size(); i++) {
				System.out.print(li.get(i) + " ");
			}
			
			System.out.println("\n");
			
			for (Integer i: li) {
				System.out.print(i + " ");
			}
			
			System.out.println("\n");
			
			Collections.reverse(li);
			System.out.println(li);
			
			Collections.shuffle(li);
			System.out.println(li);
			
			Collections.replaceAll(li, null, 2);
			System.out.println(li);
			
			Collections.sort(li);
			System.out.println(li);
			
			Collections.sort(li, Collections.reverseOrder());	
			System.out.println(li);
			
			Collections.sort(li);
			System.out.println(li);
			System.out.println(Collections.binarySearch(li, 5) +  " Binary search for the number 5.");
			System.out.println(Collections.binarySearch(li, 44) + " Binary search for the number 44.");
		
		
	}

}
