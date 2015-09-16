package leetcode_problems;

//dynamic programming
public class ClimbStairs {
    public int[] data = null;
    
    public int climbStairs(int n) {
	if( data == null)
	    data = new int[n];
	
	if( data[n - 1] > 0 )
	    return data[n - 1];
	
        if( n == 1)
            return 1 ;
        else if( n == 2)
            return 2 ;
        else {
            int temp1 = climbStairs(n - 1) ;
            int temp2 = climbStairs(n - 2) ;
            
            data[n - 1 - 1] = temp1 ;
            data[n - 2 - 1] = temp2 ;
            
            return  temp1 + temp2 ;
        }
    }

    public static void main(String[] args) {
		System.out.println(new ClimbStairs().climbStairs(3));
    }

}
