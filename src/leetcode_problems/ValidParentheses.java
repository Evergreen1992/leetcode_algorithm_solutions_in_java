package leetcode_problems;

import java.util.Stack;

public class ValidParentheses {
   
    public static boolean isValid(String s) {
        boolean flag = true ;
        char ch ;
        Stack<Character> stack = new Stack<Character>();
        
        for( int i = 0 ; i < s.length() ; i ++){
            ch = s.charAt(i);
            if( ch == '('  || ch == '{' || ch == '['){
        	stack.push(ch);
            }
            if( ch == ')'){
        	if( stack.isEmpty() || stack.pop() != '('){
        	    flag = false ;
        	    break;
        	}
            }
            if( ch == '}'){
        	if(  stack.isEmpty() || stack.pop() != '{'){
        	    flag = false ;
        	    break;
        	}
            }
            if( ch == ']'){
        	if( stack.isEmpty() ||  stack.pop() != '['){
        	    flag = false ;
        	    break;
        	}
            }
        }
        
        if( stack.isEmpty() == false)
            flag = false ;
        return flag ;
    }

    public static void main(String[] args) {
	System.out.println(isValid("]"));
    }

}
