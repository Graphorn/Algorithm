package limiao.leetcode;

import java.util.ArrayList;
import java.util.List;

import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 14, 2017 6:20:25 PM
 * 
 * 257. Binary Tree Paths
 */
public class No_257_BinaryTreePaths {

	public static void main(String[] args) {
		TreeEntity treeEntity = new TreeEntity();
		No_257_BinaryTreePaths no_257_BinaryTreePaths = new No_257_BinaryTreePaths();
		List<String> list = no_257_BinaryTreePaths.binaryTreePaths(treeEntity.init());
		for(String i:list){
			System.out.println(i);
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        String tmpString = "";
        preTraversal(root, list, tmpString);
        return list;
    }
	public void preTraversal(TreeNode root, List<String> list, String tString){
		if(root==null) return;
		tString = tString + "->"+root.val;
		String string = new String(tString);
		if(root.left==null&&root.right==null) list.add(string.substring(2));
		if(root.left!=null) preTraversal(root.left, list, string);
		if(root.right!=null) preTraversal(root.right, list, string);
	}
}
