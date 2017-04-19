package offer.algorithms;

public class TwoDSearch {
	public boolean Find(int target, int [][] array) {
		boolean flag = false;
		int x, y ;
		if( target > array[0][array[0].length - 1]){
			x = 1;
			y = array[0].length - 1;
		}else if(target < array[0][array[0].length - 1] ){
			x = 0 ;
			y = array[0].length - 2 ;
		}else
			return true ;
		while( 0 <= x && 0 <= y && x <= array[0].length - 1 && y <= array[0].length - 1){
			if( array[x][y] > target){
				
			}else if( array[x][y] < target){
				
			}else{
				flag = true ;
				break ;
			}
		}
		return flag;
    }
	public static void main(String[] args) {
		
	}
}
