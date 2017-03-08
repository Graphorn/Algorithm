package limiao.leetcode;

import limiao.datastructure.tree.TreeNode;

/**
 * @author seektech
 * @time Mar 8, 2017 11:06:12 PM
 * 
 * 101. Symmetric Tree
 */
public class No_101_SymmetricTree {

	public static void main(String[] args) {

	}
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return isSame(root.left,root.right);
    }
    public boolean isSame(TreeNode p, TreeNode q){
    	if(p==null||q==null) return p==q;
    	else return p.val==q.val&&isSame(p.left, q.right)&&isSame(p.right, q.left);
    }
}
