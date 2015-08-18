package leetcode_problems;

public class RemoveLinkedListElements {
    
    public static void print(ListNode head){
	while( head != null){
	    System.out.print(head.val + " - > ");
	    head = head.next ;
	}
	System.out.println();
    }
    
    
    public static ListNode removeElements(ListNode head, int val) {
	ListNode pre = null  ,  p = head ;
	if( head == null )
	    return head ;
	
	pre = head ;
	while( p != null){
	    if( p.val == val){
		if( p == head){
		    head = p.next ;
		}else{
		    pre.next = p.next ;
		    p = p.next ;
		    continue ;
		}
	    }
	    pre = p ;
	    p = p.next ;
	}
	
        return head ;
    }

    public static void main(String[] args) {
	ListNode head = new ListNode(1);
	ListNode p2 = new ListNode(2);
	ListNode p3 = new ListNode(2);
	ListNode p4 = new ListNode(1);
	head.next = p2 ;
	p2.next = p3 ;
	p3.next = p4 ;
	p4.next = null ;
	
	print(head);
	
	print(removeElements(head, 2));
	
    }

}
