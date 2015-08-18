package leetcode_problems;

/**
     1    2    3     2      1
 * @author Administrator
 *
 */
public class PalindromeLinkedList {
    
    public static void display(ListNode head){
	while( head != null){
	    System.out.print(head.val + " -> ");
	    head = head.next ;
	}
	System.out.println();
    }
    
    //逆置链表
    public static ListNode  reverse(ListNode head, ListNode tail){
	ListNode p = head , pre = head , newHead = null,  end = tail.next;//   1->2-> 3   3  2   1
	
	while( p != end){
	    p = p.next ;
	    if( pre == head){
		pre.next = end ;
	    }else{
		pre.next = newHead ;
	    }
	    
	    newHead = pre ;
	    pre = p ;
	}
	
	return newHead ;
    }
    
    //比较前后半个链表是否相同
    public static boolean compare(ListNode p1, ListNode p2){
	boolean flag = true ;
	while( p2  !=  null ){
	    if( p1.val != p2.val){
		flag = false ;
		break ;
	    }
	    p1 = p1.next ;
	    p2 = p2.next ;
	}
	return flag ;
    }
    
    public static boolean isPalindrome(ListNode head) {
      
        if( head == null ||  head.next == null)
            return true ;
        //找到中间点，并逆置前半链表
        int len = 0 ;
        ListNode p = head, middle = null  , temp = null ;
        
        while( p != null){
            len ++ ;
            p = p.next ;
        }

        if( len / 2  <= 0)
            return false ;
        middle = head ;
        for( int i = 1 ; i < len / 2 ; i ++){
            middle = middle.next ;
        }
        temp = len % 2 == 0 ? middle.next : middle.next.next ;
        //逆置前半部分链表。
        head = reverse(head, middle);
        //比较        
        return compare(head, temp); 
    }

    public static void main(String[] args) {
	ListNode p1 = new ListNode(1);
	ListNode p2 = new ListNode(2);
	ListNode p3 = new ListNode(3);
	ListNode p4 = new ListNode(3);
	ListNode p5 = new ListNode(2);
	ListNode p6 = new ListNode(1);
	
	p1.next = p2 ;//   1   2   2   1
	p2.next = p3 ;//   1   2   3   2   1//   2   1   3   2   1
	p3.next = p4 ;
	p4.next = p5 ;
	p5.next = p6 ;
	p6.next = null ;
	
	display(p1);
	
	//display(reverse(p1, p2));
	System.out.println(isPalindrome(p6));
    }
}