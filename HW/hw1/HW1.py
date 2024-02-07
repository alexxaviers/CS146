'''
Created on Jan 30, 2024

@author: alexxavier
'''

def is_palindrome(w):
    
    wordsplit = list(w.lower())
    wordsplitrev = wordsplit[::-1]

    if(wordsplit == wordsplitrev):
        return True
    else:
        return False
    

print(is_palindrome('racecar'))
     




