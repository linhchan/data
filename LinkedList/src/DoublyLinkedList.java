/**
 * @author linhchan head ->n1 >n2 >n3 >n4 >null index: 0 1 2 3
 */

public class DoublyLinkedList implements MyList {

	private static class Node {
		Object value;
		Node next;
		Node prev;

		public Node(Node prev, Object value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
	}

	private final Node head = new Node(null, null, null);
	private Node tail = head;

	@Override
	public void add(Object value) {
		tail.next = new Node(tail, value, null);
		tail = tail.next;
	}

	@Override
	public void add(Object value, int index) {
		if (index >= count() || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index
					+ " is out of bounds");
		}

		Node cur = head;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		cur.next = new Node(cur, value, cur.next);
		// Sine you stop at index itself, but cur is one index
		// ahead so it will point to an index one over.

		cur.next.next.prev = cur.next;
		tail = cur.next.next;
	}

	@Override
	public Object get(int index) {
		if (index >= count() || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index
					+ " is out of bounds");
		}

		Node cur = head;
		for (int i = 0; i <= index; i++) {
			cur = cur.next;
		}

		return cur.value;
	}

	@Override
	public void delete(int index) {
		if (index >= count() || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index
					+ " is out of bounds");
		}

		Node cur = head;
		for (int i = 0; i <= index; i++) {
			cur = cur.next;
		}

		// If index to be removed is last in link, set tail
		if (cur.next == null) {
			tail = cur.prev;
		} else {
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
			// TODO: Does tail have to be set here?
		}
	}

	@Override
	public int count() {
		Node cur = head;
		int c = 0;

		while (cur != tail) {
			cur = cur.next;
			c++;
		}

		return c;
	}
}