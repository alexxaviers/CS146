package Labs;

public class Lab5 {

	public static boolean isValidBST(TreeNode root) {
		return isValidBSTHelper(root, null, null);
	}

	private static boolean isValidBSTHelper(TreeNode node, Integer min, Integer max) {
		if (node == null)
			return true;

		if ((min != null && node.val <= min) || (max != null && node.val >= max))
			return false;

		return isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right, node.val, max);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		// root.left.right = new TreeNode(7123123);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(20);
		System.out.println(isValidBST(root));
	}

}

//Tree class declared in previous Lab4 class. It was giving error when I put it in here
//class TreeNode {
//
//	int val;
//
//	TreeNode left;
//
//	TreeNode right;
//
//	TreeNode() {
//	}
//
//	TreeNode(int val) {
//		this.val = val;
//	}
//
//	TreeNode(int val, TreeNode left, TreeNode right) {
//
//		this.val = val;
//
//		this.left = left;
//
//		this.right = right;
//
//	}
//
//}