package limiao.datastructure.tree;

import java.util.Stack;
/**
 * @author seektech
 * Feb 27, 2017 7:11:00 PM
 * 
 * 二叉树中序遍历的递归和迭代实现
 */
public class InOrderTraversal {
	public static void main(String args[]){
		TreeEntity treeEntity = new TreeEntity();
		TreeNode root = treeEntity.init();
		InOrderTraversal inOrderTraversal = new InOrderTraversal();
		System.out.println("中序遍历-递归");
		inOrderTraversal.inOrderTraversalRecursive(root);
		System.out.println("中序遍历-迭代");
		inOrderTraversal.inOrderTraversalIterative(root);
	}
	/**
	 * 中序遍历，递归实现
	 */
	public void inOrderTraversalRecursive(TreeNode root){
		if(root != null){
			inOrderTraversalRecursive(root.left);
			System.out.println(root.val);
			inOrderTraversalRecursive(root.right);
		}
	}
	/**
	 * 中序遍历，迭代实现
	 */
	public void inOrderTraversalIterative(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();  
        while(root != null || stack.size()>0){  
            if(root != null){  
                stack.push(root);//直接压栈  
                root = root.left;  
            }else{  
            	root = stack.pop();//出栈并访问  
                System.out.println(root.val); 
                root = root.right;  
            }  
        }  
	}
}
