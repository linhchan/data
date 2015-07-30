import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
	
	SinglyLinkedList sll = new SinglyLinkedList();
	
	@Before
	public void setup() {
		sll.add(2);
		sll.add(3);
		sll.add(4);
		sll.add(5);
	}

	@Test
	public void testGet() {
		try {
			sll.get(4);
			fail("Not yet implemented");
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		assertEquals(5, sll.get(3));
	}
	
	@Test
	public void testDelete() {
		try {
			sll.delete(5);
			fail("Not yet implemented");
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		sll.delete(2);
		assertEquals(5, sll.get(2));
		
		sll.delete(0);
		assertEquals(3, sll.get(0));
		assertEquals(5, sll.get(1));
	}
	
	@Test
	public void testCount() {
		assertEquals(4, sll.count());
	}
	
	@Test
	public void testAddtoIndex() {
		sll.add(10, 1);
		assertEquals(10, sll.get(1));
		assertEquals(3, sll.get(2));
	}
}