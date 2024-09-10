public class BST{
	public static void main(String[] args) {
		BinarySerachTree bs = new BinarySerachTree();
		bs.insert(30);
		bs.insert(55);
		bs.insert(4);
		bs.insert(10);
		bs.insert(100);
		bs.insert(6);
		bs.Delete(bs.root, 4);
		bs.inOrder();
	}
}
class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value){
		this.key = value;
		this.left = null;
		this.right = null;
	}
}
class BinarySerachTree{

	TreeNode root;
	public BinarySerachTree(){
		root = null;
	}

	void insert(int value){
		root = insertRecord(root,value);
	}	
	public TreeNode insertRecord(TreeNode root, int value){
		if(root == null){
			root = new TreeNode(value);
			return root;
		}
		if(value < root.key){
			root.left = insertRecord(root.left,value);
		}
		else if(value > root.key){
			root.right = insertRecord(root.right,value);
		}
		return root;
	}
	public void inOrder(){
		inOrderRec(root);
		System.out.println();
	}
	private void inOrderRec(TreeNode root){
		if(root != null){
			inOrderRec(root.left);
			System.out.print(root.key + " ");
			inOrderRec(root.right);
		}
	}
	public void preOrder(){
		preOrderRec(root);
		System.out.println();
	}
	private void preOrderRec(TreeNode root){
		if(root != null){
			System.out.print(root.key + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	public void postOrder(){
		postOrderRec(root);
		System.out.println();
	}
	private void postOrderRec(TreeNode root){
		if(root != null){
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key + " ");
		}
	}
	public TreeNode Delete(TreeNode root,int key){
		if(root == null){
			return root;
		}
		if(key<root.key){
			root.left = Delete(root.left,key);
		}
		else if(key>root.key){
			root.right = Delete(root.right,key);
		}
		else{
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			root.key = minVal(root.right);
			root.right = Delete(root.right, root.key);
		}
        return root;
	}
	private int minVal(TreeNode right){
		int min = root.key;
		while(root.left != null){
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
}