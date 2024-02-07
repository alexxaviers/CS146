'''
Created on Feb 2, 2024

@author: alexxavier
'''



class HW2:
    def is_bad_version(self, x):
        if(x == 7 or x==8 or x==9 or x==10):
            return True
        else:
            return False
        
    def index_of_bad_version(self, x):
        start = 0;
        end = len(x)-1
        
        while(start <= end):
            mid = (start+end)//2

            if self.is_bad_version(x[mid]) and (mid == 0 or not self.is_bad_version(x[mid-1])):
                return mid
            elif self.is_bad_version(x[mid]):
                end = mid - 1
            else:
                start = mid + 1
        return -1
             
       
x = HW2()
versions = [1,2,3,4,5,6,7,8,9,10]
print(x.index_of_bad_version(versions))