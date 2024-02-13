'''
Created on Feb 9, 2024

@author: alexxavier
'''
class Fibonacci:
    
    def find_nth_num(self,n):
        list = [0,1]       
        point = 0
        
        while(point<n):
            list.append(list[point] + list[point + 1])
            point+=1
        
        return list[point]
    
test = Fibonacci()
print(test.find_nth_num(13))
    
    
        
        
