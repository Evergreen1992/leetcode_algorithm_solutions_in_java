package leetcode_problems;

import java.util.List;

public class PascalsTriangle {
    
    public static List<List<Integer>> generate(int numRows) {
	List<List<Integer>> result = new java.util.ArrayList<List<Integer>>();
	if( numRows == 0 || numRows < 1 )
	    return result ;
	
	List<Integer> head = new java.util.ArrayList<Integer>();
	head.add(new Integer(1));
	result.add(head);
	
	for( int i = 2 ; i <= numRows  ; i ++){
	    List<Integer> item = new java.util.ArrayList<Integer>();
	    for( int j = 0 ; j < i ; j ++){
		if( j == 0 || j == i - 1){
		    item.add(new Integer(1));//first
		}else{
		    item.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
		}
	    }
	    result.add(item);
	}
	
        return result ;
    }

    public static void main(String[] args) {
	List<List<Integer>> result  = generate(5);
	for(List<Integer> ou : result){
	    for( Integer item : ou){
		System.out.print(item + ",");
	    }
	    System.out.println();
	}
	
    }

}
