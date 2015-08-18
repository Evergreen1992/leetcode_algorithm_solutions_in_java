package leetcode_problems;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
	reverse(root);
        return root ;
    }
    
    public void reverse(TreeNode root){
	if( root == null)
	    return ;
	TreeNode temp = root.left ;
	root.left = root.right;
	root.right = temp ;
	
	reverse(root.left);
	reverse(root.right);
    }

    public static void main(String[] args) {

    }

}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
