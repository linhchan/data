import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists {

	private class Node{
	    int data;
	    Node next;
	}
	
	public Node MergeLists(Node list1, Node list2) {
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;

		  if (list1.data <= list2.data) {
		    list1.next = MergeLists(list1.next, list2);
		    return list1;
		  } else {
		    list2.next = MergeLists(list2.next, list1);
		    return list2;
		  }
		}
	
	public static void main (String arge[]) {
		List<Node> in1 = new LinkedList<Node>();
		in1.add(9);
		in1.add(40);
		in1.add(5);
		
		List<Integer> in2 = new LinkedList<Integer>();
		in2.add(8);
		in2.add(1);
		in2.add(10);
		
		List<Integer> in3 = new LinkedList<Integer>();
		
		in3 = MergeLists(in1,in2);
		
		
		
	}
}
