package leetcode.array;

public class FindtheDuplicateNumber {
	public static int findDuplicate(int[] nums) {
		int num = nums[0];
		for(int i = 0 ; i < nums.length; i ++){
			for(int j = 0 ; j < nums.length && j != i; j ++){
				if( nums[j] == nums[i]){
					num = nums[i];
					return num;
				}
			}
		}
        return num;
    }
	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[]{9,1,2,3,4,5,1,1,6,7}));
	}
}
