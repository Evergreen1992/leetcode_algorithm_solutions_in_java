package leetcode_problems;

/**
 * Search a 2D Matrix 
 * @author Administrator
 *
 */
//https://oj.leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
	//先找到所在的行
	System.out.println(getRow(matrix, target));
	//再寻找所在的位置
        return false ;
    }
    //获取行下标
    public int getRow(int[][] data, int item){
	int low = 0 , high = data.length - 1 , mid;
	
	mid = (low + high)/2 ;
	while( low < high){
	    if( data[mid][0] < item){
		low = mid + 1 ;
	    }else if(data[mid][0] > item){
		high = mid - 1 ;
	    }else{
		return -1 ;//查找到了
	    }
	}
	
	return  mid;
    }
    
    

    public static void main(String[] args) {
	int[][] data = new int[][]{
	                           {1,   3,  5,  7},
	                           {10, 11, 16, 20},
	                           {23, 30, 34, 50}
				};
	System.out.println(new Search2DMatrix().searchMatrix(data, 3));
    }

}
