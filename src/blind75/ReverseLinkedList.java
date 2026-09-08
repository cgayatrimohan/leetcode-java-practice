package blind75;

public class ReverseLinkedList {

	@SuppressWarnings("unused")
	private Node reverseLinkedList(Node head) {
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}
	
	public class Node {
		int val;
		Node next;
		
		public Node() {}
		public Node(int val) {
			this.val = val;
		}
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
}
