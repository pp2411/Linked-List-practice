package LinkedListOp;

public class MergeSortLL {
	
	ListNode getMid(ListNode head) {
		if(head == null || head.next == null ) return head;
		ListNode slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	ListNode mergeSort(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode mid = getMid(head);
		ListNode nextToMid = mid.next;
		mid.next = null;
		ListNode left = mergeSort(head);
		ListNode right = mergeSort(nextToMid);
		MergeTwoSortedLL mg = new MergeTwoSortedLL();
		return mg.merge(left, right);
	}
	
	public static void main(String[] args) {
		ListNodeOp list = new ListNodeOp();
		int arr[] = {5,3,3,7,9,0,8,3,2,5,1,2,3};
		for(int i : arr) {
			list.insertEnd(i);
		}
		
		MergeSortLL mg = new MergeSortLL();
		list.head = mg.mergeSort(list.head);
		list.showList();
	}

}
