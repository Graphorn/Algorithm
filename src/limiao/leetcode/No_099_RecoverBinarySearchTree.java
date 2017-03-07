package limiao.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Before;

import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 7, 2017 5:20:24 PM
 * 
 * 99. Recover Binary Search Tree
 */
public class No_099_RecoverBinarySearchTree {

	public static void main(String[] args) {
		No_099_RecoverBinarySearchTree no_099_RecoverBinarySearchTree = new No_099_RecoverBinarySearchTree();
		TreeEntity treeEntity = new TreeEntity();
		no_099_RecoverBinarySearchTree.recoverTree(treeEntity.init());
	}
	public void recoverTree(TreeNode root) {
		List<TreeNode> list = new ArrayList<>();
		TreeNode before = null;
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null||stack.size()!=0){
        	if(root!=null){
        		stack.push(root);
        		root = root.left;
        	}else{
        		root = stack.pop();
        		System.out.println(root.val);
        		if(before == null) before = root;
        		if(root.val>before.val){
        			list.add(before);
        			list.add(root);
        		}
        		before = root;
        		root = root.right;
        	}
        }
        if (list.size()==2) {
			int tmp = list.get(0).val;
			list.get(0).val = list.get(1).val;
			list.get(1).val = tmp;
		}else{
			int tmp = list.get(0).val;
			list.get(0).val = list.get(3).val;
			list.get(3).val = tmp;
		}
    }
}
