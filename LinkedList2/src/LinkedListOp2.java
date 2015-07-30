import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOp2 {

	/**
	 * Given a linked list, find a sequence within it and display sub linked
	 * lists and their size 1 -> 2 -> 3 -> 5 -> 10 -> 9 -> None In this case,
	 * 1>2>3 size of 3, and 10>9 size of 2
	 */

	public static String findSequence(List<Integer> in) {
		if (in.size() < 2) {
			return "";
		}

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> series = new LinkedList<Integer>();
		boolean inIncSeries = false;
		boolean inDecSeries = false;

		// Get the first element
		Integer prev = in.get(0);

		for (int i = 1; i < in.size(); i++) {
			int cur = in.get(i);
			if (cur - prev == 1) {
				if (!inIncSeries) { // if not not in series = if is in series
					inIncSeries = true;
					series.add(prev);
				}

				series.add(cur);
			} else {
				//inSeries = false;
				// not in a series
				if (cur - prev == -1) {
					if (!inDecSeries) { // if not not in series = if is in series
						inDecSeries = true;
						series.add(prev);
					}

					series.add(cur);
				}
				if (inSeries) {
					// break the previous series
					if (!series.isEmpty()) {
						list.add(series);
						inSeries = false;
						series = new LinkedList<Integer>();
					}
				}
			}

			prev = cur;
		}

		// return printAllSeries(list);

		if (list.size() != 0) {
			String totallist = "";
			for (List<Integer> s : list) {
				String str_list = "";
				for (Integer i : s) {
					str_list += i.toString() + ",";
				}
				
				totallist += str_list + "size:" + s.size() + "\n";

			}
			return totallist;
		}
		return null;

	}

	// public static String printAllSeries(List<List<Integer>> list2) {
	// String list = "";
	//
	// for (Integer i : list2) {
	// list += i.toString() + " ";
	// }
	// return list + list2.size();
	//
	// }

	public static void main(String[] args) {
		List<Integer> in = new LinkedList<Integer>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(5);
		in.add(10);
		in.add(9);

		for (Integer i : in) {

		}
	}
}