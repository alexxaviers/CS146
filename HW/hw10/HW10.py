'''
Created on Mar 18, 2024

@author: alexxavier
'''
from typing import List, Optional
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        level_order_list = []
        if not root:
            return level_order_list
        
        queue = deque()
        queue.append(root)
        
        while queue:
            level_size = len(queue)
            current_level = []
            for _ in range(level_size):
                node = queue.popleft()
                current_level.append(node.val)
                
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            
            level_order_list.append(current_level)
        
        return level_order_list


if __name__ == "__main__":
    x = Solution()

    root = TreeNode(10)
    root.left = TreeNode(5)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(7)
    root.right = TreeNode(15)
    root.right.left = TreeNode(12)
    root.right.right = TreeNode(20)

    print(x.levelOrder(root))
