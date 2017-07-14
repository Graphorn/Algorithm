package limiao.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 9, 2017 9:51:56 AM
 * 
 */
public class No_107_BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0, 2);
		System.out.println(list.size());
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        if(root!=null){
        	List<Integer> list2 = new ArrayList<>();
        	int curCount = 1;
        	int nextCount = 0;
        	Queue<TreeNode> queue = new LinkedList<>();
        	queue.add(root);
        	while(!queue.isEmpty()){
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
                	list2 = new ArrayList<>();
                	curCount = nextCount;
                	nextCount = 0;
                }
        	}
        	for(int i=0;i<list1.size()-1;i++){// 这里也可以不建议，只是最后一个元素没必要自己更自己换
        		list1.add(i, list1.get(list1.size()-1));
        		list1.remove(list1.size()-1);
        	}
        }
        return list1;
    }
}
