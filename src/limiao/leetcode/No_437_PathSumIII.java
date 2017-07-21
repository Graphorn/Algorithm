package limiao.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import limiao.datastructure.tree.BinaryTree;
import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 10, 2017 4:14:53 PM
 * 
 * 437. Path Sum III
 */
public class No_437_PathSumIII {

	public static void main(String[] args) {
		BinaryTree treeEntity = new BinaryTree();
		TreeNode root = treeEntity.init();
		No_437_PathSumIII no_437_PathSumIII = new No_437_PathSumIII();
		System.out.println(no_437_PathSumIII.pathSum(root, 9));
	}
	public int pathSum(TreeNode root, int sum) {
        List<Integer> list2 = new ArrayList<>();
        if(root!=null) listPath(root, list2, sum);
        return mapAllMap.get(sum)==null?0:mapAllMap.get(sum);
    }
	Map<Integer, Integer> mapAllMap = new HashMap<>();
    public void listPath(TreeNode root,List<Integer> list2, int sum){
		list2.add(root.val);
		//if(root.left==null&&root.right==null){
			for(int jj:list2) System.out.print(jj+" ");
			System.out.println("");
		//}
		// 到当前节点的路径
		Map<Integer, Integer> map = new HashMap<>();
		int su = 0;
		for(int i=list2.size()-1;i>=0;i--){
			su += list2.get(i);
			//System.out.println("su"+su);
			if(su == sum) map.put(su, map.get(su)==null?1:map.get(su)+1);
		}
		//System.out.println(map.get(sum)==null?0:map.get(sum));
		mapAllMap.put(sum, (mapAllMap.get(sum)==null?0:mapAllMap.get(sum))+(map.get(sum)==null?0:map.get(sum)));
		if(root.left!=null){
			listPath(root.left, list2, sum);
		}
		if(root.right!=null){
			listPath(root.right, list2, sum);
		}
		list2.remove(list2.size()-1);
	}
}
