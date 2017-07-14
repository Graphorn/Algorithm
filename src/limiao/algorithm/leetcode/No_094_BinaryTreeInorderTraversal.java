package limiao.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import limiao.datastructure.tree.TreeNode;

/**
 * @author seektech
 * Feb 27, 2017 9:14:05 PM
 * 
 */
public class No_094_BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();    
        while(root != null || stack.size()>0){  
            if(root != null){  
                stack.push(root);//直接压栈  
                root = root.left;  
            }else{  
            	root = stack.pop();//出栈并访问  
                list.add(root.val);
                root = root.right;  
            }  
        } 
	    return list;
    }
}
