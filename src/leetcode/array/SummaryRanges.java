package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        String current = "";
        int last = -1 , i  , count = 0 ;
        
        if( nums == null )
        	return list ;
        
        if( nums.length == 1){
        	list.add(nums[0] + "");
        	return list ;
        }
        
        for(  i = 0 ; i < nums.length; i ++){
        	if( i == 0){
        		last = nums[i];
        		current = nums[i] + "";
        		count ++ ;
        	}else{
        		if( nums[i] != last + 1){
        			if( count > 1)
        				current += ("->" + last);
        			list.add(current);
        			
        			last = nums[i];
        			current = nums[i] + "";
        			count = 1 ;
        			
        			if( i == nums.length - 1)
        				list.add(current);
        		}else{
        			
        			if( i == nums.length - 1  )
        				list.add(current + "->" + nums[i]);
        			last ++ ;
        			count ++ ;
        		}
        		
        	}
        }
        
        return list ;
    }

	public static void main(String[] args) {
		// [0,1,2,4,5,7], return ["0->2","4->5","7"].
		int[] array = {0,2,3,5 };
		for(String item :summaryRanges(array) ){
			System.out.print(item + " ");
		}
	}

}
