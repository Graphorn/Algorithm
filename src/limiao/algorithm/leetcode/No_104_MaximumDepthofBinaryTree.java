package limiao.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 2, 2017 9:38:51 AM
 * 
 * 104. Maximum Depth of Binary Tree 等同于求节点的高度
 */
public class No_104_MaximumDepthofBinaryTree {

	public static void main(String[] args) {

	}
	public int maxDepth(TreeNode root) {
        if(root == null) return -1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
	public int maxDepthIterative(TreeNode root){
		int level = 0;
		int curCount = 1;
		int nextCount = 0;
		if(root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(queue.size()>0){
			root = queue.poll();
			curCount --;
			if(root.left!=null){
				queue.add(root.left);
				nextCount ++;
			}
			if(root.right!=null){
				queue.add(root.right);
				nextCount ++;
			}
			if(curCount == 0){
				level ++;
				curCount = nextCount;
				nextCount = 0;
			}
		}
		return level;
	}
}
