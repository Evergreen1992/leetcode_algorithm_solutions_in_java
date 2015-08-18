package leetcode_problems;


public class MergeTwoSortedLists {
    static class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
	    val = x;
	}
    }

    public static void print(ListNode head){
	while( head != null){
	    System.out.print(head.val + "->");
	    head=head.next;
	}
	System.out.println();
    }
    
    public static void main(String[] args) {
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	
	n1.next = null;
	n2.next = null ;
	
	
	print(mergeTwoLists(n2, n1));
	
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {// 1 5 7 9
	ListNode  p = l1 ;
	if( l1 == null || l2 == null)
	    return l1 == null ? l2 : l1 ;

	while (l2 != null) {
	    ListNode node = new ListNode(l2.val);
	    while( p != null){
		if( node.val > p.val)
		    break;
		p = p.next ;
	    }
	    if( p != null){
		  node.next = p.next ;
		  p.next = node ;
	    }else{
		  node.next = null;
	    }
	   
	    
	    l2 = l2.next;
	}
	return p;
    }
}