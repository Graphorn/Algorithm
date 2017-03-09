package limiao.datastructure.tree;
/**
 * @author seektech
 * Feb 28, 2017 9:30:06 AM
 * 
 * TreeNode
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x, TreeNode l, TreeNode r) { 
		val = x; 
		left = l;
		right = r;
	}	
	public TreeNode(int x) { 
		val = x; 
	}	
}
