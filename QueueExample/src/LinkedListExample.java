import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		Queue<Integer>ll = new LinkedList<Integer>();
			ll.add(10);
			ll.add(20);
			ll.add(15);
			System.out.println(ll);
			System.out.println(ll.peek()); //print the top element of the linked list
			System.out.println(ll.poll()); //print the top element and remove it
			System.out.println(ll.peek()); //print the top element again
	}

}
