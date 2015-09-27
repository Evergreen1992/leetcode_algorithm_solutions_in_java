package leetcode.array;

public class RemoveElement {
	
	public int removeElement(int[] A, int elem) {
        int i = 0 , j = 0 ;
        for( i = 0 ; i < A.length; i ++){
        	if( A[i] != elem)
        		A[j ++ ] = A[i];
        }
        return j ;
    }

	public static void main(String[] args) {
		//
	}

}
