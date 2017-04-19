package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<String>();
        String item = "";
        search(root, item, path);
        return path;
    }
	
	public static void search(TreeNode node, String path, List<String> result){
		if( node == null)
			return ;
		path += node.val + "->";
		
		if( node.left != null ){
			search(node.left, path, result);
		}
		if( node.right != null ){
			search(node.right, path, result);
		}
		
		if(node.left == null && node.right == null){
			if( path.lastIndexOf("->") != -1)
				path = path.substring(0, path.lastIndexOf("->"));
			result.add(path);
		}
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(5);
		n1.left=n2;
		n1.right=n3;
		n2.right=n4;
		for(String item:binaryTreePaths(n1)){
			System.out.println(item);
		}
	}

}
