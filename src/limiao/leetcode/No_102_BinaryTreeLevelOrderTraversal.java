package limiao.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import limiao.datastructure.tree.TreeNode;

public class No_102_BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list1 = new ArrayList<>();
		if(root!=null){
	        List<Integer> list2 = new ArrayList<>();
	        int curCount = 1;
	        int nextCount = 0;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        while(queue.size()!=0){
	        	root = queue.poll();
	        	list2.add(root.val);
	        	curCount --;
	        	if(root.left!=null){
	        		queue.add(root.left);
	        		nextCount ++;
	        	}
	        	if(root.right!=null){
	        		queue.add(root.right);
	        		nextCount ++;
	        	}
	        	if(curCount == 0){
	        		list1.add(list2);
	        		//list2.clear();// 这里不能用clear，否则每次添加的会是同一个list2
	        		list2 = new ArrayList<>();
	        		curCount = nextCount;
	        		nextCount = 0;
	        	}
	        }
		}
		return list1;
    }
}
