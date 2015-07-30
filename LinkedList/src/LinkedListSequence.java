
/**
 * Given a linked list, eg: 1->5->4->3->6->7->2
 * find longest sequence and length, eg: 5->4->3 is longest here and length 3,
 * other sequence is 6->7. input head pointer and length.
 *
 */
public class LinkedListSequence {
	
	private class Node {
		Object value;
		Node next;

		Node(Object value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	Node head = new Node(null, null);
	
	public boolean isSequence() {
		return false;
	}

}
