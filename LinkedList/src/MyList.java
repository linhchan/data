public interface MyList {
	void add(Object value);

	void add(Object value, int index);

	Object get(int index);

	void delete(int index);

	int count();
}
