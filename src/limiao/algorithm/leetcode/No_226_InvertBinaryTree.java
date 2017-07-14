package limiao.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 1, 2017 1:43:49 PM
 * 
 */
public class No_226_InvertBinaryTree {
	/**
	 * @param root 根节点或子树的根节点
	 * @return 新的根节点
	 * 递归方法
	 */
	public TreeNode invertTreeRecursive(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTreeRecursive(root.right);
        root.right = invertTreeRecursive(tmp);
        return root;
    }
	/**
	 * @param root 根节点或子树的根节点
	 * @return 新的根节点
	 * 非递归方法
	 */
	public TreeNode invertTreeIterative(TreeNode root){
		if(root == null) return null;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(queue.size()>0){
			root = queue.poll();
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			if(root.left!=null) queue.add(root.left);
			if(root.right!=null) queue.add(root.right);
		}
		return root;
	}
	
}
