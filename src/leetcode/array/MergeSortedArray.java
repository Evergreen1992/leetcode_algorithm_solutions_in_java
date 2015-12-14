package leetcode.array;
// insert sorting
public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for( int i = 0 ; i < n ; i ++){
        	//find the place to insert
        	int j = 0 ;
        	while( nums1[j] <= nums2[i] && j < m)
        		j ++ ;
        	//move elements
        	for( int k = m - 1 ; k >= j ; k -- )
        		nums1[k + 1] = nums1[k] ;
        	nums1[j] = nums2[i];
        	m ++ ;
        }
    }

	public static void main(String[] args) {
		int[] n1 = new int[]{1,3,5,6,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] n2 = new int[]{2,4,5,8,9};
		merge(n1, 5, n2, 5);
		for( int n : n1){
			System.out.print(n + ",");
		}
	}

}
