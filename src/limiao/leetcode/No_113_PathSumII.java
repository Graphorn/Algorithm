package limiao.leetcode;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import limiao.datastructure.tree.TreeEntity;
import limiao.datastructure.tree.TreeNode;

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
		List<List<Integer>> list = no_113_PathSumII.pathSum(root, 18);
		for(List<Integer> listO:list){
			for(Integer in:listO){
				System.out.print(in+" ");
			}
			System.out.println("");
		}
	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<Integer> list2 = new ArrayList<>();
        // 方法一，递归
        if(root!=null) listPath(root,sum,list2,list1);
//        // 方法二，非递归 未完成
//        Stack<TreeNode> stack = new Stack<>();
//        while(root!=null||stack.size()>0){
//        	if(root!=null){
//        		stack.add(root);
//        		System.out.println(root.val);
//        		list2.add(root.val);
//        		if(root.left==null&&root.right==null){
//        			List<Integer> listTmp = new ArrayList<>();
//        			int sumTmp = 0;
//        			for(Integer item:list2){
//        				listTmp.add(item);
//        				sumTmp += item;
//        			}
//        			if(sumTmp==sum) list1.add(listTmp);
//        		}
//        		root = root.left;
//        	}else {
//				root = stack.pop();
//				root = root.right;
//			}
//        }
        return list1;
    }
	public void listPath(TreeNode root,int sum,List<Integer> list2,List<List<Integer>> list1){
//		list2.add(root.val);
//		if(root.left==null&&root.right==null&&sum==root.val){
//			List<Integer> listTmp = new ArrayList<>();
//            for (Integer i : list2) {
//                listTmp.add(i);
//            }
//			list1.add(listTmp);
//		}
//		if(root.left!=null){
//			listPath(root.left,sum-root.val,list2,list1);
//		}
//		if(root.right!=null){
//			listPath(root.right,sum-root.val,list2,list1);
//		}
//		list2.remove(list2.size()-1);
		
		// 也可以不共享list2变量，每次递归都构造一个自己的路径的链表
		List<Integer> list2T = new ArrayList(list2);
		list2T.add(root.val);
		if(root.left==null&&root.right==null&&sum==root.val){
			// 不需要构造新的变量
//			List<Integer> listTmp = new ArrayList<>();
//            for (Integer i : list2T) {
//                listTmp.add(i);
//            }
			list1.add(list2T);
		}
		System.out.println(root.val);
		if(root.left!=null){
			listPath(root.left,sum-root.val,list2T,list1);
		}
		if(root.right!=null){
			listPath(root.right,sum-root.val,list2T,list1);
		}
	}
}
