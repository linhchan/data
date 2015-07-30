import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListOp {

	/** Given a linked list and a number n, find all the numbers less than n
	 * and all numbers greater than n, and put them in two different sub linked lists
	 *  8 -> 1 -> 4 -> 16 -> 5 -> 12 -> 24 -> 2 -> None
	 */
	
	public static void main(String[] args) {
		List<Integer> in = new LinkedList<Integer>();
		in.add(9);
		in.add(40);
		in.add(5);
		in.add(59);
		in.add(11);
		Integer n = 10; // say, n is 10
		
		List<Integer> in_small = new LinkedList<Integer>();
		List<Integer> in_big = new LinkedList<Integer>();
		
		Iterator<Integer> i = in.iterator();
		while (i.hasNext()) {
			Integer value = i.next();
			if (value <= n) {
				in_small.add(value);
			} else {
				in_big.add(value);
			}
		}
		
		System.out.print(in_small);
		System.out.print(in_big);
		
	}
	
}
