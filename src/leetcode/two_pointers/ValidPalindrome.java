package leetcode.two_pointers;

public class ValidPalindrome {
    
    public static boolean isPalindrome(String s) {
	int start = 0 , tail = s.length() - 1 ;
	boolean flag = false ;
	char p1 , p2 ;
	
	if(s.equals("") || s.equals(" ") || s.length() == 1)
	    return true ;
	
	while( start < tail ){
	    p1 = s.charAt(start);
	    p2 = s.charAt(tail);
	    
	    if( p1 >= 'a' && p1 <= 'z' || p1 >= 'A' && p1 <= 'Z'  || p1 >= '0' && p1 <= '9'){
		
	    }else{
		while(start < s.length()){
		    p1 = s.charAt(start);
		    p2 = s.charAt(tail);
		    if(p1 >= 'a' && p1 <= 'z' || p1 >= 'A' && p1 <= 'Z' || p1 >= '0' && p1 <= '9')
			break ;
		    start ++ ;
		}
		if( start == s.length()){
		    flag = true ;
		    break ;
		}
	    }
	    
	    
	    if( p2 >= 'a' && p2 <= 'z' || p2 >= 'A' && p2 <= 'Z' || p2 >= '0' && p2 <= '9'){
		
	    }else{
		while(tail >= 0 ){
		    p1 = s.charAt(start);
		    p2 = s.charAt(tail);
		    if(p2 >= 'a' && p2 <= 'z' || p2 >= 'A' && p2 <= 'Z' || p2 >= '0' && p2 <= '9')
			break ;
		    tail -- ;
		}
	    }
	    
	    
	    
	    if( start > tail)
		break ;
	    else{
		p1 = s.charAt(start);
		p2 = s.charAt(tail);

		if( p1 == p2  || (int)p1 + 32 == (int)p2 || (int)p2 + 32 == (int)p1){
		    flag = true ;
		}else{
		    flag = false ;
		    break ;
		}
	    }
	    
	    start ++ ;
	    tail -- ;
	}
	return flag ;
    }

    public static void main(String[] args) {
	System.out.println(isPalindrome("a."));
    }
}
