package offer.algorithms;
//ali  17
public class FourSameSumSplitArray {
	/**
	 * @param int[]
	 * @return boolean
	 */
	public static boolean judgeExists(int[] arr){
		if( arr == null || arr.length < 7)//检查数组是否满足条件
			return false;
		//左、右指针；左、右子数组和；子数组和、count保存leftSum和rightSum相同的次数
		int pLeft = 0, pRight = arr.length - 1 , leftSum =0, rightSum = 0, preSum = 0, count = 0;
		boolean result = false;//返回的结果
		
		leftSum += arr[pLeft];//初始化
		rightSum += arr[pRight];
		//pLeft从下标0开始扫描，pRight从末尾开始扫描
		while( pLeft <= pRight  && pLeft < arr.length && pRight >= 0){
			if( leftSum < rightSum){
				pLeft ++ ;
				leftSum += arr[pLeft];
			}else if( leftSum > rightSum){
				pRight -- ;
				rightSum += arr[pRight];
			}else{//子数组的和相同时
				count ++ ;//每一次相等，count加一
				if( count == 2){//指针相遇
					if( preSum == leftSum)
						return true;
					else
						return false;
				}
				preSum = leftSum ;
				pLeft += 2 ;//跳过分隔数字
				pRight -= 2 ;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		//2,5,    1,   1,1,1,4,      1,      7,    3,   7
		int[] arr = new int[]{2,5,    1,   1,1,1,4,      1,      7,    3,   7};
		System.out.println(judgeExists(arr));
	}
}