```
The algorithm used to solve the problem starts by comparing the values of the two given nodes p and q. 
Based on their values, it iteratively traverses down the tree starting from the root until it finds the LCA.
It compares the value of the current node with both the values of p and q. If both p and q are on the same side of the current node,
we continue the search in that subtree. Else it stops at thatcurrent node which is the LCA.

```
