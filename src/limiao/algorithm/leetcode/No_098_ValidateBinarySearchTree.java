package limiao.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import limiao.datastructure.tree.RowOrderTraversal;
import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;
import limiao.other.Count;

/**
 * @author limiao
 * Mar 1, 2017 3:51:36 PM
 * 
 * 98. Validate Binary Search Tree
 */
public class No_098_ValidateBinarySearchTree {
	TreeNode preNode = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeEntity treeEntity = new TreeEntity();
		System.out.println(new No_098_ValidateBinarySearchTree().isValidBST(treeEntity.init()));
	}
	public boolean isValidBST(TreeNode root) {
//		int pre = 0;
//		int count = 0;
//        if(root == null) return true;
//
//        Stack<TreeNode> stack = new Stack<TreeNode>();    
//        while(root != null || stack.size()>0){  
//            if(root != null){  
//                stack.push(root);//直接压栈  
//                root = root.left;  
//            }else{  
//            	root = stack.pop();//出栈并访问  
//            	if(count == 0) pre = root.val;
//            	else{
//            	    if(root.val<=pre) return false;
//                    else pre = root.val;
//            	}
//                root = root.right;  
//                count++;
//            } 
//            
//        } 
//        return true;
		if (root == null) return true;   
        if (!isValidBST(root.left)) return false;  
        if (preNode != null && root.val <= preNode.val) return false;  
        preNode = root;  
        return isValidBST(root.right);   
         
    }
}
