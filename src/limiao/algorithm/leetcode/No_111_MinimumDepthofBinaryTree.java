package limiao.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 2, 2017 10:12:37 AM
 * 
 * 111. Minimum Depth of Binary Tree
 */
public class No_111_MinimumDepthofBinaryTree {

	public static void main(String[] args) {

	}
	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);  
        int right = minDepth(root.right);  
        if(left == 0 && right ==0) return 1;  
        if(left == 0) left = Integer.MAX_VALUE;  
        if(right == 0) right = Integer.MAX_VALUE;  
        return Math.min(left,right)+1;
    }
	public int minDepthIterative(TreeNode root){
		int level = 0;
		int curCount = 0;
		int nextCount = 0;
		if(root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(queue.size()>0){
			root = queue.poll();
			curCount --;
			if(root.left != null){
				nextCount ++;
				queue.add(root.left);
			}
			if(root.right != null){
				nextCount ++;
				queue.add(root.right);
			}
			if(root.left==null&&root.right==null){
				return level+1;
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
