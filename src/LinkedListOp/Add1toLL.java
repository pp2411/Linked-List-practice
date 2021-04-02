package LinkedListOp;

public class Add1toLL {
	static void add1(ListNode head) {
		if(head.data+1>9) {
			head.data = 0;
			if(head.next==null) {
				ListNode temp = new ListNode(1);
				head.next = temp;
			}
			else add1(head.next);
		}
		else head.data+=1;
	}
	
	public static void main(String[] args) {
		int num = 783217821;
		ListNodeOp list = new ListNodeOp();
		while(num!=0) {
			list.insertEnd(num%10);
			num/=10;
		}
//		list.showList();
		add1(list.head);
		list.showList();
	}

}
