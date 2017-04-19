package leetcode.depthfirstsearch;

import java.util.Stack;
//stack && depth-first-search
public class DecodeString {
	public static String decodeString(String s) {
        String result = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i < s.length(); i ++){
        	if( s.charAt(i) != ']')
        		stack.push(s.charAt(i));
        	else{//pop
        		
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));
	}

}