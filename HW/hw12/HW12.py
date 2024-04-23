'''
Created on Apr 15, 2024

@author: alexxavier
'''
from typing import List

class HW12:
    class OptimizeWaterDistribution:
        def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
            costs = []
            for i in range(1, n + 1):
                costs.append((0, i, wells[i - 1]))
            for p in pipes:
                costs.append((p[0], p[1], p[2]))
            
            costs.sort(key=lambda x: x[2])
            min_cost = 0
            
            disjoint_set = UnionFind(n)
            for edge in costs:
                root_x = disjoint_set.find(edge[0])
                root_y = disjoint_set.find(edge[1])
                if root_x == root_y:
                    continue
                min_cost += edge[2]
                disjoint_set.union(edge[0], edge[1])
                n -= 1
                if n == 0:
                    return min_cost
            return min_cost

class UnionFind:
    def __init__(self, n):
        self.parent = list(range(n + 1))
        self.rank = [0] * (n + 1)

    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]

    def union(self, x, y):
        parentx = self.find(x)
        parenty = self.find(y)
        if parentx == parenty:
            return
        if self.rank[parentx] >= self.rank[parenty]:
            self.parent[parenty] = parentx
            self.rank[parentx] += self.rank[parenty]
        else:
            self.parent[parentx] = parenty
            self.rank[parenty] += self.rank[parentx]



if __name__ == "__main__":
    hw12 = HW12()
    optimizer = hw12.OptimizeWaterDistribution()

    n1 = 2
    wells1 = [1, 1]
    pipes1 = [[1, 2, 1], [1, 2, 2]]
    print("Minimum Cost for Test Case 1:", optimizer.minCostToSupplyWater(n1, wells1, pipes1))

    n2 = 4
    wells2 = [2, 3, 5, 7]
    pipes2 = [[1, 2, 1], [1, 3, 2], [2, 4, 4], [3, 4, 3]]
    print("Minimum Cost for Test Case 2:", optimizer.minCostToSupplyWater(n2, wells2, pipes2))

    n3 = 6
    wells3 = [1, 3, 2, 4, 5, 6]
    pipes3 = [[1, 2, 3], [2, 3, 5], [1, 3, 2], [4, 5, 1], [5, 6, 4], [4, 6, 2]]
    print("Minimum Cost for Test Case 3:", optimizer.minCostToSupplyWater(n3, wells3, pipes3))
