import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String>pq = new PriorityQueue<>();
			pq.add("One");
			pq.add("Two");
			pq.add("Three");
		System.out.println(pq);
			pq.remove("Two");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
			pq.add("One");
			pq.add("Two");
		System.out.println(pq);
		
		 Iterator iterator = pq.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next()+" ");
		 }
	}

}
