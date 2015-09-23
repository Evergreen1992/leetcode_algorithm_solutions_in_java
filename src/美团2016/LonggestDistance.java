package 美团2016;

/**
有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
给定数组A及它的大小n，请返回最大差值。
测试样例：
[10,5],2
返回：0
 * @author Administrator
 *
 */
public class LonggestDistance {
    
    public static int getDis(int[] A, int n){
	int max = -1 , j , i ;
	for( j = n - 1; j >= 0 ; j --){
	    for( i = j; i >= 0 ; i --){
		if( A[j] - A[i] > max){
		    max = A[j] - A[i];
		}
	    }
	}
	
	return max ;
    }

    public static void main(String[] args) {
	int[] data = new int[]{10, 5};
	System.out.println(getDis(data, 2));
    }

}
