package offer.algorithms;
/**
1 
   2 
      3 4 5 6
   3 
 * @author Evergreen
 *
 */
public class ListCommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int len1 = 0, len2 = 0 ;
		ListNode p1 = pHead1, p2 = pHead2  ;
		while( p1 != null ){
			len1 ++ ;
			p1 = p1.next ;
		}
		while( p2 != null ){
			len2 ++ ;
			p2 = p2.next ;
		}
		p1 = pHead1;
		p2 = pHead2 ;
		for(int i = 0 ; i < (len1 >= len2 ? len1 - len2 : len2 - len1); i ++){
			if( len1 > len2){
				p1 = p1.next ;
			}else{
				p2 = p2.next ;
			}
		}
		//find
		while( p1 != p2){
			p1 = p1.next ;
			p2 = p2.next ;
		}
		return p1 ;
    }
	public static void main(String[] args) {

	}

}
