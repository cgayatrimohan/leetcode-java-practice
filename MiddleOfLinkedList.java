package leetCode;

/*
 *   876. Middle of The Linked List
 */
public class MiddleOfLinkedList {
	/**
	 * Definition for singly-linked list. (check the class ListNode)
	 */
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
			
		}
		
		ListNode(int val) { 
			this.val = val;
		}
		
		ListNode(int val, ListNode next) { 
			this.val = val; 
			this.next = next; 
		}
	}
}
