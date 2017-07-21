package limiao.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author seektech
 * Feb 28, 2017 9:29:02 AM
 */
public class BinaryTree {
	public static void main(String args[]){
		BinaryTree binaryTree = new BinaryTree();
		TreeNode root = binaryTree.init();
		
		System.out.println("先序遍历-递归");
		binaryTree.preOrderTraversalRecursive(root);
		System.out.println("先序遍历-迭代");
		binaryTree.preOrderTraversalIterative(root);
		
		System.out.println("中序遍历-递归");
		binaryTree.inOrderTraversalRecursive(root);
		System.out.println("中序遍历-迭代");
		binaryTree.inOrderTraversalIterative(root);
		
		System.out.println("后序遍历-递归");
		binaryTree.postOrderTraversalRecursive(root);
		System.out.println("后序遍历-迭代");
		binaryTree.postOrderTraversalIterative(root);
		
		System.out.println("层次遍历");
		binaryTree.rowOrderTraversal(root);
		
		System.out.println("利用高度判断平衡二叉树");
		System.out.println(binaryTree.isBalanced(root));
	}
	/**
	 * BinaryTree实体类
	 *              6
	 *            /  \
	 *           3    9
	 *          / \   /
	 *         1   5  7
	 *          \  /   \
	 *           2 4    8
	 */
	public TreeNode init(){  
        TreeNode J = new TreeNode(8, null, null);  
        TreeNode H = new TreeNode(4, null, null);  
        TreeNode G = new TreeNode(2, null, null);  
        TreeNode F = new TreeNode(7, null, J);  
        TreeNode E = new TreeNode(5, H, null);  
        TreeNode D = new TreeNode(1, null, G);  
        TreeNode C = new TreeNode(9, F, null);  
        TreeNode B = new TreeNode(3, D, E);  
        TreeNode A = new TreeNode(6, B, C);  
        return A;  //返回根节点  
    }  
	/**
	 * 完全二叉树实体类
	 *              6
	 *            /  \
	 *           3    9
	 *          / \   /\
	 *         1   5 7  4
	 *        / \     
	 *       8   2
	 */
	public TreeNode initCompleteTree(){
        TreeNode J = new TreeNode(8, null, null);  
        TreeNode H = new TreeNode(4, null, null);  
        TreeNode G = new TreeNode(2, null, null);  
        TreeNode F = new TreeNode(7, null, null);  
        TreeNode E = new TreeNode(5, null, null);  
        TreeNode D = new TreeNode(1, J, G);  
        TreeNode C = new TreeNode(9, F, H);  
        TreeNode B = new TreeNode(3, D, E);  
        TreeNode A = new TreeNode(6, B, C);  
        return A;  //返回根节点  
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
                System.out.println(stack.size()+"zz");
                root = root.left;  
            }else{  
            	root = stack.pop();//出栈并访问  
                System.out.println(root.val); 
                root = root.right;  
            }  
        }  
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
	/**
	 * 层次遍历
	 */
	public void rowOrderTraversal(TreeNode root){
		if(root != null){
			int currentRowCount = 1;
			int nextRowCount = 0;	
			Queue<TreeNode> queue = new LinkedList<>();
			// 首先将根节点入队
			queue.add(root);
			while(!queue.isEmpty()){
				root = queue.peek();
				queue.poll();
				System.out.print(root.val+" ");
				currentRowCount --;
				if(root.left != null)  
		        {  
					queue.add(root.left);
					nextRowCount ++;  
		        }  
				if(root.right != null)  
		        {  
					queue.add(root.right);
					nextRowCount ++;  
		        }  
		        if(0 == currentRowCount)//换行  
		        {  
		        	System.out.println(" ");  
		        	currentRowCount = nextRowCount;  
		        	nextRowCount = 0;  
		        }  
			}
		}
	}
	/**
	 * 判断是否为平衡二叉树
	 */
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(height(root.left)-height(root.right))<=1;
    }
    /**
     * 求节点的高度
     */
    private static int height(TreeNode node){
        if(node == null) return -1;
        else return Math.max(height(node.left),height(node.right))+1;
    }
}
