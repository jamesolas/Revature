import java.util.Collections;
import java.util.LinkedList;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li = new LinkedList();
			li.add(1);
			li.add(2);
			li.add(3);
			
		Collections.reverse(li);
		System.out.println(li);
	}

}
