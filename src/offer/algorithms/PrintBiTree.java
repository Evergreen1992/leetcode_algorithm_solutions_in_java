package offer.algorithms;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class PrintBiTree {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if( root == null )
        	return list;
        LinkedBlockingDeque<TreeNode> q = new LinkedBlockingDeque<TreeNode>();
        q.add(root);
        
        while(q.isEmpty() == false){
        	TreeNode node = q.poll();
        	list.add(node.val);
        	if( node.left != null )
        		q.add(node.left);
        	if( node.right != null )
        		q.add(node.right);
        }
        
        return list;
    }
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		for(Integer item : PrintFromTopToBottom(node1)){
			System.out.println(item);
		}
	}
}