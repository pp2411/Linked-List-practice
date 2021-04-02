package LinkedListOp;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsorted {

	public static void main(String[] args) {
		int[] l1 = {1,8,8,9,8,9,9,9,8,5,5,5,5,6,7,6,4,5,8};
		ListNodeOp list1 = new ListNodeOp();
		for(int i :l1) {
			list1.insertEnd(i);
		}
		Set<Integer> set = new HashSet<>();
		ListNode itr = null;
		ListNode itr2 = list1.head.next;
		while(itr2!=null) {
			if(set.contains(itr2.data)) {
				itr.next = itr2.next;
				itr2 = itr2.next;
			}
			else {
				set.add(itr2.data);
				itr = itr2;
				itr2 = itr2.next;
			}
		}
		list1.showList();
	}

}
