package offer.algorithms;

import java.util.HashMap;

//一个链表中包含环，请找出该链表的环的入口结点。
public class ListLoopEntry {
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if( pHead == null )
			return null ;
		HashMap<ListNode, Integer> counts = new HashMap<ListNode, Integer>();
		boolean flag = false;
		while( pHead != null ){
			pHead = pHead.next ;
			if( counts.get(pHead) == null || counts.get(pHead) == 0){
				counts.put(pHead, 1);
			}else{
				flag = true;
				break;
			}
		}
		if( flag)
			return pHead;
		else
			return null;
    }
	public static void main(String[] args) {

	}
}