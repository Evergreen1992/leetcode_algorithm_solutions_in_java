package leetcode.tree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
 }

public class SumOfLeftLeaves {
	public static int sumOfLeftLeaves(TreeNode root) {
		if(root == null)
			return 0;
		int subsum = 0;
		if( root.left != null){
			if( root.left.left == null && root.left.right == null){
				subsum += root.left.val;
			}
			subsum += sumOfLeftLeaves(root.left);
			subsum += sumOfLeftLeaves(root.right);
		}
		return subsum;
    }
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		
		n1.left=n2;n1.right=n3;
		n3.left=n4;n3.right=n5;
		System.out.println(sumOfLeftLeaves(n1));
	}
}