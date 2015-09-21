package leetcode.sort;

public class InsertionSortList {
    
    public static ListNode insertionSortList(ListNode head) {
	if( head == null || head.next == null)
	    return head ;
	ListNode p_j = head.next , p_i  = head  , pre = null ;
	p_i.next = null ;
	while( p_j != null ){
	    p_i = head ;
	    while( p_i != null){
		if( p_i.val <= p_j.val){
		    pre = p_i ;
		    p_i = p_i.next ;
		}else{
		    break ;
		}
	    }
	    if( p_i != null ){
		if( p_i == head ){
		    ListNode node = new ListNode(p_j.val);
		    node.next = head ;
		    head = node ;
		}else{
		    ListNode node = new ListNode(p_j.val);
		    pre.next = node ;
		    node.next = p_i ;
		}
	    }else{
		ListNode node = new ListNode(p_j.val);
		pre.next = node ;
		node.next = null ;
	    }
	    
	    p_j = p_j.next ;
	}
	
        return head ;
    }

    public static void print(ListNode head){
	while( head != null ){
	    System.out.print(head.val + "->");
	    head = head.next ;
	}
	System.out.println();
    }

    public static void main(String[] args) {
	ListNode l1 = new ListNode(5);
	ListNode l2 = new ListNode(2);
	ListNode l3 = new ListNode(1);
	ListNode l4 = new ListNode(6);
	ListNode l5 = new ListNode(8);
	
	l1.next = l2 ;
	l2.next = l3 ;
	l3.next = l4 ;
	l4.next = l5 ;
	
	print(l1);
	
	print(insertionSortList(l1));
    }
}
