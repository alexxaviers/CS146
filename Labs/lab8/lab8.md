```

For this problem, we will need to use some dynamic programming principles.
We start with an array with the minimum number of coins to reach the amount. 
We set the values in the array all to max values to represent that we cannot do 
anything with these, so we will just have place holder values. For the main part of 
the algorithm, it iterates through each amount i from 1 to amount. For each amount i,
it iterates through each coin denomination in the coins array. If the current coin 
denomination can be used to make amount i and the previously calculated amount is 
reachable, then the algorithm updates dynap[i] to be the minimum between its current 
value and 1 + dynap[i - coins[j]]. The 1 + dynap[i - coins[j]] represents using one coin 
of denomination coins plus the minimum number of coins needed to make up the remaining amount.
This is the main part of the algorithm, and in the end, if dynap[amount] is still Integer.MAX_VALUE,
it means no combination so -1 is returned. Else, dynap[amount] is returned as the result.

```
