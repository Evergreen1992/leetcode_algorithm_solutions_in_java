package leetcode.sort;

public class SortList {
    
    public static ListNode sortList(ListNode head) {
		if( head == null || head.next == null)
		    return head ;
		ListNode p_pre = head , p = head , curr = head.next, curr_pre = curr  ;
		p.next = null ;
		while( curr != null ){
			p_pre = head ;
			p = p_pre ;
			//find insert position
			while( p != null ){
				if( p.val >= curr.val)
					break;
				p_pre = p ;
				p = p.next ;
			}
			curr_pre = curr ;
			curr = curr.next ;
			if( p == head){
				head = curr_pre ;
				head.next = p_pre ;
			}else{
				p_pre.next = curr_pre ;
				curr_pre.next = p ;
			}
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
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
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
