package limiao.algorithm.leetcode;

/**
 * @author seektech
 * Feb 27, 2017 5:28:24 PM
 * 
 * 110. Balanced Binary Tree
 */
public class No_110_BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(height(root.left)-height(root.right))<=1;
    }
    static int height(TreeNode node){
        if(node == null) return -1;
        else return Math.max(height(node.left),height(node.right))+1;
    }
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }	
}
