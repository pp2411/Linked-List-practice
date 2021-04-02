package LinkedListOp;

public class MoveLastToFirst {

	ListNode move(ListNode head) {
		ListNode itr = head, itr2 = head.next;
		while(itr2.next!=null) {
			itr = itr.next;
			itr2 = itr2.next;
		}
		itr2.next = head;
		itr.next = null;
		return itr2;
	}
	
	public static void main(String[] args) {
		int [] arr = {5,4,2,9,5,7,5,2,1};
		ListNodeOp list = new ListNodeOp();
		for(int i :arr) {
			list.insertEnd(i);
		}
		MoveLastToFirst mv = new MoveLastToFirst();
		list.head = mv.move(list.head);
		list.showList();
	}

}
