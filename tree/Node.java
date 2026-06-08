package tree;

public class Node {
	int data;
	Node prev, next;

	public Node(int val) {
		this.data = val;
		this.prev = null;
		this.next = null;
	}

}