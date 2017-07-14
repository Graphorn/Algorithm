package limiao.algorithm.datastructure.tree;

/**
 * @author seektech
 * Feb 28, 2017 9:29:02 AM
 * 
 * Tree实体类
 *              6
 *            /  \
 *           3    9
 *          / \   /
 *         1   5  7
 *          \  /   \
 *           2 4    8
 */
public class TreeEntity {
	public TreeNode init(){  
        TreeNode J = new TreeNode(8, null, null);  
        TreeNode H = new TreeNode(4, null, null);  
        TreeNode G = new TreeNode(2, null, null);  
        TreeNode F = new TreeNode(7, null, J);  
        TreeNode E = new TreeNode(5, H, null);  
        TreeNode D = new TreeNode(1, null, G);  
        TreeNode C = new TreeNode(9, F, null);  
        TreeNode B = new TreeNode(3, D, E);  
        TreeNode A = new TreeNode(6, B, C);  
        return A;  //返回根节点  
    }  
	public TreeNode initCompleteTree(){
		//完全二叉树
        TreeNode J = new TreeNode(8, null, null);  
        TreeNode H = new TreeNode(4, null, null);  
        TreeNode G = new TreeNode(2, null, null);  
        TreeNode F = new TreeNode(7, null, null);  
        TreeNode E = new TreeNode(5, null, null);  
        TreeNode D = new TreeNode(1, J, G);  
        TreeNode C = new TreeNode(9, F, H);  
        TreeNode B = new TreeNode(3, D, E);  
        TreeNode A = new TreeNode(6, B, C);  
        return A;  //返回根节点  
	}
}
