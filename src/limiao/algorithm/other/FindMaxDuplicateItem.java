package limiao.algorithm.other;

import java.util.ArrayList;
import java.util.List;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Feb 28, 2017 9:18:57 PM
 * 
 * 找出数组中重复次数最多的数字，数组分为有序数组和无序数组，重复数字可能次数最多的有多个
 */
public class FindMaxDuplicateItem {

	int count = 0;
    List<Integer> maxItem = new ArrayList<Integer>();
	int maxCount = 0;
	int currentItem = 0;
	int currentItemCount = 0;
    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int result[] = new int[maxItem.size()];
		for(int i=0; i<maxItem.size();i++) result[i] = maxItem.get(i);
        return result;
    }
    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            int value = root.val;
            //System.out.println(value);
            if(count == 0){
            	currentItem = value;
            	currentItemCount = 1;
            	maxCount = 1;
            	maxItem.add(currentItem);
            }else{
            	 if(currentItem == value){
            	     currentItemCount += 1;
            	 } 
                 else{
                 	maxCount = currentItemCount>maxCount?currentItemCount:maxCount;
                 	currentItem = value;
                 	currentItemCount = 1;
                 }
                 if(currentItemCount>maxCount){
                 		maxItem.clear();
                 		maxItem.add(currentItem);	
                 }else if(currentItemCount == maxCount) maxItem.add(currentItem);// 如果只返回一个的话相等的时候也不做处理就可以
            }
            count += 1;
            
            // for(int i=0;i<maxItem.size();i++) System.out.print(maxItem.get(i));
            // System.out.println(" ");
            
            inOrderTraversal(root.right);
        }
    }

}
