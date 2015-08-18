package leetcode_problems;

/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Supposed the linked list is 1 -> 3 -> 4 -> 4 and you are given the third node with value 3, the linked list 
should become 1 -> 2 -> 4 after calling your function.

1   2   4    

 */

public class Solution {
    public void deleteNode(ListNode node) {
       if( node == null)
	   return ;
       if( node.next == null)
	   return ;
       ListNode pre = null;
       while( node.next != null){
	   node.val = node.next.val;
	   pre = node ;
	   node = node.next ;
       }
       pre.next=null;
       
    }
    
    public void print(ListNode node){
	while( node != null){
	    System.out.print(node.val + "、");
	    node=node.next;
	}
	System.out.println();
    }
    
    public static void main(String[] args){
	ListNode l1 = new ListNode(1);
	ListNode l2 = new ListNode(2);
	ListNode l3 = new ListNode(3);
	ListNode l4 = new ListNode(4);
	ListNode l5 = new ListNode(5);
	ListNode head = l1;
	
	l1.next=l2;
	l2.next=l3;
	l3.next=l4;
	l4.next=l5;
	l5.next=null;
	
	Solution s = new Solution();
	s.print(head);
	
	
	s.deleteNode(l1);
	
	s.print(head);
    }
}


