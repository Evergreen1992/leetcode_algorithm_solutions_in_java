package offer.algorithms;

import java.util.Stack;
public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	int curMin = Integer.MAX_VALUE;
	
	public void push(int node) {
        stack.push(node);
        if( minStack.isEmpty()){
        	minStack.push(node);
        	curMin = node ;
        }else{
        	if( node < curMin){
        		curMin = node ;
        		minStack.push(node);
        	}
        }
    }
    
    public void pop() {
        if( !stack.isEmpty()){
        	if( stack.peek() == minStack.peek()){
        		minStack.pop();
        	}
        	stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }

	public static void main(String[] args) {

	}
}