package limiao.leetcode;

import javax.swing.RootPaneContainer;

import limiao.datastructure.tree.TreeNode;

/**
 * @author seektech
 * @time Mar 6, 2017 11:35:56 PM
 * 
 * 99. Recover Binary Search Tree
 */
public class No_99_RecoverBinarySearchTree {

	TreeNode changeTarget = null;
    TreeNode before = null;
    int index = 0;
	public static void main(String[] args) {

	}
	
    public void recoverTree(TreeNode root) {
    	if(root != null){
    		recoverTree(root.left);
            if(before != null){ 
                if(root.val<before.val){
                    if(index == 0){
                        changeTarget = before;
                        index ++;
                    }else{
                        int tmp = changeTarget.val;
                        changeTarget.val = root.val;
                        root.val = tmp;
                    }
                } 
            }
            before = root;
            recoverTree(root.right);
    	}
    }

}
