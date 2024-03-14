'''
Created on Mar 13, 2024

@author: alexxavier
'''

class Solution:
    def invertTree(self, root):
        if root is None:
            return

        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)

    def printTree(self, root):
        if root is None:
            return

        self.printTree(root.right)
        print(root.val, end=" ")
        self.printTree(root.left)

if __name__ == "__main__":
    class TreeNode:
        def __init__(self, val=0, left=None, right=None):
            self.val = val
            self.left = left
            self.right = right

    root = TreeNode(10)
    root.left = TreeNode(5)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(7)
    root.right = TreeNode(15)
    root.right.left = TreeNode(12)
    root.right.right = TreeNode(20)

    solution = Solution()

    print("Original Tree:")
    solution.printTree(root)
    print("\nInverted Tree:")
    solution.invertTree(root)
    solution.printTree(root)






