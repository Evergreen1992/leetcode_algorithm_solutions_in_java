package offer.algorithms;
//旋转数组中最小的数字
public class MinistInResertedArray {
	public static int minNumberInRotateArray(int [] array) {
		int result = array[0];
		for(int i = 1; i < array.length; i ++){
			if( array[i - 1] > array[i]){
				result = array[i];
				break;
			}
		}
	    return result ;
    }

	public static void main(String[] args) {
		int[] arr = new int[]{3,4,5,1,2};
		System.out.println(minNumberInRotateArray(arr));
	}
}