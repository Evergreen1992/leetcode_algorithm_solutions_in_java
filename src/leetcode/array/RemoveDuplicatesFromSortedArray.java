package leetcode.array;

public class RemoveDuplicatesFromSortedArray {
	
	 public static int removeDuplicates(int[] nums) {
		 int i = 0 , j = 0 , count = 0 , current = 0 , k = 0 , len = nums.length;
		 if( len <= 1)
			 return len ;
		 while(true){
			 current = nums[i];
			 for( j = i + 1 ; j < len ; j ++){
				 if( current == nums[j]){
					 count ++ ;
				 }else{
					 i = j ;
					 nums[++ k] = nums[i];
					 break ;
				 }
			 }
			 if(j == len || i == len - 1)
				 break ;
		 }
		
		 return len - count ;
	 }

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4};
		System.out.println(removeDuplicates(a));
		for(int i : a){
			System.out.print( i + ",");
		}
	}

}
