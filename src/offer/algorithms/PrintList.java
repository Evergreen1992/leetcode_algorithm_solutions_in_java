package offer.algorithms;

import java.util.ArrayList;
import java.util.Stack;


public class PrintList {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if( listNode == null )
			return arr;
		
		while(listNode != null ){
			stack.push(listNode);
			listNode = listNode.next ;
		}
		ListNode node = null ;
		while(stack.isEmpty() == false && (node = stack.pop()) != null){
			arr.add(node.val);
		}
        return arr ;
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(58);//58,24,0,67
		ListNode l2 = new ListNode(24);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(67);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null ;
		for(int item : printListFromTailToHead(l1)){
			System.out.println(item);
		}
	}
}
