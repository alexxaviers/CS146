```
Problem 1:
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {   (N+1)
            int key = arr[i];            (N)
            int j = i - 1;			   (N)
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) { (N+1)(N)
                arr[j + 1] = arr[j]; (N)(N)
                j = j - 1; (N)(N)
            }
            arr[j + 1] = key; (N)
        }
    }
```
For insertion sort, what is the 
Best Case 
Omega(N)
Average Case
Since the best and worst case are different we are not able to find the aevergae case. We can say the average case is equal to the worst case if necessary, so then in that case it would be theta(N^2).
Worst Case
O(N^2)
Time complexity? Show your reasoning and work. 
3n^2+5n+1 is the formula after adding all the values together. Since the highest degree of the polynomial is 2, the function is quadratic. Therefore insertion sort has a N^2 time complexity for the worst and average case. The best case is when the array is already sorted making the algorithm have an Omega(N) time complexity.  




Problem 2:
Below is the pseudocode to perform matrix multiplication that we discussed in HW3. 
MATRIX_MULTIPLY(A, B):
 if columns(A) ≠ rows(B):
   raise ValueError("Matrix multiplication is not defined.")
```
 rows_A ← number of rows in A
 cols_A ← number of columns in A
 cols_B ← number of columns in B
 result ← matrix of size rows_A x cols_B filled with zeros

 for i from 1 to rows_A do:   (N+1)
   for j from 1 to cols_B do:  (N+1)N
   sum ← 0
     for k from 1 to cols_A do:  (N+1)(N*N)
       sum ← sum + A[i][k] * B[k][j] (N*N*N)
     result[i][j] ← sum return result (N*N)
```
After adding up all the lines, the equation is 2n^3+3n^2+2n+1. The highest degree in the polynomial is 3, so this a is a cubic function. Therefore, this matrix multiplication algorithm is a cubic function. Since there are no shortcuts that exit out of the loops early, and since every element needs to be visited in the arrays, all cases should be n^3, giving the algorithm an n^3 time complexity. 

Best case: Omega(n^3)
Worst case: O(n^3)
Average Case: Tetha(n^3)





