package leetcode.bit;

import java.util.Arrays;

public class FirstMissingPositive {
	//法1.通过交换元素
	public static int firstMissingPositive_swap(int[] nums) {
		if( nums == null || nums.length == 0 )
			return 1 ;
		for( int i = 0 ; i < nums.length ; i ++){
			if( nums[i] != i + 1 && nums[i] <= nums.length && nums[i] >= 1 && nums[i] != nums[nums[i] - 1]){
				int c = nums[i] ;
				nums[i] = nums[c - 1] ;
				nums[c - 1] = c ;
				if( i >= 1)
					i -- ;
			}
		}
		for( int i = 0 ; i < nums.length; i ++)
			if( nums[i] != i + 1)
				return i + 1 ;
		return nums[nums.length - 1] + 1 ;
	}
	//法2.通过排序的方法
	public static int firstMissingPositive(int[] nums) {
		if( nums.length == 0 )
			return 1 ;
		Arrays.sort(nums);
		int before = -1 , i ;
		for(  i = 0 ; i < nums.length; i ++){
			if( before == -1 ){
				if( nums[i] <= 0 )
					continue ;
				if( nums[i] != 1)
					return 1 ;
				before = nums[i];
			}else{
				if( nums[i] == before)
					continue ;
				if( nums[i] != before + 1)
					return before + 1;
				
				before = nums[i] ;
			}
		}
		return nums[i - 1] + 1;
    }

	public static void main(String[] args) {                 //3,5,6,4,2,1,7
														     //3,2,6,4,5,1,7
															 //3,2,1,4,5,6,7
															 //3,2,1,4,5,6,7
															 //3,2,1,4,5,6,7
		System.out.println(firstMissingPositive_swap(new int[]{4,5,6,3,2,1,7}));
	}
}