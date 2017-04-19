package company.mi;

public class BitCompare {
    public static int countBitDiff(int m, int n) {
    	int result = 0 ;
    	while( m != 0 || n != 0 ){
    		if( (m & 1) != (n & 1))
    			result ++ ;
    		if( m != 0)
    			m = m >> 1;
    		if( n != 0 )
    			n = n >> 1;
    	}
    	return result ;
    }
	public static void main(String[] args) {
		System.out.println(countBitDiff(1999,2299));
	}
}