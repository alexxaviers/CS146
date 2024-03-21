```
function convertAdjListToAdjMatrix(adjList):
    n = length(adjList)  // Number of vertices
    adjMatrix = createMatrix(n, n)  // Initialize an empty n x n matrix

    for each vertex v in adjList:
        for each neighbor u of v in adjList:
            adjMatrix[v][u] = 1  // Mark the edge between v and u

    return adjMatrix

Explanation:
To convert adj list to an adj matrix we can iterate through each
vertex in the adjacency list. For each vertex, iterate through
its neighbors and mark the corresponding entry in the adjacency
matrix as 1 if there is an edge between them.

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
Iterate through each entry in the adjacency matrix.
If an entry is 1, add the corresponding edge to the
adjacency list by recording the relationship between vertices.
```
```
function reverseDirectedGraph(graph):
    reversedGraph = createEmptyGraph()

    for each vertex v in graph:
        for each neighbor u of v in graph:
            reversedGraph.addEdge(u, v)  // Add the edge in reverse direction

    return reversedGraph

Explanation:
Iterate through each vertex in the graph.
For each vertex, iterate through its outgoing edges
and reverse the direction of each edge by adding it
to the reversed graph in the opposite direction.

```






















