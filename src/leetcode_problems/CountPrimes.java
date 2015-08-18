package leetcode_problems;

public class CountPrimes {
    
    public int countPrimes(int n) {
	int count = 0 ;
	boolean[] used = new boolean[n];
	
	if( n <= 2)
	    return 0 ;
	
	for( int i = 2 ; i <=(int)Math.sqrt( n )  ; i ++){
	   if( !used[i - 1] ){
	       int j = 2 ;
	       while( i * j < n){
		   used[i * j - 1 ] = true ;
		   j ++ ;
	       }
	   }
	}
	
	for( int i = 0 ; i < n - 1 ; i ++){
	    if( !used[i] )
		count ++ ;
	}
	
        return count - 1 ;
    }
    
    
    public static void main(String[] args) {
	System.out.println(new CountPrimes().countPrimes(3));
    }

}
