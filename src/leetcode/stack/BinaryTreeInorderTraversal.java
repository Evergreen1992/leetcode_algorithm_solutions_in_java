package leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	int val ;
	TreeNode left ;
	TreeNode right ;
	TreeNode(int x){val = x; }
}

public class BinaryTreeInorderTraversal {
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while( !stack.isEmpty() || root != null ){
			if( root != null ){
				stack.push(root);
				root = root.left ;
			}else{
				root = stack.pop();
				list.add(root.val);
				root = root.right ;
			}
		}
		
        return list ;
    }

	public static void main(String[] args) {
		TreeNode h = new TreeNode(1);
		TreeNode h1 = new TreeNode(2);
		TreeNode h2 = new TreeNode(3);
		TreeNode h3 = new TreeNode(4);
		TreeNode h4 = new TreeNode(5);
		h.left = h1;
		h.right = h2;
		h1.left = h3;
		h1.right = h4 ;
		/**         4 2 5 1 3
		    1
		   2 3
		  4 5
		 //
		 */
		for( int i : inorderTraversal(h)){
			System.out.print(i + ",");
		}
	}
}