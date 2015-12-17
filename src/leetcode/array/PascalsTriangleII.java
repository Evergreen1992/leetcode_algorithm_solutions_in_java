package leetcode.array;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
	public static List<Integer> getRow(int rowIndex) {
		Integer[] result = new Integer[rowIndex + 1];
        Arrays.fill(result, 1);
  
        for( int i = 2 ; i <= rowIndex ; i ++){
        	//从后向前计算
        	for( int j = i - 1 ; j >= 1 ; j --){
        		result[j] = result[j - 1] + result[j];
        	}
        }
       return Arrays.asList(result);
    }

	public static void main(String[] args) {
		for( int i : getRow(4)){
			System.out.println(i + " ");
		}
	}
}