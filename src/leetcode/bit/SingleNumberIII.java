package leetcode.bit;

public class SingleNumberIII {
	public static int[] singleNumber(int[] nums) {
		int[] result = {0,0};
		int xor = nums[0];
		for( int i = 1 ; i < nums.length; i ++)
			xor = xor ^ nums[i] ;
		xor &= -xor ;
		for( int item : nums){
			if( (item & xor) == 0 ){
				result[0] ^= item ;
			}else{
				result[1] ^= item ;
			}
		}
		return result ;
	}

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 1, 3, 2, 5, 8, 8 , 9 , 9};
		
		for( int i : singleNumber(a))
			System.out.print(i + " , ");
	}
}