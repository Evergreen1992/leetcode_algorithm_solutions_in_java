package company.mi;

import java.util.Stack;

//即:求最近公共祖先。
public class Git {
	public static String path(String[] matrix, int goal){
		Stack<Integer> stack = new Stack<Integer>();
		String result = "";
		stack.push(0);//根节点
		
		while(!stack.isEmpty()){
			int index = stack.peek();
			int subNodeCount = 0;
			boolean found = false; 
			for(int i = index; i < matrix[index].length(); i ++){
				if( matrix[index].charAt(i) == '1'){
					subNodeCount ++ ;
					stack.push(i);
					//找到
					if( i == goal){
						found = true ;
						break ;
					}
				}
			}
			if( subNodeCount == 0)
				stack.pop();
			if( found){
				while(!stack.isEmpty())
					result = stack.pop() + result ;
			}
		}
		return result;
	}
	//求出从根节点分别到a和b的路径。通过路径判断。
	public static int getSplitNode(String[] matrix, int indexA, int indexB) {
		if( matrix.length == 0 )
			return 0;
		String pA = path(matrix, indexA);
		String pB = path(matrix, indexB);
		
		if( pA.equals("") || pB.equals(""))
			return 0;
		int count = 0;
		for(int i = 0; i < (pA.length() > pB.length() ? pB.length() : pA.length()); i ++){
			if( pA.charAt(i) == pB.charAt(i))
				count ++ ;
		}
		return pA.charAt(count - 1) - '0';
    }
	
	public static final void main(String[] args) {
		//System.out.println(getSplitNode(new String[]{}, 0, 0));
		System.out.println(~2);
	}
}