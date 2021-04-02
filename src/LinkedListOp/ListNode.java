package LinkedListOp;

public class ListNode {
	int data;
	ListNode next;
	ListNode(){
	}
	ListNode(int key){
		this.data = key;
		this.next = null;
	}
	ListNode(int key, ListNode node){
		this.data = key;
		this.next = node;
	}
}
