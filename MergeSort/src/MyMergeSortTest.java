import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import java.util.Comparator;
import java.util.ArrayList;

public class MyMergeSortTest {

	private static class MyComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	}

	List<Integer> num = new ArrayList<Integer>() {{ add(99); add(2); add(1); add(2); add(95);}};
	MyMergeSort sortList = new MyMergeSort();
	Comparator<Integer> comparator = new MyComparator();

	@Test
	public void testMergeSort() {
		List<Integer> sortednum = new ArrayList<Integer>() {{ add(1); add(2); add(2); add(95); add(99);}};
		
		assertEquals(sortednum, sortList.sort(num, comparator));
		assertTrue(1 == (sortList.sort(num, comparator)).get(0));
		
	}
}