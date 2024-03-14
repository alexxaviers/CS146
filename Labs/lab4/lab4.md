```
The algorithm used is a recursive approach to invert the binary tree.
We start with a base case to ensure that we will have an end to the 
loop when the current node is null. When we are at a node that is not null, 
we swap the left and right nodes. We call the recursive method on both the 
left and right subtrees. Once all the nodes are swapped, the tree will be inverted, 
and we will terminate because the last node will be null, which will reach the base case.
```
