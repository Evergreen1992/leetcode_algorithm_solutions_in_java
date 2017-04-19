package offer.algorithms;

import java.util.ArrayList;

//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
//则最小的4个数字是1,2,3,4,。
public class KMinestNums {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if( k > input.length)
        	return list;
        int min = Integer.MAX_VALUE, index = -1;
        for(int i = 0 ; i < k; i ++){
        	min = Integer.MAX_VALUE ;
        	for(int j = i; j < input.length ; j ++){
        		if( input[j] < min){
        			min = input[j];
        			index = j;
        		}
        	}
        	int temp = input[i];
        	input[i] = input[index];
        	input[index] = temp ;
        	list.add(input[i]);
        }
        return list;
    }
	public static void main(String[] args) {
		for(Integer item : GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8}, 4)){
			System.out.println(item);
		}
	}
}