package leetcode.linkedlist;

public class IntersectionOfTwoLinkedLists {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if( headA == null || headB == null )
        	return null ;
        ListNode a = headA, b = headB ;
        while( a != b){
        	a = a == null ? headB : a.next ;
        	b = b == null ? headA : b.next ;
        }
		return a ;
    }

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode c1 = new ListNode(1);
		ListNode c2 = new ListNode(2);
		ListNode c3 = new ListNode(3);
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2);
		ListNode b3 = new ListNode(3);
		a1.next=a2;
		a2.next=c1;
		c1.next=c2;
		c2.next=c3;
		c3.next=null;
		b1.next=b2;
		b2.next=b3;
		b3.next=c1;
		
		System.out.println(getIntersectionNode(a1,b1).val);
	}
}