package offer.algorithms;

public class MeargeLists {
	public static ListNode Merge(ListNode list1,ListNode list2) {
		ListNode  p1 = list1 , p2 = list2, head = null , p = null  ;
		if( p2 == null )
			return p1 ;
		if( p1 == null)
			return p2 ;
		while( p1 != null && p2 != null ){
			if( p1.val <= p2.val){
				if( head == null){
					head = p1 ;
					p = head;
				}else{
					p.next = p1 ;
					p = p.next;
				}
				p1 = p1.next ;
			}else{
				if( head == null){
					head = p2 ;
					p = head;
				}else{
					p.next = p2 ;
					p = p.next;
				}
				p2 = p2.next ;
			}
		}
		if( p1 != null)
			p.next = p1 ;
		if( p2 != null)
			p.next = p2 ;
		return head ;
    }
	public static void main(String[] args) {

	}
}
