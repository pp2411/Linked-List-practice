package LinkedListOp;

public class PallindromeLL {

	static ListNode reverse(ListNode head) {
		if (head==null || head.next==null) return head;
		ListNode p = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
	
	public static void main(String[] args) {
		int[] l1 = {1,2,3,5,2,3,2,1};
		ListNodeOp list1 = new ListNodeOp();
		for(int i :l1) {
			list1.insertEnd(i);
		}
		ListNode slow = list1.head;
		ListNode fast = list1.head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode itr = list1.head;
		int l = 0;
		while(itr!=null) {
			l++;
			itr = itr.next;
		}
		itr = l%2==1?slow.next:slow;
		itr = reverse(itr);
//		ListNodeOp l2 = new ListNodeOp();
//		l2.head = itr;
//		l2.showList();
		slow = list1.head;
		while(itr!=null) {
			if(itr.data != slow.data) break;
			slow = slow.next;
			itr = itr.next;
			
		}
		if(itr != null) System.out.println("not a pallindrome");
		else System.out.println("pallindrome");
	}

}
