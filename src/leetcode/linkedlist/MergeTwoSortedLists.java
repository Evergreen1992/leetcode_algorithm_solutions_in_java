package leetcode.linkedlist;

public class MergeTwoSortedLists {
    public static void print(ListNode head){
		while( head != null){
		    System.out.print(head.val + "->");
		    head=head.next;
		}
		System.out.println();
    }
    
    public static void main(String[] args) {
		ListNode n1 = new ListNode(-10);
		ListNode n2 = new ListNode(-9);
		ListNode n3 = new ListNode(-6);
		ListNode n4 = new ListNode(-4);
		ListNode n5 = new ListNode(1);
		ListNode n6 = new ListNode(9);
		ListNode n7 = new ListNode(9);
		
		
		ListNode n11 = new ListNode(-5);
		ListNode n12 = new ListNode(-3);
		ListNode n13 = new ListNode(0);
		ListNode n14 = new ListNode(7);
		ListNode n15 = new ListNode(8);
		ListNode n16 = new ListNode(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		n15.next = n16;
		
		print(n1);
		print(n11);
		print(mergeTwoLists(n1, n11));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {// 1 5 7 9
		if( l1 == null || l2 == null)
		    return l1 == null ? l2 : l1 ;
		//依次遍历l2,将结点插入l1。
		ListNode p = l2, l1_pre = l1, l1_p = l1 ;
		while( p != null ){
			//insert current node p into list l1
			ListNode node = new ListNode(p.val);
			l1_pre = l1_p ;
			while( l1_p != null){
				if( l1_p.val > p.val){
					if( l1_p == l1_pre){//insert as head
						node.next = l1_pre ;
						l1_p = node ;
						l1_pre = l1_p ;
						l1 = l1_p ;
					}else{
						l1_pre.next = node ;
						node.next = l1_p ;
					}
					//l1_pre = node ;
					l1_p = node ;
					break;
				}
				l1_pre = l1_p ;
				l1_p = l1_p.next ;
			}
			if( l1_p == null){
				l1_pre.next = node ;
				l1_p = node ;
			}
			p = p.next ;
		}
		return l1 ;
    }
}