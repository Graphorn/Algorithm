package limiao.datastructure.tree;

/**
 * 二叉搜索树，左子树所有节点的值都小于父节点，右子树上的所有的节点的值都大于父节点
 * @author limiao
 * @time 2016年5月3日 下午3:50:17
 */
public class BinarySearchTree {
	private BinaryNode root;
	
	/**
	 * 构造函数
	 */
	public BinarySearchTree(){
		root = null;
	}
	
	/**
	 * 清空二叉查找树
	 */
	public void makeEmpty(){
		root = null;
	}
	public boolean isEmpty(){
		return root == null;
	}
	public boolean contains(int x){
		return contains(x,root);
	}
	public int findMin(){
		if(isEmpty()) System.out.println("树为空");
		return findMin(root).element;
	}
	public int findMax(){
		if(isEmpty()) System.out.println("树为空");
		return findMax(root).element;
	}
	public void insert(int x){ 
		root = insert(x,root);
	}
	public void remove(int x){
		root = remove(root,x);
	}
	public void printTree(){
		
	}
	/**
	 * @param x 查询的节点的值
	 * @param t 树或者子树的根节点
	 * @return 是否存在值为x的节点
	 */
	private boolean contains(int x, BinaryNode t){
		if(t == null) return false;
		
		if(x > t.element) return contains(x,t.rightChild);
		else if(x < t.element) return contains(x,t.leftChild);
		else return true;
	}
	/**
	 * @param t 树或子树的根节点
	 * @return 有最小值的节点
	 */
	private BinaryNode findMin(BinaryNode t){
		if(t == null) return null;
		else if(t.leftChild == null) return t;
		return findMin(t.leftChild);
	}
	/**
	 * @param t 树或子树的根节点
	 * @return 有最大值的节点
	 */
	private BinaryNode findMax(BinaryNode t){
		if(t!=null){
			while(t.rightChild != null) t = t.rightChild;
		}
		return t;
	}
	/**
	 * @param x 待插入节点的值
	 * @param t 树或子树的根节点
	 * @return 返回新的根节点
	 * 不考虑相等情况，有相等情况直接不插入
	 */
	private BinaryNode insert(int x, BinaryNode t){
		if(t == null) return new BinaryNode(x);
		if(x > t.element) t.leftChild = insert(x, t.leftChild);
		else if(x < t.element) t.rightChild = insert(x, t.rightChild);
		return t;
	}
	/**
	 * @param key 待删除的节点的值
	 * @param root 根节点或子树的节点
	 * @return 新的根节点
	 */
	private BinaryNode remove(BinaryNode root, int key){
		if(root == null) return root;
        if(key < root.element) root.leftChild = remove(root.leftChild,key);
        else if(key > root.element) root.rightChild = remove(root.rightChild,key);
        else if(root.rightChild!=null&&root.leftChild!=null){
            root.element = findMin(root.rightChild).element;
            root.rightChild = remove(root.rightChild,root.element);
        }else{
            root = (root.leftChild!=null)?root.leftChild:root.rightChild;
        }
        return root;
	}
	public void printTree(BinaryNode t){
		if(t != null){
			printTree(t.leftChild);
			System.out.println(t.element);
			printTree(t.rightChild);
		}
	}

	/**
	 * 嵌套类，二叉查找树节点类 
	 */
	public static class BinaryNode{
		int element;
		BinaryNode leftChild;
		BinaryNode rightChild;
		
		public BinaryNode(int theElement) {
			this(theElement, null, null);
		}
		public BinaryNode(int theElement, BinaryNode lt, BinaryNode rt) {
			element = theElement;
			leftChild = lt;
			rightChild = rt;
		}
	}
}
