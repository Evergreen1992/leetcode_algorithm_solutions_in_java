package leetcode.array;

public class RotateImage {
	
	public static void rotate(int[][] matrix){
		
		int  size = matrix.length;
		int[][] newA = new int[size][size];
		//
		for( int i = 0 ; i < size ; i ++){
			for( int j = 0 ; j < size ; j ++){
				newA[j][size - 1 - i] = matrix[i][j];
			}
		}
		
		for( int i = 0 ; i < newA.length; i ++){
			for( int j = 0 ; j < newA[i].length; j ++){
				matrix[i][j] = newA[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2},
				{3,4}
		};
		rotate(matrix);
		
		for( int i = 0 ; i < matrix.length; i ++){
			for( int j = 0 ; j < matrix[i].length; j ++){
				System.out.print(matrix[i][j] + " , ");
			}
			System.out.println();
		}
	}

}
