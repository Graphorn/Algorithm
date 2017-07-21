package limiao.leetcode;

import java.lang.annotation.Target;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import limiao.datastructure.tree.BinaryTree;
import limiao.datastructure.tree.TreeNode;

/**
 * @author seektech
 * @time Mar 5, 2017 11:20:45 PM
 * 
 * 513. Find Bottom Left Tree Value
 */
public class No_513_FindBottomLeftTreeValue {

	public static void main(String[] args) {
		No_513_FindBottomLeftTreeValue no_513_FindBottomLeftTreeValue = new No_513_FindBottomLeftTreeValue();
		BinaryTree treeEntity = new BinaryTree();
		System.out.println(no_513_FindBottomLeftTreeValue.findBottomLeftValue(treeEntity.init()));
	}
	public int findBottomLeftValue(TreeNode root) {
		TreeNode target = root;
		Queue<TreeNode> queue = new LinkedList<>();
		int curLevelCount = 1;
		int nextLevleCount = 0;
		queue.add(root);
		while(queue.size()>0){
			root = queue.poll();
			curLevelCount --;
			System.out.println(root.val);
			if(root.left!=null){
				queue.add(root.left);
				nextLevleCount ++;
			}
			if(root.right!=null){
				queue.add(root.right);
				nextLevleCount ++;
			}
			if(curLevelCount==0){
				if(nextLevleCount!=0) target = queue.peek();
				curLevelCount = nextLevleCount;
				nextLevleCount = 0;
			}
		}
        return target.val;
    }
}
