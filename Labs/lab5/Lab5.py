'''
Created on Mar 13, 2024

@author: alexxavier
'''

class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
class Solution:
    def isValidBST(self, root):
        return self._isValidBSTHelper(root, float('-inf'), float('inf'))

    def _isValidBSTHelper(self, node, min_val, max_val):
        if not node:
            return True

        if not min_val < node.val < max_val:
            return False

        return (self._isValidBSTHelper(node.left, min_val, node.val) and
                self._isValidBSTHelper(node.right, node.val, max_val))

if __name__ == "__main__":
    root = TreeNode(10)
    root.left = TreeNode(5)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(7)
    #root.left.right = TreeNode(7123123)
    root.right = TreeNode(15)
    root.right.left = TreeNode(12)
    root.right.right = TreeNode(20)
    
    solution = Solution()
    print(solution.isValidBST(root))

