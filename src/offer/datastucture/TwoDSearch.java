package offer.datastucture;
//二维查找
public class TwoDSearch {
	public static boolean search(int[][] arr, int number){
		boolean found = false;
		if( arr == null || arr.length == 0)
			return false;
		int row = 0, column = arr[0].length - 1 ;
		while( row <= arr.length - 1 && column >= 0){
			if( arr[row][column] == number){
				found = true ;
				break;
			}else{
				if( arr[row][column] > number)
					column -- ;
				else
					row ++ ;
			}
		}
		return found;
	}
	public static void main(String[] args){
		int[][] arr = {					 {1,2,8,9},
												 {2,4,9,12},
												 {4,7,10,13},
												 {6,8,11,15}};
		System.out.println(search(arr, 8));
	}
}