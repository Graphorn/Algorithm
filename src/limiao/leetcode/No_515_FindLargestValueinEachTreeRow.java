package limiao.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import limiao.datastructure.tree.BinaryTree;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 1, 2017 10:12:34 AM
 * 
 * 515. Find Largest Value in Each Tree Row
 */
public class No_515_FindLargestValueinEachTreeRow {
	public static void main(String[] args) {
		No_515_FindLargestValueinEachTreeRow no_515_FindLargestValueinEachTreeRow = new No_515_FindLargestValueinEachTreeRow();
		BinaryTree treeEntity = new BinaryTree();
		List<Integer> list = no_515_FindLargestValueinEachTreeRow.largestValues(treeEntity.init());
		for(int i:list){
			System.out.print(i+" ");
		}
	}
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		// 按层次遍历
		if(root == null) return list;
		int max = Integer.MIN_VALUE;
		int currentRowCount = 1;
		int nextRowCount = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			root = queue.peek();
			queue.poll();
			currentRowCount --;
			System.out.print(root.val+" ");
			max = max>root.val?max:root.val;
			if(root.left != null){
				queue.add(root.left);
				nextRowCount ++;
			}
			if(root.right != null){
				queue.add(root.right);
				nextRowCount ++;
			}
			if(0 == currentRowCount)//换行  
	        {  
	        	System.out.println(" ");
	        	list.add(max);
	        	max = Integer.MIN_VALUE;
	        	currentRowCount = nextRowCount;  
	        	nextRowCount = 0;  
	        }  
		}
		return list;
    }
}
