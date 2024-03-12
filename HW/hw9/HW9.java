package HW;

public class HW9 {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int lower;
		int higher;
		TreeNode current = root;

		if (p.val < q.val) {
			lower = p.val;
			higher = q.val;
		}

		else {
			lower = q.val;
			higher = p.val;
		}

		while (true) {
			if (current.val >= lower && current.val <= higher) {
				return current;
			}

			if (current.val < lower) {
				current = current.right;
			}

			else {
				current = current.left;
			}
		}

	}

	public static void main(String[] args) {
		HW9 x = new HW9();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		System.out.println(lowestCommonAncestor(root, root.left.left, root.right.right).val);

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
