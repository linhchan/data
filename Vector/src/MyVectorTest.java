import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MyVectorTest {

	MyVector v = new MyVector(3);
	
	public void setup() {
		v.append(3);
		v.append(2);
		v.append(10);
		v.append(-2);
	}
	@Test
	public void testGet() {
		setup();
		assertEquals(v.get(0), 3);
	}
	
	@Test
	public void testSize() {
		setup();
		assertEquals(v.size(), 4);
	}

}
