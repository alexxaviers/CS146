package HW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class HW10 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> LOrderList = new ArrayList<>();

		if (root == null) {
			return LOrderList;
		}

		Queue<TreeNode> listOfTreeNodes = new LinkedList<>();
		listOfTreeNodes.add(root);

		while (!listOfTreeNodes.isEmpty()) {
			int levelSize = listOfTreeNodes.size();

			List<Integer> currentLevel = new ArrayList<>();
			for (int i = 0; i < levelSize; i++) {
				TreeNode curr = listOfTreeNodes.poll();
				currentLevel.add(curr.val);

				if (curr.left != null) {
					listOfTreeNodes.add(curr.left);
				}

				if (curr.right != null) {
					listOfTreeNodes.add(curr.right);
				}
			}

			LOrderList.add(currentLevel);
		}

		return LOrderList;

	}

	public static void main(String[] args) {
		HW10 x = new HW10();

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(20);

		System.out.println(x.levelOrder(root));

	}

}
