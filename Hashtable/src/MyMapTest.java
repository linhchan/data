import static org.junit.Assert.*;

import org.junit.Test;

public class MyMapTest {

	MyMap hm = new MyMap(5);

	@Test
	public void testGet() {
		hm.put(1, 11);
		hm.put(3, 'a');
		hm.put(3, 'A');
		hm.put('d', 200);
		hm.put(50, null);

		assertEquals(11, hm.get(1));
		assertEquals('A', hm.get(3));
		assertEquals(200, hm.get('d'));
		assertNull(hm.get(50));
		assertFalse(hm.containsKey(5));
	}

	@Test
	public void testNulPointerException() {
		try {
			hm.put(null, 1);
			fail("An exception should have been thrown.");
		} catch (NullPointerException e) {
			// expected
		}
	}
}
