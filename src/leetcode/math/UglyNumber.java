package leetcode.math;

public class UglyNumber {
    
    public static boolean isUgly(int num) {
	if(num == 0 )
	    return false ;
	while( true ){
	    if( num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
        	    if( num % 2 == 0 )
        		num /= 2 ;
        	    if( num % 3 == 0 )
        		num /= 3 ;
        	    if( num % 5 == 0 )
        		num /= 5 ;
	    }else
		break ;
	}
	return num == 1 ? true : false ;
	    
    }

    public static void main(String[] args) {
	System.out.println(isUgly(0));
    }

}
