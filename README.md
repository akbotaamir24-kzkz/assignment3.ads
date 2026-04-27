# Sorting and Searching Algorithm Analysis

## Project Overview

In this project, I implemented and compared different sorting and searching algorithms in Java. The goal was not only to write the code, but also to understand how these algorithms behave when the input size increases.

I selected:
- Bubble Sort (basic)
- Merge Sort (advanced)
- Linear Search

I tested them on arrays of size 10, 100, and 1000. All arrays were generated randomly in the program.

---

## Selected Algorithms

## Bubble Sort

Bubble Sort is a simple sorting algorithm. It works by comparing two neighboring elements in an array. If the elements are in the wrong order, the algorithm swaps them.

For example:

8 3 → 3 8

This process repeats until the array becomes sorted.

In my understanding, Bubble Sort is very easy to implement, but it is not efficient. It keeps checking elements many times even when it is not necessary.

Time Complexity: O(n²)

---

## Merge Sort

Merge Sort is an advanced sorting algorithm. It works using the divide and conquer approach.

This means:
- first, the array is split into smaller parts
- then each part is sorted
- finally, the parts are merged back together

Example:

8 3 5 1  
→ split → 8 3 | 5 1  
→ split → 8 | 3 | 5 | 1  
→ merge → 3 8 | 1 5  
→ final → 1 3 5 8

In my code, Merge Sort was harder to understand at first because it uses recursion. But after writing it step by step, I understood how dividing and merging works.

Time Complexity: O(n log n)

---

## Linear Search

Linear Search checks each element one by one until it finds the target.

Example:

4 7 2 9 → target = 2 → found

It is simple and works on any array, but it is not the fastest for large data.

Time Complexity: O(n)

---

## Results

| Size | Bubble Sort | Merge Sort | Linear Search |
|------|------------|-----------|--------------|
| 10   | 9900 ns    | 16200 ns  | 3200 ns      |
| 100  | 587000 ns  | 141200 ns | 3100 ns      |
| 1000 | 3368600 ns | 842300 ns | 10700 ns     |

---

## Analysis

For small arrays (size 10), Bubble Sort was faster than Merge Sort. This happens because Merge Sort has extra operations like recursion and splitting the array, which makes it slower for very small inputs.

However, when the size increases, Merge Sort becomes much faster. For example, for 1000 elements, Bubble Sort took 3368600 ns, while Merge Sort took 842300 ns. This shows that Merge Sort is more efficient for large arrays.

The reason is in time complexity. Bubble Sort has O(n²), so the number of operations increases very quickly when the array grows. Merge Sort has O(n log n), so it grows much slower.

Linear Search works fine for small arrays, but for large arrays it becomes slower because it checks each element one by one.

The results match the theoretical expectations from Big-O notation. Bubble Sort becomes very slow, Merge Sort performs better, and Linear Search depends directly on the number of elements.

Binary Search would be faster than Linear Search, but it requires the array to be sorted. It works by checking the middle element and dividing the search area in half. This only works if the array is ordered.

---

## Screenshot

![Program Output](docs/screenshots/result.png)

---

## Reflection

In this project, I understood that writing an algorithm is not enough. It is important to test it and see how it behaves with real data.

Bubble Sort was easy to understand, but I saw that it becomes very slow when the array size increases.

Merge Sort was more difficult because of recursion, but it performs much better for large arrays.

Linear Search was simple, but it is not the most efficient method for searching in large datasets.

The most useful part for me was seeing how theoretical complexity (Big-O) actually affects real execution time.

---

## Conclusion

This project showed that the choice of algorithm is very important.

Bubble Sort is simple but inefficient for large data. Merge Sort is more complex but much faster. Linear Search is easy to use but not optimal for large arrays.

Overall, the experiment confirmed that algorithms with better complexity perform better when the input size increases.