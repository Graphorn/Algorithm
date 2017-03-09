package limiao.datastructure.tree;

import java.util.Stack;

/**
 * @author seektech
 * Feb 27, 2017 7:11:00 PM
 * 
 * 二叉树先序遍历的递归和迭代实现
 */
public class PreOrderTraversal {
	public static void main(String args[]){
		TreeEntity treeEntity = new TreeEntity();
		TreeNode root = treeEntity.init();
		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		System.out.println("先序遍历-递归");
		preOrderTraversal.preOrderTraversalRecursive(root);
		System.out.println("先序遍历-迭代");
		preOrderTraversal.preOrderTraversalIterative(root);
	}
	/**
	 * 先序遍历，递归实现
	 */
	public void preOrderTraversalRecursive(TreeNode root){
		if(root != null){
			System.out.println(root.val);
			preOrderTraversalRecursive(root.left);
			preOrderTraversalRecursive(root.right);
		}
	}
	/**
	 * 先序遍历，迭代实现
	 */
	public void preOrderTraversalIterative(TreeNode root){
		 Stack<TreeNode> stack = new Stack<TreeNode>();  
        while(root != null || stack.size()>0){//将所有左孩子压栈  
            if(root != null){//压栈之前先访问  
                System.out.println(root.val); 
                stack.push(root);  
                root = root.left;  
            }else{  
            	root = stack.pop();  
            	root = root.right;  
            }  
        }  
        System.out.println(stack.size());
	}
}
