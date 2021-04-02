package LinkedListOp;

public class AddNosLL {

	static ListNode addLL(ListNode head1, ListNode head2 , int c) {
		int n1, n2;
		if(head1 == null && head2 == null && c!=0) {
			return new ListNode(c,null);
		}
		if(head1 == null && head2 == null && c==0) {
			return null;
		}
		if(head1 == null) {
			n1 = 0;
			n2 = head2.data;
			return new ListNode((n2+c)%10,addLL(null, head2.next,(n2+c)/10));
		}
		if(head2 == null) {
			n2 = 0;
			n1 = head1.data;
			return new ListNode((n1+c)%10,addLL(head1.next, null,(n1+c)/10));
		}
		n1 = head1.data;
		n2 = head2.data;
		return new ListNode((n1+n2+c)%10,addLL(head1.next,head2.next,(n1+n2+c)/10));
	}
	
	public static void main(String[] args) {
		int num1 = 9999;
		int num2 = 1;
		ListNodeOp list1 = new ListNodeOp();
		while(num1>0) {
			list1.insertEnd(num1%10);
			num1/=10;
		}
		ListNodeOp list2 = new ListNodeOp();
		while(num2>0) {
			list2.insertEnd(num2%10);
			num2/=10;
		}
		ListNodeOp list3 = new ListNodeOp();
		list3.head = addLL(list1.head, list2.head, 0 );
		list3.showList();
	}

}
