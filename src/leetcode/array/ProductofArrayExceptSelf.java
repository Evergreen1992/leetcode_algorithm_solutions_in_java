package leetcode.array;

public class ProductofArrayExceptSelf {
	/**
	 * 当前元素左边所有元素乘积  * 当前元素后边所有元素乘积
	 * @param nums
	 * @return
	 */
	public static int[] productExceptSelf(int[] nums) {
		int result[] = new int[nums.length] , left = 1, right = 1;
		for( int i = 0 ; i < nums.length; i ++){
			result[i] = left ;
			left *= nums[i] ;
		}
		for( int i = nums.length - 1 ; i >=0 ; i --){
			result[i] *= right ;
			right *= nums[i];
		}
        return result ;
    }

	public static void main(String[] args) {
		System.out.println("-------------------------------");
		//1   1   2  6
		//24  12  4  1
		//
		//1    2   6  24
		//48  48  12  4
		for( int item : productExceptSelf(new int[]{1,2,3,4}))
			System.out.print(item+",");
	}
}