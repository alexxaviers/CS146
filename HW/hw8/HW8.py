'''
Created on Feb 28, 2024

@author: alexxavier
'''

class HW6:
    def longestPalindrome(self, s):
        char_counts = {}
        total = 0
        largest_odd = 0

        for char in s:
            if char not in char_counts:
                char_counts[char] = 1
            else:
                char_counts[char] += 1

        for count in char_counts.values():
            if count % 2 == 0:
                total += count

            if count % 2 != 0 and count > largest_odd:
                largest_odd = count

        return total + largest_odd
    
    

hw6 = HW6()
result = hw6.longestPalindrome("abccccdd")
print(result)
