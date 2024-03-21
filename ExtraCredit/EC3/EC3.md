```
function convertAdjListToAdjMatrix(adjList):
    n = length(adjList)  // Number of vertices
    adjMatrix = createMatrix(n, n)  // Initialize an empty n x n matrix

    for each vertex v in adjList:
        for each neighbor u of v in adjList:
            adjMatrix[v][u] = 1  // Mark the edge between v and u

    return adjMatrix

Explanation:
adjList is the input adjacency list representing the graph.
createMatrix(n, m) is a function that creates an n x m matrix filled with zeros.
The algorithm iterates through each vertex in the adjacency list and marks the 
corresponding entries in the adjacency matrix as 1 if there is an edge between the vertices.

```

```
function convertAdjMatrixToAdjList(adjMatrix):
    n = rows(adjMatrix)  // Number of vertices
    adjList = createEmptyList(n)  // Initialize an empty adjacency list

    for i from 0 to n-1:
        for j from 0 to n-1:
            if adjMatrix[i][j] == 1:
                adjList[i].append(j)  // Add j as a neighbor of i

    return adjList


Explanation:

adjMatrix is the input adjacency matrix representing the graph.
createEmptyList(n) is a function that creates an empty list of size n.
The algorithm iterates through each entry in the adjacency matrix.
If an entry is 1, it adds the corresponding edge to the adjacency list.
```
```
function reverseDirectedGraph(graph):
    reversedGraph = createEmptyGraph()

    for each vertex v in graph:
        for each neighbor u of v in graph:
            reversedGraph.addEdge(u, v)  // Add the edge in reverse direction

    return reversedGraph

Explanation:
graph is the input directed graph.
createEmptyGraph() is a function that creates an empty graph.
The algorithm iterates through each vertex in the graph and each
of its neighbors. It adds edges to the reversed graph in the opposite
direction compared to the original graph.

```






















