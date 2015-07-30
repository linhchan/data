import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DoublyLinkedListTest {
	
	DoublyLinkedList dll = new DoublyLinkedList();
	
	@Before
	public void setup() {
		dll.add(2); // 0
		dll.add(3); // 1
		dll.add(4); // 2
		dll.add(5); // 3
	}

	@Test
	public void testGet() {
		assertEquals(3, dll.get(1));
		assertEquals(4, dll.get(2));
	}
	
	@Test
	public void testCount() {
		assertEquals(4, dll.count());
	}
	
	@Test
	public void testDelete() {
		dll.delete(3);
		assertEquals(3, dll.count());
		
		dll.delete(1);
		assertEquals(4, dll.get(1));
	}
}
