package leetcode.sort;

public class MsssingNumber {
    
    public static int missingNumber(int[] arr) {
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
	System.out.println(missingNumber(new int[]{1}));
    }
}
