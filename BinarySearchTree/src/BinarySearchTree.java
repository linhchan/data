public class BinarySearchTree {

	private Node root;

	// Constructor
	public BinarySearchTree() {
		root = null;
	}

	public void add(int data) {
		if (root == null) {
			root = new Node(null, null, null, data);
			return;
		}

		addInternal(root, data);
	}

	public void addInternal(Node node, int data) {
		if (data <= node.value) {
			if (node.left == null) {
				node.left = new Node(node, null, null, data);
				return;
			}
			
			addInternal(node.left, data);
		} else if (data > node.value) {
			if (node.right == null) {
				node.right = new Node(node, null, null, data);
				return;
			}
			addInternal(node.right, data);
		}

	}

	public boolean has(int value) {
		return hasInternal(root, value);

	}

	public boolean hasInternal(Node node, int data) {
		if (node == null) {
			return false;
		}

		if (data == node.value) {
			return true;
		} else if (data < node.value) {
			return hasInternal(node.left, data);
		} else {
			return hasInternal(node.right, data);
		}
	}
		
	public void delete(int value) {
		deleteInternal(root, value);
	}
	
	public void deleteInternal(Node node, int data) {
		// Empty tree
		if (node == null) {
			return;
		}
		
		if (data < node.value) {
			deleteInternal(node.left, data);
		} else if (data > node.value) {
			deleteInternal(node.right, data);
		}
		
		Node replacement = node.right;
		
		if (replacement != null) {
			if (node.left != null) {
				Node smallest = replacement;
				while (smallest.left != null) {
                    smallest = smallest.left;
                }
				
				smallest.left = node.left;
                node.left.parent = smallest;
			}
		} else {
			replacement = node.left;
		}
		
		if (node.parent == null) {
            this.root = replacement;
        } else if (node.parent.left != null && node.parent.left.value == data) {
            node.parent.left = replacement;
        } else {
            node.parent.right = replacement;
        }

        if (replacement != null) {
            replacement.parent = node.parent;
        }

        return;
    }
		
}