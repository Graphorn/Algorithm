package limiao.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 7, 2017 10:11:02 PM
 * 
 * 100. Same Tree
 */
public class No_100_SameTree {

	public static void main(String[] args) {

	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null||q == null) return p == q;
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
