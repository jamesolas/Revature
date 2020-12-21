import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
			h.add("India");
			h.add("France");
			h.add("Nepal");
			h.add("India"); //adding duplicate element
			
		System.out.println(h);
		System.out.println("List contains India or not: " + h.contains("India"));
		
		h.remove("France");
		System.out.println("After removing France: " + h);
		
		System.out.println("Iterating over list");
		Iterator<String> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		HashSet<String> s = new HashSet<String>();
			s.add("France");
			s.add("Canada");
			
		h.addAll(s);
		System.out.println(h);
		
		h.removeAll(s);
		System.out.println(h);
		
		//h.retainAll(s);
		//System.out.println(h);
		
		s.add("India");
		h.retainAll(s); //retain look for elements contained in both collections	
		System.out.println(h);
		
	}	

}
