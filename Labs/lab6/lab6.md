```
Our main algorithm used in this lab is topological sorting. 
We want to start by initializing an empty graph where each node 
represents a course, and each edge represents a prerequisite relationship.
For each pair in the prerequisites list, we will add an edge from prereq to 
course in the graph. This will create a directed graph representing the prerequisite r
elationships. Now, we can do the topological sort on the graph. To do this, we 
add courses with no prerequisites to a queue and then process them individually 
while updating the graph. The actual topological sort happens in the while loop, 
where the courses are processed from the queue, and their prerequisites are removed 
from the graph. We terminate if we find a cycle in the graph, which is when a node 
leads to another node or when we process all the nodes. After all that in the end 
if the number of processed courses equals the total number of courses then we return
true, else return false.
```
