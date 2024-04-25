'''
Created on Apr 23, 2024

@author: alexxavier
'''
from typing import List

from typing import List


def coinChange(coins, amount):
    dp = [float('inf')] * (amount + 1)
    dp[0] = 0

    for i in range(1, amount + 1):
        for coin in coins:
            if i - coin >= 0 and dp[i - coin] != float('inf'):
                dp[i] = min(dp[i], 1 + dp[i - coin])

    if dp[amount] == float('inf'):
        return -1
    return dp[amount]
      
# Test cases


coins1 = [1, 2, 5]
amount1 = 11
print(coinChange(coins1, amount1))  # Output: 3 (11 = 5 + 5 + 1)

coins2 = [2]
amount2 = 3
print(coinChange(coins2, amount2))  # Output: -1 (Cannot make amount 3 with only denomination 2)

coins3 = [1]
amount3 = 0
print(coinChange(coins3, amount3))  # Output: 0 (Amount 0 requires 0 coins)

coins4 = [1]
amount4 = 1
print(coinChange(coins4, amount4))  # Output: 1 (Amount 1 requires 1 coin of denomination 1)

coins5 = [1]
amount5 = 2
print(coinChange(coins5, amount5))  # Output: 2 (Amount 2 requires 2 coins of denomination 1)
