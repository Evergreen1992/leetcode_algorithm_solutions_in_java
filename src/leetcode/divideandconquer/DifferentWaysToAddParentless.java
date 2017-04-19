package leetcode.divideandconquer;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentless {
	public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < input.length(); i ++){
        	char item = input.charAt(i);
        	if( item == '+' || item == '-' || item == '*'){
        		result.add(handle(input.substring(0, i), input.substring(i + 1, input.length()), item));
        	}
        }
        return result;
    }
	public static int handle(String head, String tail, char type){
		
		
		return 0;
	}
	public static void main(String[] args){
		for(Integer item : diffWaysToCompute("2-1-1")){
			System.out.println(item);
		}
	}
}
