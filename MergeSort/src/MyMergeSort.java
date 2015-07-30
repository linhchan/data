import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyMergeSort {

	public static List<Integer> sort(List<Integer> numbers, Comparator<Integer> comparator) {

		List<Integer> lhs = new ArrayList<Integer>();
		List<Integer> rhs = new ArrayList<Integer>();

		if (numbers.size() <= 1) {
			return numbers;
		}

		int id = 0;
		while (id < numbers.size() / 2) {
			lhs.add(numbers.get(id));
			id++;
		}

		while (id < numbers.size()) {
			rhs.add(numbers.get(id));
			id++;
		}

		// Recursively sort left and right subarrays
		List<Integer> sortedlhs = sort(lhs, comparator);
		List<Integer> sortedrhs = sort(rhs, comparator);
		List<Integer> sortedList = new ArrayList<Integer>();

		int i = 0;
		int j = 0;

		// Merge sorted left and right subarrays
		while (i < sortedlhs.size() && j < sortedrhs.size()) {
			int r = comparator.compare(sortedlhs.get(i), sortedrhs.get(j));

			if (r <= 0) {
				sortedList.add(sortedlhs.get(i));
				i++;
			} else {
				sortedList.add(sortedrhs.get(j));
				j++;
			}
		}

		while (i < sortedlhs.size()) {
			sortedList.add(sortedlhs.get(i));
			i++;
		}

		while (j < sortedrhs.size()) {
			sortedList.add(sortedrhs.get(j));
			j++;
		}

		return sortedList;
	}
}