package bit;

public class SingleNumberII {
	
	public static int singleNumber(int[] nums) {
		int[] bitMap = new int[32];
		int result = 0 ;
		for( int i = 0 ; i < 32; i ++){
			for( int j = 0 ; j < nums.length; j ++){
				bitMap[i] += ((nums[j] >> i) & 1);
			}
			result += (bitMap[i] % 3) << i ;
		}
		return result ;
    }
	
	public static void main(String[] args) {
		
		System.out.println(singleNumber(new int[]{1,1,1,2,2,2,6,4,4,4}));
	}

}
