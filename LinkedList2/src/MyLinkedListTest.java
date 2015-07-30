import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class MyLinkedListTest {

	MyLinkedList linkedlist =  new MyLinkedList();
	
	@Before
	public void setup() {
		linkedlist.add(2); // 0
		linkedlist.add(3); // 1
		linkedlist.add(4); // 2
		linkedlist.add(5); // 3
	}
	
	@Test
	public void testCount() {
		assertEquals(4, linkedlist.count());
	}
	
	@Test
	public void testGet() {
		assertEquals(4, linkedlist.get(2));
		
		try {
			linkedlist.get(4);
			fail("Out of Index");
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	
	
	@Test
	public void testDelete() {
		linkedlist.delete(1);
		assertEquals(4,linkedlist.get(1));
		
		try {
			linkedlist.delete(5);
			fail("Out of Index");
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	
	@Test
	public void testAdd() {
		MyLinkedList a = new MyLinkedList();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3, 1);
		assertEquals(3, a.get(1));
		assertEquals(2, a.get(2));
	}

}
