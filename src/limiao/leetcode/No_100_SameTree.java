package limiao.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 7, 2017 10:11:02 PM
 * 
 * 100. Same Tree
 */
public class No_100_SameTree {

	public static void main(String[] args) {

	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		Queue<TreeNode> queue = new LinkedList<>();
		Stack<TreeNode> stackP = new Stack<>();
		Stack<TreeNode> stackQ = new Stack<>();
		if((p==null&&q!=null)||(p!=null&&q==null)) return false;
		while(p!=null||stackP.size()!=0){
			if(p!=null){
				stackP.add(p);
				p = p.left;
			}else{
				p = stackP.pop();
				queue.add(p);
				p = p.right;
			}
		}
		while(q!=null||stackQ.size()!=0){
			if(q!=null){
				stackQ.add(q);
				q = q.left;
			}else{
				q = stackQ.pop();
				TreeNode node = queue.poll();
				if(q.val!=node.val) return false;
				q = q.right;
			}
		}
        return true;
    }
}
