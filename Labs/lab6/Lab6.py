'''
Created on Mar 27, 2024

@author: alexxavier
'''
from collections import deque

class Lab6:
    
    def canFinish(self, numCourses, prerequisites):
        graph = [[] for _ in range(numCourses)]
        
        for course, prereq in prerequisites:
            graph[course].append(prereq)
        
        processed = 0
        queue_of_courses = deque()
        
        for i in range(numCourses):
            if not graph[i]:
                queue_of_courses.append(i)
        
        while queue_of_courses:
            curr = queue_of_courses.popleft()
            processed += 1
            
            for i in range(numCourses):
                if curr in graph[i]:
                    graph[i].remove(curr)
                    if not graph[i]:
                        queue_of_courses.append(i)
        
        return processed == numCourses


lab = Lab6()
array1 = [[1, 0], [0, 1]]
array2 = [[1, 0]]

print(lab.canFinish(3, array1))  
print(lab.canFinish(3, array2)) 

        
        
    

    