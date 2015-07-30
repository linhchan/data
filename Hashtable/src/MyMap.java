import java.util.ArrayList;
import java.util.List;

public class MyMap implements Map {

	List<List<Pair>> hm = new ArrayList<List<Pair>>();

	public MyMap(int size) {
		for (int i = 0; i < size; i++) {
			hm.add(new ArrayList<Pair>());
		}
	}

	@Override
	public void put(Object key, Object value) {
		if (key == null) {
			throw new NullPointerException("The key cannot be null");
		}

		int index = key.hashCode() % hm.size();

		for (int i = 0; i < hm.get(index).size(); i++) {
			if (hm.get(index).get(i).getKey().equals(key)) {
				hm.get(index).set(i, new Pair(key, value));
				return;
			}

		}

		hm.get(index).add(new Pair(key, value));

	}

	@Override
	public Object get(Object key) {
		int index = key.hashCode() % hm.size();
		for (int i = 0; i < hm.get(index).size(); i++) {
			if (hm.get(index).get(i).getKey().equals(key)) {
				return hm.get(index).get(i).getValue();
			}
		}
		return null;
	}

	@Override
	public Boolean containsKey(Object key) {
		return get(key) != null;
	}
}