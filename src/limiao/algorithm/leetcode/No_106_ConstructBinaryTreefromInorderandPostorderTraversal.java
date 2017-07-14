package limiao.algorithm.leetcode;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 9, 2017 8:42:37 PM
 * 
 */
public class No_106_ConstructBinaryTreefromInorderandPostorderTraversal {

	public static void main(String[] args) {

	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null) return null;
        if(inorder.length==0||postorder.length==0) return null;
        int rootVal = postorder[postorder.length-1];
        TreeNode root = new TreeNode(rootVal);
        //左子树
        int leftCount = 0;
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]!=rootVal) leftCount++;
            else break;
        }
        int inorderL[] = new int[leftCount];
        for(int i=0;i<leftCount;i++){
            inorderL[i] = inorder[i];
        }
        int postorderL[] = new int[leftCount];
        for(int i=0;i<leftCount;i++){
            postorderL[i] = postorder[i];
        }
        //右子树
        int rightCount = postorder.length-1-leftCount;
        int inorderR[] = new int[rightCount];
        for(int i=leftCount+1;i<inorder.length;i++){
            inorderR[i-1-leftCount] = inorder[i];
        }
        int postorderR[] = new int[rightCount];
        for(int i=leftCount;i<postorder.length-1;i++){
            postorderR[i-leftCount] = postorder[i];
        }
        root.left = buildTree(inorderL,postorderL);
        root.right = buildTree(inorderR,postorderR);
        return root;
    }

}
