package leetcode.linkedlist;

public class OddEvenLinkedList {
	public static ListNode oddEvenList(ListNode head) {
		if( head == null || head.next == null || head.next.next == null)
			return head ;
		
		ListNode p_odd = head , p_even = head.next , head_of_even = p_even;
		while(p_even != null &&  p_even.next != null ){
			p_odd.next = p_even.next ;
			p_even.next = p_odd.next.next ;
			
			p_odd = p_odd.next ;
			p_even = p_even.next;
		}
		p_odd.next = head_of_even;
        return head;
    }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
		ListNode head = oddEvenList(l1);
		while( head != null){
			System.out.print(head.val + "->");
			head = head.next;
		}
	}
}