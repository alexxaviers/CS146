'''
Created on Jan 30, 2024

@author: alexxavier
'''


def two_sum(arr, target):
    dict = {};
    for i, num in enumerate(arr):
        compliment = target - num 
        if compliment in dict:
            print("Found")
            return (i, dict[compliment])
        else:
            dict[arr[i]] = i 
            
        
        
    
list = [4,7,6,5]
target = 13
print(two_sum(list, target))
    




