package leetcode.bit;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if( n <= 0 )
			return false ;
		else
			return (n & (n - 1)) == 0 ;
    }

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));
	}

}
