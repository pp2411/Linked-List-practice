package LinkedListOp;
import LinkedListOp.*;
public class reverseList {

	static ListNode reverse(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode p = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
	public static void main(String[] args) {
		ListNodeOp list = new ListNodeOp();
		list.insertEnd(5);
		list.insertEnd(7);
		list.insertEnd(4);
		list.insertEnd(8);
		list.insertEnd(3);
		list.insertEnd(2);
		list.insertEnd(8);
		list.insertEnd(6);
		list.head = reverse(list.head);
		list.showList();
	}

}
