package leetcode.math;

public class AddDigits {
    
    public static int addDigits(int num) {
	int sum = 0; 
	while( true ){
	    sum += num % 10 ;
	    num /= 10 ;
	    if( num <= 0 ){
		if( sum <= 9){
		    break;
		}else{
		    num = sum ;
		    sum = 0 ;
		}
	    }
	}
	return sum ;
    }

    public static void main(String[] args) {
	System.out.println(addDigits(38));
    }

}
