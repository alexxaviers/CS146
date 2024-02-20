```

Problem 1:
Let's compare some basic math functions to refresh our memory. For each of the following, just write which function is asymptotically greater (So, you should be thinking about your asymptotic notations!). Show your reasoning for the same.
n^3 is bigger because it has a higher degree, and the constant does not matter.
n^2log(n) is bigger because it has a higher degree.
2^root n is bigger because the root n function grows faster than log n.
2^2n is bigger because 2n is the higher degree.



Problem 2:
Now let's examine some [pseudo]code and apply asymptotic notation to it. 
isPrime(n):
 for(i = 2, i*i <= n; i++) {
   if(n % i == 0) {
     return false
   }
 return true

What is the 
Best Case - O(1) any even number
Worst Case - If the number is prime Omega(sqrt(n))
Average Case - number is composite Theta(sqrt(n)
Time complexity for the above function? 
The time complexity of the code segment above, on average, is O(sqrt (n)). 

```
