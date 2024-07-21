# Streams in java8

## Intro
  - `Sequence of elements` that supports `Operations`, for `Processing Data` . 
  - `Data Flowing in packets`.
  - They allow us to  quickly perform `Bulk Operations` on them at one time,`(Intermediate, Terminal)`  
  - It `doesn't` get `stored in memory` after processing.
  - Consider a stream like a `flow` of water in a small canal. 
 

---
## Stream processing `(Operations on elements)`:
- Perform operations on data in a `clear` and `readable way`.
- Introduced in `Java 8` ,allows you to process sequences of elements (like collections),

`1. Creating a Stream`: 
- Streams can be created from various `data-sources` like `collections | arrays | I/O channels`.

`2. Intermediate Operations`:
- `Transform` a `stream` into `another stream`.
- Methods are chained together(`Chained Operations`).
- one method perform operation in data,
- `passes` it to `another method`.
- Lastly it is `evoked` with `terminal` operations.
- `Lazy`, they are not executed until a `Terminal operation` is `invoked.`
- eg:
  - `filter`(Predicate): Filters on a condition.
  - `map`(Function): Transforms element.
  - `sorted`(): Takes comparator
  - `peek`(): peek result in middle of the operations
  - `distinct`(): Removes duplicates.
  - `limit`(long n): Limits the stream.
  - `skip`(long n)
  - `flatMap`(Function)
  - `takeWhile`(Predicate): 
  - `dropWhile`(Predicate):

`3. Terminal Operations`:
-  Produce a result
- `Collects bulk intermediate` Operation 
- `Presents`/`produce` the `final result`/`side effect`, 
- `Trigger` the processing of stream pipeline.
- Methods on a stream that will cause a stream to be “`closed`”
- eg:
  - `min(),max()`:            Comparator
  - `count`():                Returns the number of elements.
  - `collect`(Collector):     Converts the stream into a collection or another form.
  - `forEach`(Consumer):      Performs an action for each element.
  - `reduce`(BinaryOperator): Combines elements to produce a single result.
  - `findFirst`():            Finds the first element.
  - `anyMatch`(Predicate)     Checks if any elements match the condition.
  - `allMatch`()
  - `noneMatch`() 
---
Input--> Intermediate {{operation1--> operation2-->}}-->Terminal {{Final operation 3}} --->Output

---
## Functional Style programming :
`1. Lambda Expression`:
- Function without a name, 
- Clear, Concise way to `represent` an `anonymous function` .   
- A way to `implement instances` of `functional interfaces`.

`2. Method Reference`:
- A way to implement instances of functional interfaces.


`3. Functional Interfaces`:
- Interfaces with `single abstract` method, 
- used for `lambda expression` or` method reference`. Main categories:-

  a. `Predicates`: `Boolean-valued` function of `1 arg`.
  ```
  Predicate<Integer> isEven = n -> n % 2 == 0;
  System.out.println(isEven.test(4)); // Output: true
  ```
    - Predicate<T>: Takes `1 arg`, returns `boolean`.
    - BiPredicate<T, U>: Takes` 2 arg`, returns `boolean`.

  b. `Functions`: Function that `produces a result`.
  ```
  Function<String, Integer> stringLength = s -> s.length();
  System.out.println(stringLength.apply("hello")); // Output: 5
  ```
    - Function<T, R>: Takes `1 arg`, a returns  `result`.
    - BiFunction<T, U, R>: Takes `2 arg`, returns  `result`.
    - UnaryOperator<T>:  operand and result are of the same type.
    - BinaryOperator<T>:  BiFunctions where operands, result are of same type.

  c. `Consumers`: operation that `accepts` a `single-input arg`, returns `no-result`.
  ```
  Supplier<String> supplyString = () -> "hello";
  System.out.println(supplyString.get()); // Output: hello
  ```
    - Consumer<T>:  `1 arg`, `no` result.
    - BiConsumer<T, U>: `2 arg`, `no` result.

  d. `Suppliers`: Functional interfaces that represent a supplier of results.
  ```
  Supplier<String> supplyString = () -> "hello";
  System.out.println(supplyString.get()); // Output: hello
  ```
    - Supplier<T>:` no args` , returns `result`.

## Collect Methods  `(.collect(Collectors.methods)` :
- `counting`(): Counts number of `elements` in stream.
- `summingInt`(mapper): Sums elements using mapper function,`extracts integer` values.
- `averagingInt`(mapper): Calculates average of the elements. 
- `joining`(delimiter): `Concatenates` elements into a `single string`,separated-`delimiter(,+:?)`.
- `toList`(): Collects elements- `List`.
-  `toSet`(): Collects elements- `Set`.
-  `toMap`(keyMapper, valueMapper): Collects elements- `Map`.
-  `groupingBy`(classifier): Groups elements by a `classifier function`.
-  `partitioningBy`(predicate): Partitions elements based on a `predicate`.
-  `collectingAndThen`(collector, finisher): Performs an `additional finishing` transformation `after collecting`.

---
### Thread-Safe Collection VS. Fast Collection : 
- `Speed / Commonly used (HashMap, HashSet, and ArrayList)`
- `Thread Safe /Less used (TreeSet,TreeMap,LinkedHashSet,LinkedHashMap,LinkedList)`

- `HashMap, HashSet, ArrayList` :

  - `Fast` access, `insertion`, and `deletion` operations `(O(1)`.
  - Ideal for `quick look-ups` and modifications are required.
  - frequently accessing elements by `index`.
  - not Sorted, use method- `sorted()`
  - prioritize HashMap, HashSet, ArrayList for their `speed` in typical use cases.
  
  
- `TreeSet,TreeMap, LinkedList, LinkedHashSet, LinkedHashMap, Vector, Stack`:

  - Maintain `insertion order`, used when insertion is important
  - sorts while adding new, `keeps shuffling`.
  - `Slower` than HashSet and HashMap due to maintaining list.
  - with O(1) insertions and deletions.
  - chosen based on specific needs such as sorted order, insertion order, or specific data access patterns.
  - `Vector, Stack,` and `synchronized versions` of other collections (e.g., `Collections.synchronizedList`)
  - `Thread safety` is managed using specialized `concurrent` collection / explicit `synchronization` when necessary, 
  -  balancing safety and performance.

  
---
## references:
- https://www.geeksforgeeks.org/stream-in-java/?ref=header_search
