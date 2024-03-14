package Labs;

public class Lab4 {

	public static void invertTree(TreeNode root) {
		if (root == null) {
			return;
		}

		TreeNode current = root.left;
		root.left = root.right;
		root.right = current;
		invertTree(root.right);
		invertTree(root.left);
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}

		printTree(root.right);
		System.out.print(root.val + " ");
		printTree(root.left);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(20);

		System.out.println("Original Tree: ");
		printTree(root);
		System.out.println();
		invertTree(root);
		System.out.println("Inverted Tree: ");
		printTree(root);
	}
}

class TreeNode {

	int val;

	TreeNode left;

	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {

		this.val = val;

		this.left = left;

		this.right = right;

	}

}
