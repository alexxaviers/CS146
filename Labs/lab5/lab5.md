```
The isValidBST method checks if the given BST is valid through a helper function. 
This helper function recursively goes through the BST within a specific range.
We set these to null at the start since we do not have them yet. It checks the
current node's value by comparing it with min and max; if it violates, it returns
false. It then recursively checks the left subtree with the updated max value as the 
current node's value, which we always change since all values in the left subtree must
be less than the current node. Then, the right subtree with the updated min value is the 
current node's value with the same idea since all values in the right subtree must be 
greater than the current node. 
```
