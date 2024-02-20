```

1.
T(N) = 2T(N-1) + 1
a = 2
b = 1
f(n) = 1
k = 0
Case 3: a > 1
master theorem decreasing, so O(n^0  * 2^(1/1))
solved recurrence relation T(n)= O((2^n) -1)


T(N) = 3T(N-1) + n
a = 3
b = 1
f(n) = n
k = 1
Case 3: a > 1
recurrence relation - T(n) = O(n^1 * 3^(n/1)) 
T(n) = n^3


T(N) = 9T(N/2) + n2
a = 9
b = 2
f(n) = n^2
We will use the master theorem for divide/conquer 
f(n) = O(n^log2(9)-e ) where e > 0, so T(n) = Θ(n^log2(9))
f(n) = Θ(n^log2(9) log^k(n) where k >= 0 then T(n) = Θ(n log2(9) log^k+1(n))
f(n) = Ω(n log2(9) + e) where e > 0 then T(n) = Θ(n^2)
The recurrence relation matches, so it holds true.


T(N) = 100T(N/2) + nlog2cn + 1  (c = constant)
a = 100
b = 2
f(n) = n * log2(cn+1)
We will use the master theorem for divide/conquer 
f(n) = O(n^log2(100) - e) where e > 0 then T(n) = Θ(n^log2(100) )
f(n) = Θ(n^log2(100) log^k(n) where k >= 0 then T(n) = Θ(n log2(100) log^k+1(n))
f(n) = Ω(n log2(100) + e ) where e > 0 then T(n) = Θ(nlog2cn + 1)
The recurrence relation matches, so it holds true.


T(N) = 4T(N/2) + n2logn
a = 4
b = 2
f(n) + n^2log(n)
f(n) = O(n^2 - e ) where e > 0 then T(n) = Θ(n^2 )
f(n) = Θ(n^2 log^k(n) where k >= 0 then T(n) = Θ(n 2 log^k+1(n))
f(n) = Ω(n^(2 + e)) where e > 0 then T(n) = Θ(n2logn)
The recurrence relation matches, so it holds true.


T(N) = 5T(N/2) + n2/logn
a = 5
b = 2
f(n) = n2/logn
f(n) = O(n^log2(5) - e ) where e > 0 then T(n) = Θ(n^log2(5) )
f(n) = Θ(n^log2(5) log^k(n) where k >= 0 then T(n) = Θ(n log2(5) log^k+1(n))
f(n) = Ω(n log2(5) + e ) where e > 0 then T(n) = Θ(n2/logn)
The recurrence relation matches, so it holds true.


2.
yetAnotherFunc(n): 
  if n > 1: 
    for(i=0;i<10n;i++)   10n + 1
      doSomething;       10n
    yetAnotherFunc(n/2); f(n/2)
    yetAnotherFunc(n/2); f(n/2)

f(n) = 2f(n/2) + 20n + 1
a = 2
b = 2
f(n) = 20n + 1

We will use the master theorem for divide/conquer 
f(n) = O(n^(1-e)) where e > 0 then T(n) = Θ(n)
2f(n) = Θ(n log k n) where k >= 0 then T(n) = Θ(n log k + 1 n)
f(n) = Ω(n 1 + e) where e > 0 then T(n) = Θ(20n + 1)


```











