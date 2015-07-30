import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest {

	DoublyLinkedList dll = new DoublyLinkedList();

	@Before
	public void setup() {
		dll.add(2);
		dll.add(3);
		dll.add(4);
		dll.add(5);
	}

	@Test
	public void testGet() {
		try {
			dll.get(4);
			fail("Not yet implemented");
		} catch (IndexOutOfBoundsException e) {

		}

		assertEquals(5, dll.get(3));
	}

	@Test
	public void testDelete() {
		try {
			dll.delete(5);
			fail("Not yet implemented");
		} catch (IndexOutOfBoundsException e) {

		}

		dll.delete(2);
		assertEquals(5, dll.get(2));

		dll.delete(0);
		assertEquals(3, dll.get(0));
		assertEquals(5, dll.get(1));
	}

	@Test
	public void testCount() {
		assertEquals(4, dll.count());
	}

	@Test
	public void testAddtoIndex() {
		DoublyLinkedList a = new DoublyLinkedList();

		a.add(1);
		a.add(2);
		a.delete(1);
		a.add(2, 0);

		assertEquals(2, a.count());
		assertEquals(1, a.get(1));
		assertEquals(2, a.get(0));
	}

	@Test
	public void testAddAfterDelete() {
		DoublyLinkedList l = new DoublyLinkedList();

		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.delete(2);
		l.delete(1);
		l.add(4);

		assertEquals(3, l.count());
		assertEquals(0, l.get(0));
		assertEquals(4, l.get(2));
	}

}