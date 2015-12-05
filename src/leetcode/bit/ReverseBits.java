package leetcode.bit;

public class ReverseBits {
	//964176192 
	public static int reverseBits(int n) {
        int result =0  ; 
        for( int i = 1 ; i <= 32 ; i ++){
        	result = result + ((n&1)<<(32 - i));
        	n = n >> 1 ;
        }
        return result ;
    } 

	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
	}
}