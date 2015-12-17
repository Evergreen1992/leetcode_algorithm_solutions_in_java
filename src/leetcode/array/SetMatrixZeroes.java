package leetcode.array;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
    	if( matrix.length == 0)
    		return ;
    	int rows[] = new int[matrix.length];
    	int columns[] = new int[matrix[0].length];
    	
    	for( int i = 0 ; i < matrix.length; i ++){
    		for( int j = 0 ; j <matrix[i].length; j ++){
    			if( matrix[i][j] == 0 ){
    				rows[i] = 1 ;
    				columns[j] = 1 ;
    			}
    		}
    	}
    	for( int i = 0 ; i < matrix.length; i ++){
    		for( int j = 0 ; j < matrix[i].length; j ++){
    			if( columns[j] == 1 || rows[i] == 1)
    				matrix[i][j] = 0 ;
    		}
    	}
    }

	public static void main(String[] args) {
		int[][] array = {
				{0, 2, 3},
				{4, 0, 6},
				{7, 8, 9}
		};
		setZeroes(array);
		for( int[] outer : array){
			for( int item : outer){
				System.out.print(item + " , ");
			}
			System.out.println();
		}
	}
}