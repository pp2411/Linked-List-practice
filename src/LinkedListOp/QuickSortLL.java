package LinkedListOp;

public class QuickSortLL {

	void swapNextOfNodes(ListNode i,ListNode j){
		ListNode temp = j.next;
		j.next = i.next;
		i.next = temp;
	}
	
	ListNode partition(ListNode head, ListNode last) {
		ListNode last = head;
		while(last.next!=null) last = last.next;
		ListNode i = null;
		ListNode j = head;
		while(j.next.next!=last) {
			if(j.next.data<last.data) {
				if(i==null) {
					i = head;
				}
				else {
					swapNextOfNodes(i,j);
					i = i.next;
				}
			}
		}
		j= j.next;
		swapNextOfNodes(i,j);
		return i.next;
	}
	
	ListNode quickSort(ListNode head, ListNode last) {
		if(head == null || head.next == null ) return head;
		ListNode part = partition(head,last);
		ListNode itr = head;
		while(itr.next!= part) itr= itr.next;
		
		itr = part;
		while(itr.next!= null) itr= itr.next;
		
	}
	
	public static void main(String[] args) {
		ListNodeOp list = new ListNodeOp();
		int arr[] = {5,3,3,7,9,0,8,3,2,5,1,2,3};
		for(int i : arr) {
			list.insertEnd(i);
		}
		
		QuickSortLL mg = new QuickSortLL();
		list.head = mg.quickSort(list.head);
		list.showList();
	}

}
