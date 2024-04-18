'''
Created on Apr 17, 2024

@author: alexxavier
'''

from typing import List

def findTheCity(n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    dist = [[float('inf')] * n for _ in range(n)]

    for edge in edges:
        dist[edge[0]][edge[1]] = edge[2]
        dist[edge[1]][edge[0]] = edge[2]

    for k in range(n):
        for i in range(n):
            for j in range(n):
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
                
    for i in range(n):
        dist[i][i] = 0

    minReachable = n + 1
    maxCity = -1

    for i in range(n):
        reachable = sum(1 for d in dist[i] if d <= distanceThreshold)
        if reachable <= minReachable:
            minReachable = reachable
            maxCity = max(maxCity, i)

    return maxCity


n1 = 4
edges1 = [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]]
distanceThreshold1 = 4
print(findTheCity(n1, edges1, distanceThreshold1)) 

n2 = 5
edges2 = [[0, 1, 2], [0, 4, 8], [1, 2, 3], [1, 4, 2], [2, 3, 1], [3, 4, 1]]
distanceThreshold2 = 2
print(findTheCity(n2, edges2, distanceThreshold2))  
