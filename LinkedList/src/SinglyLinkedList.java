/**
 * @author linhchan 
 * head ->n1 >n2 >n3 >n4 >null 
 * index: 0   1   2   3
 */
public class SinglyLinkedList implements MyList {

	private static class Node {
		Object value;
		Node next;

		private Node(Object value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	private final Node head = new Node(null, null);

	@Override
	public void add(Object value) {
		Node cur = head;

		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = new Node(value, null);
	}

	@Override
	public void add(Object value, int index) {
		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}

		Node cur = head;

		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		cur.next = new Node(value, cur.next);
	}

	@Override
	public Object get(int index) {
		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}

		Node cur = head;
		for (int i = 0; i <= index; i++) {
			cur = cur.next;
		}

		return cur.value;
	}

	@Override
	public void delete(int index) {
		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}

		Node cur = head;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}

		cur.next = cur.next.next;
	}

	@Override
	public int count() {
		Node cur = head;
		int c = 0;

		while (cur.next != null) {
			cur = cur.next;
			c++;
		}

		return c;
	}

}
