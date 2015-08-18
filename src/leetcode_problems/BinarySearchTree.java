package leetcode_problems;

public class BinarySearchTree {
    
    public static int length(TreeNode node){
	if ( node == null)
	    return 0 ;
	else{
	    int dLen = length(node.left) -  length(node.right) ;
	    return 0; 
	}
    }
    
    public static boolean isBalanced(TreeNode root) {
	boolean flag = true ;
	return flag ;
    }

    public static void main(String[] args) {

    }

}
