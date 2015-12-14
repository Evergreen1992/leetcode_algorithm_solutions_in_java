package leetcode.bit;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int sum = nums.length;
	    for (int i = 0; i < nums.length; i++){
	        sum = sum + i - nums[i];
	    }
	    return sum;
    }
	
	public static int missingNumber_XOR(int[] nums) {
		int xor = 0 , i ;
	    for ( i = 0; i < nums.length; i++){
	        xor = xor ^ i ^ nums[i] ;
	    }
	    return xor ^ i;
    }
	
	public static void main(String[] args) {                  //3  4  5  6  7
		System.out.println(missingNumber_XOR(new int[]{0, 1, 2, 4, 5, 6, 7}));
	}

}
