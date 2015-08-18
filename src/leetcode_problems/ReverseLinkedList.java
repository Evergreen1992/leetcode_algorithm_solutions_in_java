package leetcode_problems;



public class ReverseLinkedList {
    
    static class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
    }
    //   1    2    3    4   5
    // 3  2    1
    public static ListNode reverseList(ListNode head) {
	
	ListNode pre , curr , temp ;
	pre = head;
	if( head != null){
	    curr = head.next ;
	    while( curr != null){
		    temp = curr.next;
		    curr.next = pre ;
		    pre = curr ;
		    curr = temp ;
	    }
	    head.next = null ;
	}
	
        return pre;
    }
    
    public static void print(ListNode head){
	while( head != null){
	    System.out.print(head.val + "->");
	    head=head.next;
	}
	System.out.println();
    }

    public static void main(String[] args) {
	ListNode head = new ListNode(1);
	ListNode n1 = new ListNode(2);
	head.next = n1;
	n1.next = null ;
	
	print(head);

	print(reverseList(head));
    }

}
