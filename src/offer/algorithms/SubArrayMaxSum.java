package offer.algorithms;

public class SubArrayMaxSum {
	public static void maxSubSum(int[] arr){
		int curMax = 0, greatestSum = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length; i ++){
			if( curMax <= 0){
				curMax = arr[i];
			}else{
				curMax += arr[i];
			}
			
			if( curMax > greatestSum){
				greatestSum = curMax ;
			}
		}
		System.out.println(greatestSum);
	}

	public static void main(String[] args) {
		maxSubSum(new int[]{1,-2,3,10,-4,7,2,-5});
	}
}