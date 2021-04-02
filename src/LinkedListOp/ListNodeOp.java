package LinkedListOp;
import LinkedListOp.ListNode;

public class ListNodeOp {
	ListNode head = null;
	void insertEnd(int key) {
		ListNode temp = new ListNode(key);
		if(head == null) head = temp;
		else {
			ListNode itr = head;
			while(itr.next != null) {
				itr = itr.next;
			}
			itr.next = temp;
		}
		
	}
	void showList() {
		ListNode itr = head;
		while(itr!=null) {
			System.out.println(itr.data);
			itr= itr.next;
		}
	}
}
