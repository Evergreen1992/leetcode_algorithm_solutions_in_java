package leetcode.math;

public class HappyNumber {
    public static boolean isHappy(int n) {
	int sumBefore = 0 , sum  = 0 ;
	
	while(true){
	    sum = 0 ;
	    while( n > 0 ){
		sum += ( n % 10 ) * (n % 10);
		n /= 10 ;
	    }
	   if(sum < 10){
		if( sum == sumBefore || sum == 1)
		    return true; 
		else
		    break ;
	    }
	    
	    n = sum ;
	    sumBefore = sum ;
	}
	return false ;
    }

    public static void main(String[] args) {
	System.out.println(isHappy(2));
    }
}