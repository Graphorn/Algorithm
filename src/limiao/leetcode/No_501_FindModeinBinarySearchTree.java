package limiao.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.portable.ValueBase;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Feb 28, 2017 5:28:16 PM
 * 
 * 501. Find Mode in Binary Search Tree
 */
public class No_501_FindModeinBinarySearchTree {
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
                 }else if(currentItemCount == maxCount) maxItem.add(currentItem);
            }
            count += 1;
            
            // for(int i=0;i<maxItem.size();i++) System.out.print(maxItem.get(i));
            // System.out.println(" ");
            
            inOrderTraversal(root.right);
        }
    }
}
