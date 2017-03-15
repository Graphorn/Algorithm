package limiao.leetcode;

import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 15, 2017 9:15:51 PM
 * 
 * 222. Count Complete Tree Nodes
 */
public class No_222_CountCompleteTreeNodes {

	public static void main(String[] args) {
		TreeEntity treeEntity = new TreeEntity();
		No_222_CountCompleteTreeNodes no_222_CountCompleteTreeNodes = new No_222_CountCompleteTreeNodes();
		System.out.println(no_222_CountCompleteTreeNodes.countNodes(treeEntity.init()));
	}
	/**
	 * 递归
	 * @param root
	 * @return
	 */
	public int countNodes(TreeNode root) {
		int h = height(root);
		if(h==-1) return 0;
		int hR = height(root.right);
		if(hR==h-1) return 1<<h+countNodes(root.right);
		return 1<<h-1+countNodes(root.left);  
	}
	/**
	 * 非递归
	 * @param root
	 * @return
	 */
	public int countNodesIterative(TreeNode root) {
	        return 0;
	}
	public int height(TreeNode root){
		if(root == null) return -1;
		return 1+height(root.left);
	}
}
