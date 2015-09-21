package leetcode.array;

public class MoveZeroes {
    //设置两个指针，一个指向第一个0元素位置，另一个指向非0元素位置，交换他们的值。
    public static void moveZeroes(int[] nums) {
	int pZero = -1  ,  pNotZero = -1   , temp ;
	
	//找0的位置
	while( pNotZero < nums.length){
	    for( int i = 0  ; i < nums.length; i ++){
		    if( nums[i] == 0 ){
			pZero = i ; 
			break ;
		    }
	    }
	    if( pZero == - 1 )
		break ;
	    
	    pNotZero = pZero ;
	   //找1的位置
	    for( int i = pZero  ; i < nums.length; i ++){
		    if( nums[ i ] != 0 ){
			pNotZero = i ; 
			break ;
		    }
	    }
	    //
	    if(  pNotZero == -1  || pNotZero == pZero  || (pNotZero == nums.length - 1 && pZero >= pNotZero))
		break ;
	    
	    //交换元素
	    temp = nums[pZero];
	    nums[pZero] = nums[pNotZero];
	    nums[pNotZero] = temp ;
	
	}
    }

    public static void main(String[] args) {
	int[] nums = {0,1,0,3,12};// 0 1 0// 0 0 1
	moveZeroes(nums);
	for( int item : nums){
	    System.out.print(item + ",");
	}
    }
}