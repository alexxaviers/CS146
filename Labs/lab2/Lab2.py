'''
Created on Jan 31, 2024

@author: alexxavier
'''
class Solution:
    def isAnagramSort(self, s: str, t: str):
        sorteds = sorted(s)
        sortedt = sorted(t)
    
        return sorteds == sortedt
    
    #def isAngramHash(self, s: str, t: str):
        
    
    
solution = Solution()
print(solution.isAnagramSort("dab", "bad"))    
 

    
    
    
