package offer.algorithms;

import java.util.Stack;

//输入一个链表，输出该链表中倒数第k个结点。
class KthNodeFromTail {
	public ListNode FindKthToTail(ListNode head,int k) {
		if( k <= 0)
			return null ;
		Stack<ListNode> stack = new Stack<ListNode>();
		while( head != null ){
			stack.push(head);
			head = head.next ;
		}
		ListNode result = null ;
		for(int i = 1; i < k; i ++){
			if( !stack.isEmpty())
				stack.pop();
		}
		if( !stack.isEmpty())
			result = stack.pop();
		return result;
    }
	public static void main(String[] args) {

	}
}