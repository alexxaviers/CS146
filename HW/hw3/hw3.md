MATRIX_MULTIPLY(A, B):
 if columns(A) ≠ rows(B):
   raise ValueError("Matrix multiplication is not defined.")

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

Best case: Omega(n^3)
Worst case: O(n^3)
Average Case: Tetha(n^3)
