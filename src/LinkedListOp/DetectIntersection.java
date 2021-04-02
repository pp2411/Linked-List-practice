package LinkedListOp;

public class DetectIntersection {
	static String intersect(ListNode head,ListNode head2) {
		int l1 = 0, l2 = 0 ;
		ListNode itr = head;
		while(itr!=null) {
			itr = itr.next;
			l1++;
		}
		itr = head2;
		while(itr!=null) {
			itr = itr.next;
			l2++;
		}
		if(l1>l2) {
			int dif = l1-l2;
			while(dif-- != 0) head = head.next;
		}
		else {
			int dif = l2-l1;
			while(dif-- != 0) head2 = head2.next;
		}
		while(head!=null && head2!=null) {
			if(head.equals(head2)) {
				return "Yes"+head.data;
			}
			head = head.next;
			head2 = head2.next;
		}
		return "No";
	}
	public static void main(String x[]) {
		int[] l1 = {1,2,5,4,3,7,8,9};
		int[] l2 = {4,2,6,7};
		ListNodeOp list1 = new ListNodeOp();
		ListNodeOp list2 = new ListNodeOp();
		for(int i :l1) {
			list1.insertEnd(i);
		}
		for(int i :l2) {
			list2.insertEnd(i);
		}
		ListNode itr = list2.head;
		while(itr.next!=null) itr = itr.next;
		itr.next = list1.head.next.next.next;
		System.out.println(intersect(list1.head,list2.head));
	}
}
