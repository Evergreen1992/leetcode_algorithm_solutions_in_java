package leetcode.string;
/**
 * 最长递增子序列。
 * @author Administrator
 *
 */
public class LongestIncreaseSubsequence {
	static int[] arr = new int[]{3,11,2,5,7,6,14,8,12,15,4,10,13,9,18};

	public static void main(String[] args) {
		int[] len = new int[arr.length];
		len[0] = 1;
		for( int i = 1 ; i < arr.length; i ++){
			int maxIndex = -1, j ;
			for(  j = i - 1; j >= 0 ; j --){
				if( arr[j] < arr[i]){//找到比si小的元素。
					if( len[i] < len[j] + 1){
						len[i] = len[j] + 1;
						maxIndex = j ;
					}
				}
			}
			if( maxIndex == -1)
				len[i] = 1 ;
			
			System.out.println(i + ":" + len[i] + ",");
		}
	}
}
