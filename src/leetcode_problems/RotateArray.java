package leetcode_problems;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
	if( nums == null || nums.length == 1)
	    return ;
	k = k % nums.length ;
	int[] newA = new int[nums.length];// 1 2 3 4 5 6 7 
	
	for( int i = 0 ; i < k ; i ++)
	    newA[i] = nums[nums.length - k + i ];
	
	for( int i = 0  ; i < nums.length - k ; i ++){
	    newA[ i + k  ] = nums[i];
	}
	
	for( int i = 0 ; i < nums.length ; i ++){
	    nums[i] = newA[i];
	}
	
    }

    public static void main(String[] args) {
	int[] array = new int[]{1,2,3,4,5,6,7};
	rotate(array, 3);
	for( int i : array){
	    System.out.print(i + ",");
	}
    }

}
