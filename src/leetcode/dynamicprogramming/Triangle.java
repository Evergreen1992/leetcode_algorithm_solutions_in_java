package leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	/**
	 * @param triangle
	 * @return
	 */
	public static int minimumTotal(List<List<Integer>> triangle) {
		int[] result = new int[triangle.size() + 1];
		
		for( int i = triangle.size() - 1 ; i >= 0 ; i --){
			List<Integer> item = triangle.get(i);
			for( int j = 0 ; j < item.size(); j ++){
				result[j] = Math.min(result[j], result[j + 1]) + item.get(j);
			}
		}
        return result[0] ;
    }

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(3);
		
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(-1);
		l3.add(-3);
		
		/*List<Integer> l4 = new ArrayList<Integer>();
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);*/
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		//list.add(l4);
		
		System.out.println(minimumTotal(list));
	}

}
