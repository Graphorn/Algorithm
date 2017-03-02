package limiao.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author limiao
 * Mar 1, 2017 9:14:37 AM
 * 
 * 二叉树的按层次遍历，用到了队结构,非递归
 */
public class RowOrderTraversal {
	public static void main(String[] args) {
		RowOrderTraversal rowOrder = new RowOrderTraversal();
		TreeEntity treeEntity = new TreeEntity();
		rowOrder.rowOrderTraversal(treeEntity.init());
	}
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
}
