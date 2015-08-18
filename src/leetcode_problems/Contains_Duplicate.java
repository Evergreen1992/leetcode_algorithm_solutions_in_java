package leetcode_problems;
/**
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears 
at least twice in the array, and it should return false if every element is distinct.
 * @author Administrator
 *
 */
//插入排序的思想
public class Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
	boolean flag = false ;
	int i = 0 , j = 0 , k , number;
	
	if( nums.length <= 1)
	    return flag ;
	
	A:
	for( i = 1 ; i < nums.length ; i  ++){//3,5,1,9,5,0,2,4
	    number = nums[i];
	    for( j = i ; j - 1 >= 0  ; ){
		if( number < nums[j - 1]){
		    j -- ;
		}else if( number > nums[j - 1]){
		    break ;
		}else if( number == nums[j - 1]){
		    flag = true ;
		    break A ;
		}
	    }
	    //移动元素
	    for( k = i ; k > j ; k -- ){
		nums[k] = nums[k - 1];
	    }
	    nums[j] = number ;
	}
	
        return flag ;
    }
    
    public static void main(String[] args) {
	
	int[] nums = new int[]{3,5,1,9,5,0,2,4};// 0   2
	
	System.out.println(containsDuplicate(nums));
	
    }
}