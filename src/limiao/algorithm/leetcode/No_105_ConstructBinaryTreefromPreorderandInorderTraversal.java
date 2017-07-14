package limiao.algorithm.leetcode;

import limiao.datastructure.tree.TreeNode;

/**
 * @author limiao
 * Mar 9, 2017 7:07:19 PM
 * 
 */
public class No_105_ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args) {
		No_105_ConstructBinaryTreefromPreorderandInorderTraversal tt = new No_105_ConstructBinaryTreefromPreorderandInorderTraversal();
		tt.buildTree(new int[]{1,2,4,5,3,6,7}, new int[]{4,2,5,1,6,3,7});
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder == null||inorder==null) return  null;
		if(preorder.length==0||inorder.length==0) return null;
		
		int rootVal = preorder[0];
		TreeNode root = new TreeNode(rootVal);
		//左子树
		int leftCount = 0;
		for(int i=0;i<inorder.length;i++){
			if(inorder[i]!=rootVal) leftCount++;
			else break;
		}
		int preorderL[] = new int[leftCount];
		for(int i=1;i<=leftCount;i++){
			preorderL[i-1] = preorder[i];
		}
		int inorderL[] = new int[leftCount];
		for(int i=0;i<leftCount;i++){
			inorderL[i] = inorder[i];
		}
		//右子树
		int rightCount = inorder.length-leftCount-1;
		int preorderR[] = new int[rightCount];
		for(int i=1+leftCount;i<preorder.length;i++){
			preorderR[i-1-leftCount] = preorder[i];
		}
		int inorderR[] = new int[rightCount];
		for(int i=1+leftCount;i<inorder.length;i++){
			inorderR[i-1-leftCount] = inorder[i];
		}
		
		root.left = buildTree(preorderL, inorderL);
		root.right = buildTree(preorderR, inorderR);
        return root;
    }
}
