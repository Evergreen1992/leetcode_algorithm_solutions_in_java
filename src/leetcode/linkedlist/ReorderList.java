package leetcode.linkedlist;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
}

public class ReorderList {
	public static void reorderList(ListNode head) {
		if( head == null || head.next == null)
			return ;
        int len = 0;
        ListNode p = head ;
        while( p != null){
        	len ++ ;
        	p = p.next ;
        }
        ListNode[] arr = new ListNode[len];
        p = head ;
        for( int i = 0 ; i < len; i ++){
        	arr[i] = p ;
        	p = p.next ;
        }
        for( int i = 0 ; i < len; i ++){
        	arr[i].next = null ;
        }
        //
        int count_odd = 0;
        int count_even = 0;
        for( int i = 0 ; i < len ; i ++){
        	if( i % 2 == 0){
        		arr[count_odd].next = arr[len - 1 - count_odd];
        		//System.out.println(count_odd + "->" + (len - 1 - count_odd));
        		count_odd ++ ;
        	}else{
        		arr[len - 1 - count_even].next = arr[count_odd];
        		//System.out.println((len - 1 - count_even) + "->" + count_odd);
        		count_even ++ ;
        	}
        }
        arr[len / 2].next = null ;
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
		
		reorderList(l1);
		while( l1 != null){
			System.out.print(l1.val + "->");
			l1 = l1.next;
		}
	}
}