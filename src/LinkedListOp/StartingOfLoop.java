package LinkedListOp;

public class StartingOfLoop {

	static ListNode loopStarting(ListNode head) {
		ListNode slow = head, fast = head;
		slow = slow.next;
		fast = fast.next.next;
		while(fast!=slow) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = head;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		ListNodeOp list = new ListNodeOp();
		list.insertEnd(5);
		list.insertEnd(7);
		list.insertEnd(4);
		list.insertEnd(0);
		list.insertEnd(3);
		list.insertEnd(2);
		list.insertEnd(8);
		list.insertEnd(6);
		ListNode itr = list.head;
		while(itr.next!=null) {
			itr = itr.next;
		}
		itr.next = list.head.next.next.next;
		System.out.println(loopStarting(list.head).data);
//		list.showList();
	}

}
