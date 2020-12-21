//Find the minimum and the maximum element in a list
import java.util.LinkedList;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> li1 = new LinkedList<>();
			li1.add(1);
			li1.add(6);
			li1.add(0);
			li1.add(4);
			System.out.print(li1);
			System.out.println("");
			
			int min = li1.get(0);
			int max = li1.get(0);
			
		for(int i = 0; i < li1.size(); i++) {
			if(max < li1.get(i)) {
				max = li1.get(i);
			}
			if(min > li1.get(i)) {
				min = li1.get(i);
			}
		
	}
		System.out.println("Min is: "+min);
		System.out.println("Max is: "+max);
	}
}
