package leetcode.sort;

public class SortList {
    
    public static ListNode sortList(ListNode head) {
	if( head == null || head.next == null)
	    return head ;
	
	
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
	
	print(sortList(l1));
    }

}
