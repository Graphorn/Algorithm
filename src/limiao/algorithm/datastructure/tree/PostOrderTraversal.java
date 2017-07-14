package limiao.algorithm.datastructure.tree;

import java.util.Stack;

/**
 * @author seektech
 * Feb 27, 2017 7:11:00 PM
 * 
 * 二叉树后序遍历的递归和迭代实现
 */
public class PostOrderTraversal {
	public static void main(String args[]){
		TreeEntity treeEntity = new TreeEntity();
		TreeNode root = treeEntity.init();
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		System.out.println("后序遍历-递归");
		postOrderTraversal.postOrderTraversalRecursive(root);
		System.out.println("后序遍历-迭代");
		postOrderTraversal.postOrderTraversalIterative(root);
	}
	/**
	 * 后序遍历，递归实现
	 */
	public void postOrderTraversalRecursive(TreeNode root){
		if(root != null){
			postOrderTraversalRecursive(root.left);
			postOrderTraversalRecursive(root.right);
			System.out.println(root.val);
		}
	}
	/**
	 * 后序遍历，迭代实现
	 */
	public void postOrderTraversalIterative(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();  
        Stack<TreeNode> output = new Stack<TreeNode>();//构造一个中间栈来存储逆后续遍历的结果   
        while(root != null || stack.size()>0){  
            if(root != null){  
                output.push(root);  
                stack.push(root);  
                root = root.right;  
            }else{  
            	root = stack.pop();  
            	root = root.left;  
            }  
        }  
          
        while(output.size()>0){  
            System.out.println(output.pop().val);  
        }  
	}
}
