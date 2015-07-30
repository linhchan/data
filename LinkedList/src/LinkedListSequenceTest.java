import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListSequenceTest {

	SinglyLinkedList sll = new SinglyLinkedList();

	@Before
	public void setup() {
		//1->5->4->3->6->7->2
		sll.add(1);
		sll.add(5);
		sll.add(4);
		sll.add(3);
		sll.add(6);
		sll.add(7);
		sll.add(2);
	}

	@Test
	public void testCount() {
		assertEquals(7, sll.count());
	}

}
