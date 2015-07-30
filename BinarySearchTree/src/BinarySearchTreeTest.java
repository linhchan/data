import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class BinarySearchTreeTest {
	BinarySearchTree bst = new BinarySearchTree();
	
	public void setup() {
		bst.add(5);
		bst.add(3);
		bst.add(0);
		bst.add(10);
		bst.add(6);
		bst.add(4);
		bst.add(7);
	}

	@Test
	public void testHas() {
		setup();
		assertTrue(bst.has(10));
		assertTrue(bst.has(3));
		assertFalse(bst.has(1));
		
	}

	@Test
	public void testDelete() {
		setup();
		bst.delete(10);
		assertFalse(bst.has(10));
	}

}