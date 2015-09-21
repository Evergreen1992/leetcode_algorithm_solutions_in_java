package leetcode.two_pointers;

public class SortColors {
    
    public static void sortColors(int[] nums) {
        if( nums.length <= 1)
            return ;
        
        int pointer = 1 , index = 0 , current , i ;
        for( pointer = 1 ; pointer < nums.length; pointer ++){
            //current element
            current = nums[pointer] ;
            //find the location to insert the element
            index = 0 ;
            while( index < pointer ){
        	if( nums[index] >= current)
        	    break ;
        	index ++ ;
            }
            //move elements
            if( index < pointer){
        	for(  i = pointer - 1 ; i >= index ; i --){
        	    nums[i + 1] = nums[i];
        	}
        	nums[index] = current ;
        	//System.out.println(index + " , " + current);
            }
        }
    }

    public static void main(String[] args) {
	int[] array = {0, 1, 2, 0, 2, 2, 1, 0 , 0 , 1, 2, 1, 2 , 2};
	for( int item : array){
	    System.out.print(item + ",");
	}
	System.out.println();
	
	sortColors(array);
	
	for( int item : array){
	    System.out.print(item + ",");
	}
	System.out.println();
    }

}
