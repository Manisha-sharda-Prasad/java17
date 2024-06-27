##  Array
An array is a data structure that holds a fixed number of values of a single type.
- Fixed Size: fixed size defined at the time of creation
- Type-Safe: Arrays are type-safe and can store only elements of a specified type
- Syntax:  use square brackets for declaration
- Performance: more performant
- Primitive Types: store primitive types ( int, char), which is not possible with ArrayList(Wrapper)
- lacks flexibility in size and built-in methods
- length(), clone(), Arrays.toString(),

### java.util.Arrays 
- utility class in the Java Standard Library , provides variety of static methods to manipulate arrays. 
- Methods include operations - sorting, searching, comparing, and converting arrays to strings.
- sort(), binarySearch(), equals(), toString(), copyOf().

### List
Interface: An ordered collection (sequence) contain duplicate elements.
- Implementations: ArrayList, LinkedList.
  - LinkedList
  - ArrayList
- Comparator
- Comparable
- ListIterator vs Iterator
- - add(), get(), remove(), size(), contains()


### ArrayList
Implementation: Implements the List interface using a dynamic array
- Dynamic Size: Java Collections Framework ,dynamically grow/shrink as elements added/ removed.
- Generic:  generic class and can hold objects of any type.
- Methods:  methods for manipulating the list, such as add(), remove(), get(), size()
- Boxing and Unboxing: primitive types automatically boxed(wrapped) into their wrapper classes.
- Access Time: O(1) - Fast random access.
- add(), get(), remove(), size()



### LinkedList
Implementation: Implements the List interface using a doubly linked list.
- Use when you need to perform frequent insertions/deletions, especially at the beginning or middle of the list.
- Access Time: O(n) - Slow traversal.
- addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getLast()

### iterator

---
## Java collections

### Map
- Key-value pairs, unique keys.
- Maps keys to values, with no duplicate keys allowed.
- Implementations: HashMap, TreeMap, LinkedHashMap.
- put(),get(),remove(),containsKey(),keySet()

####  HashMap
- Fast access, unordered. Use for quick look-ups.

### Set
- Unique elements, no duplicates.
- Implementations: HashSet, TreeSet, LinkedHashSet.
- add(),remove(),contains(), size()

#### HashSet
- Fast access, unordered. Use for unique collections.



---

