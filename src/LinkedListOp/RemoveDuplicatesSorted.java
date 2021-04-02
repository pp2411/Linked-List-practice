package LinkedListOp;

public class RemoveDuplicatesSorted {

	public static void main(String[] args) {
		int[] l1 = {1,2,2,2,3,3,3,3,4,5,5,7,8,9};
		ListNodeOp list1 = new ListNodeOp();
		for(int i :l1) {
			list1.insertEnd(i);
		}
		ListNode itr = list1.head;
		ListNode itr2 = list1.head;
		while(itr!=null) {
			while(itr2!=null && itr2.next!=null && itr2.next.data == itr.data) itr2 = itr2.next;
			itr.next = itr2.next;
			itr = itr.next;
		}
		list1.showList();
	}
}
