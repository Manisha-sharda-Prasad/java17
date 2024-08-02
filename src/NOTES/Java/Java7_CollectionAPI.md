#  A. Array :
An array is a data structure that holds a fixed number of values of a single data type.
- Fixed Size: fixed size defined at the time of creation
- Type-Safe: Arrays are type-safe and can store only elements of a specified type
- Syntax:  use square brackets for declaration
- Performance: more performant
- Primitive Types: store primitive types (int,char) which is not possible with ArrayList(Wrapper)
- lacks flexibility in size and built-in methods
- length(), clone(), Arrays.toString(),
- Utility class : `java.util.Arrays`
  - utility class,provides variety of `static methods` to manipulate arrays.
  - `sort`(), `binarySearch`()
  - equals(), toString()
  - `copyOf`(), 
  - `asList`(arr1) : Converts array into List

---

# B. Collection :
A group of  `objects` that represent a single `entity` is known as a collection.
- Common : `List`, `Map`, `Set`
- less common : `Queue`, `DeQue`
- Utility class : `java.util.Collections`
  - provides variety of `static methods` to manipulate Collection(List,set,Map).
  - utility methods:
    - `sort`() :
    - `binarySearch`(): returns index of searched item.
- Iteration on collection(List,Set)
  - `ListIterator` : extends Iterator,
    - (`Backwards)` `HasPrevious, previous`,
    - (`Forwards`)`HasNext, next` methods,
  - `Iterator`     :  traverse any collection (List, Set), Forwards (`HasNext), next` methods
    - Methods :  
      - `hasNext():` Returns `true`,if iteration has more elements.
      - `next():` Returns `next`, element in iteration.
      - `remove():` Removes `last`, element returned by iterator.


## 1. List < T> :
- `Ordered` collection (sequence),  `duplicate elements`, `insertion order`.
- `Interface`: 
  - `Abstract method` - `add(), get(), remove(), size(), contains()`
  - `Generic interface` - can hold objects of any `type T`

- Implementations classes: 
  - `ArrayList` - general purpose, fast-get(index)::O(1)
  - `LinkedList`  
  - vector, stack(LIFO) - slow, rare
- Sorting list:
  - `Collections.sort`(list, `Comparator`);
  - Collections.sort(list); // Comparable /natural-order)

  
### 1.1. ArrayList < T >
- `Dynamic Size`: dynamically `grow/shrink` as elements `added/removed`.
-  `Duplicates`, maintains `insertion order`.
- Access Time: `O(1)` - `Fast random access`.
- Internal structure: [ 1,2,3,new-item,4,5,...]
- `limitation` : insert New-Item in middle is slow.
- Override methods: `add`(), `remove`(), `get`(index), `size`(), `sort`(Comparator)
- Boxing and Unboxing: primitive types automatically boxed(wrapped) into their wrapper classes.
  ```
  arr1 = int[]{1,2,3,4,4}
  list1 = Arrays.asList(arr1) // int[] <---> List<Integer> 
  ```

### 1.2. LinkedList < T > 
- `Implements List, DeQue(FIFO))`
- Internal structure: `doubly linked list`
  - 0[ node1 ] <--> 1[ node2 ] <--> 2[ node-new-item ] <--> 3[ node3 ] <--> n[ nodeN ] ...
  - Access Time: O(n) - Slow traversal.
  - Insert Time: Inserting new item in Middle is FAST.
- Use for frequent insertions/deletions, especially at the beginning or middle of the list.
- methods :
  - from `List` : add(e)
  - from `Deque` :
    - addFirst(e), addLast(e), 
    - removeFirst(),removeLast()
    - getFirst(),getLast()

---
## 2. Set < T > :
- `Unique elements`, `no duplicates`.
- Implementations: HashSet, TreeSet, LinkedHashSet.
- `add(),remove(),contains(), size()`

### 2.1. HashSet < T >
- `Fast access`, `unordered`, does not maintain order
- `No duplicates`, Use for `unique collections`
- The objects are inserted based on their `hash code`.


## 3. Map < K,V >
- `Key-value` pairs, Maps keys to values.
- `unique- keys`, no`duplicate-Keys` allowed.
- Implementations: `HashMap`, `TreeMap`, `LinkedHashMap`.
- `Put(),get(),remove(),containsKey(),keySet()`

###  3.1. HashMap < K,V >
- `Fast access`, `unordered`. Use for `quick look-ups`.
- To access value in HashMap, must know its key.
- Implementation of the Map interface of Java.

---
## 4.Comparable and Comparator :
interfaces are used to order objects in collections such as lists or arrays.

### 4.1. Comparable
- Uses the `compareTo` method.
- Class implement `Comparable` interface and `override` the `compareTo` method.
- Used for `natural ordering`. 
- Implemented `within class`
- `Collections.sort` is called, it `sorts` list of Class.


### 4.2. Comparator
- uses the `compare` method.
- Class implements `Comparator` interface and `override` the `compare` method.
- Used for `custom ordering`. 
- Implemented as a `separate`/`anonymous class`
- `Collections.sort` 

---
## 5. Queue & Deque:
- `Queue`:
  - `FIFO`: First-In-First-Out order (typically).
  - eg: `LinkedList, PriorityQueue`.

- `Deque`:
  -`Double-Ended`: Allows `insertion` and `removal` from `both ends`.
  -eg: `ArrayDeque, LinkedList.`
---
NOTES -
https://chatgpt.com/c/f5946a4e-627c-4f0f-acc2-0462e91bb45e