package limiao.leetcode;

import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 11, 2017 12:50:07 PM
 * 
 * 114. Flatten Binary Tree to Linked List
 */
public class No_114_FlattenBinaryTreetoLinkedList {

	public static void main(String[] args) {
		TreeEntity treeEntity = new TreeEntity();
		TreeNode root = treeEntity.init();
		No_114_FlattenBinaryTreetoLinkedList no_114_FlattenBinaryTreetoLinkedList = new No_114_FlattenBinaryTreetoLinkedList();
		no_114_FlattenBinaryTreetoLinkedList.flatten(root);
	}
	public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        System.out.println(root.val);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right!=null)
            root = root.right;
        root.right = tmp;
    }
}
