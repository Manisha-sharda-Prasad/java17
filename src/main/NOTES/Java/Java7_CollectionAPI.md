##  Array
An array is a data structure that holds a fixed number of values of a single type.
- Fixed Size: fixed size defined at the time of creation
- Type-Safe: Arrays are type-safe and can store only elements of a specified type
- Syntax:  use square brackets for declaration
- Performance: more performant
- Primitive Types: store primitive types ( int, char), which is not possible with ArrayList(Wrapper)
- lacks flexibility in size and built-in methods


### List
Interface: An ordered collection (sequence) contain duplicate elements.
- Implementations: ArrayList, LinkedList.
  - LinkedList
  - ArrayList
- Comparator
- Comparable
- ListIterator vs Iterator


### ArrayList
Implementation: Implements the List interface using a dynamic array
- Dynamic Size: Java Collections Framework ,dynamically grow/shrink as elements added/ removed.
- Generic:  generic class and can hold objects of any type.
- Methods:  methods for manipulating the list, such as add(), remove(), get(), size()
- Boxing and Unboxing: primitive types automatically boxed(wrapped) into their wrapper classes.
- Access Time: O(1) - Fast random access.



### LinkedList
Implementation: Implements the List interface using a doubly linked list.
- Use when you need to perform frequent insertions/deletions, especially at the beginning or middle of the list.
- Access Time: O(n) - Slow traversal.

### iterator

---
## Java collections

### Map
- Interface: A collection that maps keys to values, with no duplicate keys allowed.
- Key Features: Each key can map to at most one value. Keys are unique.
- Implementations: HashMap, TreeMap, LinkedHashMap.

####  HashMap
- Implementation: Implements the Map interface using a hash table.
- Performance: Fast look-ups.
- Use Case: Use when you need fast access to key-value pairs and ordering is not important.

### Set
- Interface: A collection that contains no duplicate elements.
- Key Features: No duplicate elements allowed, used for unique elements.
- Implementations: HashSet, TreeSet, LinkedHashSet.

#### HashSet
- Implementation: Implements the Set interface using a hash table.
- Performance:Fast look-ups.
- Use Case: Use when need a collection of unique elements and ordering is not important.


---

