package 美团2016;

/**
 有一个直方图，用一个整数数组表示，其中每列的宽度为1，求所给直方图包含的最大矩形面积。比如，对于直方图[2,7,9,4],它所包含的最大矩形的面积为14(即[7,9]包涵的7x2的矩形)。
给定一个直方图A及它的总宽度n，请返回最大矩形面积。保证直方图宽度小于等于500。保证结果在int范围内。
测试样例：
[2,7,9,4,1],5
返回：14
 * @author Administrator
 *
 */
public class MaxInnerRec {
    public static int countArea(int[] A, int n){
	int max = -1 , start = 0, end = 0 ,  current , j  ;
	for( int i = 0 ; i < n ; i ++){
	    current = A[i];
	    start = -1 ;
	    end = -1 ;
	    for(  j = 0 ; j < n; j ++){
		if( A[j] >= current && start == -1){
		    start  = j ;
		}else if(A[j]  < current  && start != -1 ){
		    end = j - 1 ;
		    break ;
		}
	    }
	    if( j == n)
		end = n - 1 ;
	    if( (end - start + 1 ) * current >= max ){
		max = (end - start + 1) * current ;
	    }
	}
	return max ;
    }

    public static void main(String[] args) {
	int[] A = {2,7,9,4,1};
	System.out.println(countArea(A, 5));
    }

}
