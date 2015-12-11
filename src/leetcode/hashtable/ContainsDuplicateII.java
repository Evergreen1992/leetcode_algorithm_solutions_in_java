package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for( int i = 0 ; i < nums.length; i ++){
			if( map.containsKey(nums[i])){
				if( i - map.get(nums[i]) <= k)
					return true ;
			}
			map.put(nums[i], i);
		}
		return false ;
    }
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[]{0,11,2,11,1,5,6,7,8,9}, 5));
	}
}