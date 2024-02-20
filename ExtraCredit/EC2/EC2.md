```
In class, we briefly discussed that Merge Sort was stable, and Quick Sort is unstable.
Why would this property be useful? Is there an issue if this property does not hold good for a sorting algorithm?
You can just type in your answer here, or choose to submit a GitHub link in case you want richer diagrams/ visualizations. 


A stable algorithm is useful because it means that if values are equal in the data set, they would not be swapped around.
When these elements swap around, it increases time complexity and the chance for errors, leading to unexpected behavior
in situations where stability is required. For instance, if you sort a list of objects with one iteration and then again,
but this time with an unstable sorting algorithm, the original order from the first iteration may not be preserved. 

```







