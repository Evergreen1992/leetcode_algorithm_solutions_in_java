package offer.algorithms;

import java.util.Stack;

public class TwoStacksImpQue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
       stack1.push(node);
    }
    
    public int pop() {
    	while((stack1.isEmpty() == false)){
    		stack2.push(stack1.pop());
    	}
    	int result = stack2.pop();
    	while((stack2.isEmpty() == false)){
    		stack1.push(stack2.pop());
    	}
    	return result;
    }
    
	public static void main(String[] args) {
		TwoStacksImpQue q = new TwoStacksImpQue();
		q.push(1);
		q.push(2);
		q.push(3);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}
