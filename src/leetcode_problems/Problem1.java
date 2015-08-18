package leetcode_problems;

/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.
Note:
You may assume that A has enough space (size that is greater or equal to m + n) 
to hold additional elements from B. The number of elements initialized in A and B 
are m and n respectively.
 */
public class Problem1 {
    /**
     1  2  3 .. 6  7 8
     5
     */
    public static void merge(int A[], int m, int B[], int n) {
	if( n < 1)
	    return ;
	if( A == null || m < 1){
	    A = B ;
	}else{
	    	int inner = m - 1 ;
	    	//插入排序思想
        	for( int outer = 0 ; outer < n ; outer ++){
        	    //从后向前找到插入到A中的位置
        	    while( inner >= 0 &&  A[inner] > B[outer] ) 
        		inner -- ;
        	    //移动A中的元素
        	    for( int j = m - 1; j > inner ;  j -- ){
        		A[ j + 1 ] = A[j];
        	    }
        	    A[inner + 1] = B[outer];
        	    m ++ ;
        	    inner = m - 1 ;
        	}
	}
	
	
	//测试打印输出
	for( int item : A)
	    System.out.print(item + ",");
    }
    
    public static void print(int[] A, int len){
	for(int i = 0 ; i < len ; i ++){
	    System.out.print(A[i] + ",");
	}
    }
    
    
    /**
    Input:	[], [1]
    Output:	[0]
    Expected:	[1]
     * @param args
     */
    public static void main(String[] args) {
	int[] A = new int[]{} ;
	int[] B = new int[]{ 1};//[] [1]  -> [1]
	
	merge(A, 0, B, 1);
    }
}