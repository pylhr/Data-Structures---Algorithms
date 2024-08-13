### Static Array
- A static array is a fixed length container containing n elements indexable from the range [0, n-1].
- Indexable means that each slot/position in the array is referenced with a number.
- In arrays, indexing always starts with 0 and as it is ***contiguous***,
continues with `currentIndex + 1` consecutively.

##### Applications of static arrays
-  Storing and accessing sequential data.
- For temporarily storing objects.
- Used as buffers by I/O routines.
- Lookup tables and inverse lookup tables.
- Used to return multiple values from a  function.
- In dynamic programming, arrays can be used to cache answers to subproblems.

##### Complexity Analysis

| Operations | Static Array | Dynamic Array |
| ---------- | ------------ | ------------- |
| Access     | O(1)         | O(1)          |
| Search     | O(n)         | O(n)          |
| Insertion  | N/A          | O(n)          |
| Appending  | N/A          | O(1)          |
| Deletion   | N/A          | O(n)          |

### Dynamic Array
- Dynamic arrays have flexible and resizable container, that is to say that they can shrink and grow in size.

##### Implementation of dynamic array
- Create a static array with an initial capacity.
- Add elements to the underlying static array till its capacity limit is reached.
- Then create an array twice the static array size and copy the contents of the original array to this array.
##### Applications of Dynamic Arrays
- **Flexible Storage**: They are used when the number of elements is not known in advance or may change over time.
- **Stack and Queue Implementations**: Dynamic arrays can serve as the underlying data structure for stack and queue implementations, where elements are added and removed frequently.
- **Array Lists**: In many programming languages, dynamic arrays are implemented as array lists (e.g., `ArrayList` in Java, `List` in Python) which provide dynamic resizing and additional functionality.
- **Caching**: Similar to static arrays, dynamic arrays can be used for caching where the size of the cache may vary.
- **Data Structures**: Dynamic arrays are foundational for various advanced data structures like hash tables, heaps, and certain types of priority queues.