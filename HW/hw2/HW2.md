For the problem, the base algorithm used is a binary search using a start and end index. 
Using a while loop, we continue to find the middle of the input array and see if the value is bad. 
If it is, we need to check the value to the right and left to see if it is the first or not. 
If the value is bad but does not pass the previous case, then we make the end index mid -1 since we already checked the point we are already at. 
We know the point needs to be sometime before, so we made that point the new end index. 
Vice versa we would make the start index mid +1 if both conditions are not met. 
In the end, the binary search would end with the point satisfying the point after being bad and before being good. 
If not, the algorithm returns -1, which means there is no such point.
