package limiao.datastructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author limiao
 * Mar 9, 2017 10:05:36 PM
 * 
 * 113. Path Sum II
 */
public class No_113_PathSumII {

	public static void main(String[] args) {
		TreeEntity treeEntity = new TreeEntity();
		TreeNode root = treeEntity.init();
		No_113_PathSumII no_113_PathSumII = new No_113_PathSumII();
		no_113_PathSumII.pathSum(root, 0);
	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<Integer> list2 = new ArrayList<>();
        if(root!=null) listPath(root,sum,list2,list1);
        return list1;
    }
	public void listPath(TreeNode root,int sum,List<Integer> list2,List<List<Integer>> list1){
		list2.add(root.val);
		if(root.left==null&&root.right==null&&sum==root.val){
			List<Integer> listTmp = new ArrayList<>();
            for (Integer i : list2) {
                listTmp.add(i);
            }
			list1.add(listTmp);
		}
		if(root.left!=null){
			listPath(root.left,sum-root.val,list2,list1);
		}
		if(root.right!=null){
			listPath(root.right,sum-root.val,list2,list1);
		}
		list2.remove(list2.size()-1);
	}
}
