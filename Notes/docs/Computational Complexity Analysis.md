
##  Complexity Analysis

- Computational complexity analysis is a theoretical assessment that measures the computational resources required by an algorithm to solve a computational problem.
- It provides a quantitative understanding of the speed and spacing requirements of the operations, enabling informed decisions when writing code.

### Key Concepts

- **Time Complexity**: Measures the amount of time an algorithm takes to complete, typically expressed as a function of the input size (n).
- **Space Complexity**: Measures the amount of memory an algorithm requires, also expressed as a function of the input size (n).
- **Big-O Notation**: A shorthand way to describe the upper bound of an algorithm’s time or space complexity, often used to classify algorithms into categories (e.g., O(1), O(log n), O(n), O(n log n), etc.).

#### Big-O Notation

- Big-O notation gives an upper bound of the complexity in the worst case, helping to quantify performance as the input size becomes arbitrarily large.
- The size of input is represented by 'n'.

Complexities ordered from smallest to largest

| Complexity        | Notation      |
| ----------------- | ------------- |
| Constant Time     | O(1)          |
| Logarithmic Time  | O(log(n))     |
| Linear Time       | O(n)          |
| Linearithmic Time | O(nlog(n))    |
| Quadratic Time    | O(n^2)        |
| Cubic Time        | O(n^3)        |
| Exponential Time  | O(b^n), b > 1 |
| Factorial Time    | O(n!)         |

#### Properties of Big-O

- Big O really cares about when the input is reaching almost infinity, so in a expression input size with highest order of degree will be considered, as only it will be having substantial impact on the running time of the algorithm.

1. O(n + c) = O(n)
2. O(nc) = O(n), c> 0

- Let f be a function, describing running time of a particular algorithm and input size be n:
  f(n) = 7log(n^3) + 15(n^2) + 2(n ^ 3) + 8
  Therefore, O(f(n)) = O(n^3)

- Examples of Big O time complexities :
	- Binary Search - O(log(n))
	- Finding all subsets of a set - O(n^2)
	- Finding all permutations of a string - O(n!)
	- Sorting using mergesort - O(nlog(n))
	- Iterating over all the cells in a matrix of size n by m - O(nm)