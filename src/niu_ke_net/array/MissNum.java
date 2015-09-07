package niu_ke_net.array;

/**
@author Evergreen
 数组中未出现的最小正整数
【题目】
给定一个无序整型数组arr，找到数组中未出现的最小正整数。 
【举例】
arr=[-1,2,3,4]。返回1。
arr=[1,2,3,4]。返回5。
 *
 */
public class MissNum {
    
    public static int misNum(int[] arr){
	int l = 0 ;
	int r = arr.length;
	while( l < r){
	    if( arr[l] == l + 1){
		l ++ ;
	    }else if( arr[l] <= l || arr[l] > r || arr[arr[l] - 1] == arr[l]){
		arr[l] = arr[-- r];
	    }else{
		//swap(arr, l, arr[l] - 1);
		arr[l] = arr[-- r];
	    }
	}
	return l + 1;
    }
    

    public static void main(String[] args) {
	int[] arr = new int[]{1,2,3,4,6,7};
	System.out.println(misNum(arr));
    }

}
