package 直通BAT牛客网算法视频;

import java.util.Stack;

//将栈逆序，不能使用额外空间，只能调用栈的操作函数
public class ReverseStack {
	public static int get(Stack<Integer> stack){
		int result = stack.pop();
		if( stack.isEmpty()){
			return result;
		}else{
			int last = get(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if( stack.isEmpty())
			return ;
		int num = get(stack);
		reverse(stack);
		stack.push(num);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);stack.push(2);stack.push(3);
		reverse(stack);
		while(stack.isEmpty() == false){
			System.out.println(stack.pop());
		}
	}
}