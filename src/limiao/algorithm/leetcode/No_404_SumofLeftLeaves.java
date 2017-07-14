package limiao.algorithm.leetcode;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 13, 2017 9:56:10 PM
 * 
 * 404. Sum of Left Leaves
 */
public class No_404_SumofLeftLeaves {

	public static void main(String[] args) {

	}
	public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int re = 0;
        if(root.left!=null){
        	if(root.left.left==null&&root.left.right==null){
        		re += root.left.val;
        	}else{
        		re += sumOfLeftLeaves(root.left);
        	}
        }
        if(root.right!=null){
        	re += sumOfLeftLeaves(root.right);
        }
        return re;
    }

}
