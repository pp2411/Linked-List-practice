package LinkedListOp;

public class MergeTwoSortedLL {

	ListNode merge(ListNode head1, ListNode head2) {
		
		ListNode ret ;
		if(head2 == null ) return head1;
		if(head1 == null ) return head2;
		if(head1.data>head2.data) {
			ret = head2;
			head2 = head2.next;
		}
		
		else {
			ret = head1;
			head1 = head1.next;
		}
		
		ListNode itr = ret;
		
		while(head1!=null && head2 != null) {
			
			if(head1.data > head2.data) {
				itr.next = head2;
				itr = itr.next;
				head2 = head2.next;
			}
			
			else {
				itr.next = head1;
				itr = itr.next;
				head1 = head1.next;
			}
			
		}
		
		if(head1 != null) {
			itr.next = head1;
		}
		
		else if(head2 != null) {
			itr.next = head2; 
		}
		return ret;
	}
	
	public static void main(String[] args) {
		
		int[] l1 = {1,2,3};
		int[] l2 = {2,3,4,6,10};
		ListNodeOp list1 = new ListNodeOp();
		ListNodeOp list2 = new ListNodeOp();
		
		for(int i :l1) {
			list1.insertEnd(i);
		}
		
		for(int i :l2) {
			list2.insertEnd(i);
		}
		
		MergeTwoSortedLL mg = new MergeTwoSortedLL();
		list1.head = mg.merge(list1.head, list2.head);
		list1.showList();
	}

}
