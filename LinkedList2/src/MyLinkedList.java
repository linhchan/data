public class MyLinkedList implements MyList {
	private class Node {

		Object data;
		Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node root = new Node(null, null);

	@Override
	public void add(Object value) {
		Node cur = root;

		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = new Node(value, null);
	}

	@Override
	public void add(Object value, int index) {
		Node cur = root;

		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		cur.next = new Node(value, cur.next);
	}

	@Override
	public int count() {
		Node cur = root;
		int count = 0;

		while (cur.next != null) {
			cur = cur.next;
			count++;
		}

		return count;
	}

	@Override
	public void delete(int index) {
		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}

		Node cur = root;

		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		// it's important to update the previous node's next pointer, so stop
		// where it is (the previous node) since you can't go backwards.
		cur.next = cur.next.next;
	}

	@Override
	public Object get(int index) {

		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}

		Node cur = root;
		for (int i = 0; i <= index; i++) {
			cur = cur.next;
		}

		return cur.data;
	}
}
