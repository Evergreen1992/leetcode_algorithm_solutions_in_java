package leetcode.tree;

public class LowestCommonAncestorOfABinaryTree {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == p || root == q || root == null )
        	return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if( left == null )
        	return right;
        if( right == null )
        	return left;
        else
        	return root;
    }
	public static void main(String[] args) {
		TreeNode n3 = new TreeNode(3);
		TreeNode n5 = new TreeNode(5);
		TreeNode n1 = new TreeNode(1);
		TreeNode n6 = new TreeNode(6);
		TreeNode n2 = new TreeNode(2);
		TreeNode n0 = new TreeNode(0);
		TreeNode n8 = new TreeNode(8);
		TreeNode n7 = new TreeNode(7);
		TreeNode n4 = new TreeNode(4);
		n3.left=n5;
		n3.right=n1;
		n5.left=n6;
		n5.right=n2;
		n1.left=n0;
		n1.right=n8;
		n2.left=n7;
		n2.right=n4;
		System.out.println(lowestCommonAncestor(n3, n6, n7).val);
	}

}
