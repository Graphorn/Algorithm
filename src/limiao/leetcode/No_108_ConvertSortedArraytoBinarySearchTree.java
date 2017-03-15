package limiao.leetcode;

import limiao.datastructure.tree.BinarySearchTree.BinaryNode;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 14, 2017 5:18:48 PM
 * 
 * 108. Convert Sorted Array to Binary Search Tree
 */
public class No_108_ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {

	}
	public TreeNode sortedArrayToBST(int[] num) {
	    if (num.length == 0) return null;
	    return helper(num, 0, num.length - 1);
	}

	public TreeNode helper(int[] num, int low, int high) {
	    if (low > high) return null;
	    int mid = (low + high) / 2;
	    TreeNode node = new TreeNode(num[mid]);
	    node.left = helper(num, low, mid - 1);
	    node.right = helper(num, mid + 1, high);
	    return node;
	}

}
