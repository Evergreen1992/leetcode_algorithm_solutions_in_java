package leetcode.list;


public class removeNhFromEnd {
	
	public static ListNode removeNhFromEnd_(ListNode head, int n) {
		ListNode p1 = head , p2 = head ;
		
		if( head.next == null )
			return null ;
		
		for(int i = 1; i <= n; i ++){
			p2 = p2.next ;
		}
		
		if( p2 == null)
			return head.next ;
		
		while( p2.next != null ){
			p1 = p1.next ;
			p2 = p2.next ;
		}
		p1.next = p1.next.next ;
		
        return head;
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
	
		n1.next = n2;
		n2.next =  null ;
		
		n1 = removeNhFromEnd_(n1, 2);
		while( n1 != null){
			System.out.print(n1.val + "->");
			n1=n1.next;
		}
		System.out.println();
	}

}
