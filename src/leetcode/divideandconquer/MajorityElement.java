package leetcode.divideandconquer;

public class MajorityElement {
	/**
	 * 方法一
	 * 使用未操作
	 */
	public static int majorityElement2(int[] nums) {
		int numToFind = 0 ;
		int[] size = new int[32];
		for( int i = 0 ; i < nums.length; i ++){
			for( int j = 0 ; j < 32; j ++){
				if( (nums[i] >> j&1) == 1){
					size[j] ++ ;
				}
			}
		}
		
		for( int i = 0 ; i < 32 ; i ++){
			if( size[i] > nums.length/2 ){
				numToFind += (1 << i) ;
			}
		}
		return numToFind ;
	}
	/**
	 * 方法2
	 * @param nums
	 * @return
	 */
	public static int majorityElement(int[] nums) {
		int curr = 0 ;
		int[] flags = new int[nums.length];
		int numToFind = 0 ;
		for( int i = 1 ; i < nums.length; i ++){
			if( nums[i] != nums[curr]){
				flags[i] = -1 ;
				flags[curr] = -1 ;
				//寻找下一个起点
				while(true){
					curr = curr + 1 ;
					if( flags[curr] != -1)
						break ;
				}
			}
			
		}
		for( int i = 0 ; i < flags.length; i ++){
			if( flags[i] != -1){
				numToFind = nums[i] ;
			}
		}
        return numToFind ;
    }

	public static void main(String[] args) {
		System.out.println(majorityElement2(new int[]{3,2,3}));
		//1,4,4,4,3,3,4,4
	}
}