package leetcode.greedy;

public class JumpGame {
	public static boolean canJump(int[] nums) {
		int maxReach = 0 ;
		for( int i = 0 ; i < nums.length; i ++){
			if( maxReach < i )//是否能走到第i個元素的位置
				return false ;
			maxReach = Math.max(maxReach, i + nums[i]);
		}
		return maxReach >= nums.length - 1 ;
    }

	public static void main(String[] args) {
		//2,3,1,1,4
		//3,2,1,0,4
		System.out.println(canJump(new int[]{0}));
		//0 3
		//3 3
		//3 4
		//4 3
		//4 8
	}
}