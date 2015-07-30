public class Node {
	Node left;
	Node right;
	Node parent;
	int value;

	Node(Node parent, Node left, Node right, int value) {
		this.parent = parent;
		this.left = left;
		this.right = right;
		this.value = value;
	}
}