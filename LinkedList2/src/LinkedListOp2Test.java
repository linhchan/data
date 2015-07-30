import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class LinkedListOp2Test {

	@Test
	public void testfindSequence() {
		List<Integer> in = new LinkedList<Integer>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(5);
		in.add(10);
		in.add(9);
		in.add(8);
		in.add(7);
		in.add(3);
		in.add(5);
		
		String expected = "1,2,3,size:3\n10,9,8,7,size:4\n";
		//String expected = "1 2 3 3";
		
		String actual = LinkedListOp2.findSequence(in);
		assertEquals(expected, actual);
		
	}


}
