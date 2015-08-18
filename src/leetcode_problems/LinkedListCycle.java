package leetcode_problems;

public class LinkedListCycle {
    
    public boolean hasCycle(ListNode head) {
        boolean flag = false ;
        ListNode pointer = head , walker = head  ;
        
        while(pointer != null && walker != null &&  pointer.next != null && walker.next != null){
            pointer = pointer.next ;
            walker = walker.next.next;
            if( pointer == walker){
        	flag = true ;
        	break ;
            }
            
        }
        
        return flag ;
    }

}
