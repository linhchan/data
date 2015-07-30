public class DoublyLinkedList implements MyList {

	private class Node {
		Object value;
		Node prev;
		Node next;

		Node(Node prev, Object value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
	}
	
	Node root = new Node(null, null, null);
	Node tail = root;
	
	@Override
	public void add(Object value) {
		tail.next = new Node(tail, value, null);
		tail = tail.next;
	}
	
	@Override
	public void add(Object value, int index) {

	}
	
	@Override
	public Object get(int index) {
		if (index >= count()) {
			throw new IndexOutOfBoundsException();
		}
		
		Node cur = root;
		for (int i=0; i <=index; i++) {
			cur = cur.next;
		}
		
		return cur.value;
	}

	@Override
	public void delete(int index) {
		Node cur = root;
		
		for (int i=0; i<= index; i++) {
			cur = cur.next;
		}
		
		cur.prev.next = cur.next;
		if (cur != tail) {
			cur.next.prev = cur.prev;
		} else {
			tail = cur.prev;
		}
	}

	@Override
	public int count() {
		Node cur = root;
		int count = 0;
		
		while (cur != tail) {
			cur = cur.next;
			count ++;
		}
		return count;
	}
}
