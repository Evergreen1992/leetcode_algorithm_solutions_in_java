package leetcode.stack;

public class Find132Pattern {
	public static boolean find132pattern(int[] nums) {
		for(int i=0; i<nums.length-2; i++) {
	        int ak = Integer.MAX_VALUE;
	        
	        for(int j=nums.length-1; j>i; j--) {
	            if(nums[j] <= nums[i])
	                continue;
	            if(ak < nums[j])
	                return true;
	            
	            ak = nums[j];
	        }
	    }
	    
	    return false;
    }

	public static void main(String[] args) {
		System.out.println(find132pattern(new int[]{3, 1, 4, 2}));
	}
}