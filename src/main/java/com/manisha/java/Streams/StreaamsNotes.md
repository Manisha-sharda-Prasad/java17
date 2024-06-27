**Stream** -- 
- Sequence of elements that supports operations, for processing data . 
- Data Flowing in packets.
- They allow us to  quickly perform bulk operations on them at one time,(Intermediate, Terminal operations)  
- It doesn't get stored in memory after processing.

**Stream processing** --
Perform operations on data in a clear and readable way.
Introduced in Java 8 ,allows you to process sequences of elements (like collections),

1.)Source:-----
Obtain from a data source.

2.)Intermediate Operations:----
It transforms a stream into another stream ->( Chained Operations ),
lastly evoked with terminal operations.

- filter(Predicate): Filters on a condition.
- map(Function): Transforms element.
- sorted(): Takes comparator
- distinct(): Removes duplicates.
- limit(long n): Limits the stream.
- skip(long n)
- flatMap()

3.)Terminal Operations:----
Collects bulk  intermediate Operation and presents/shows/produce the final result, or a side effect, 
they trigger the processing of stream pipeline.

- min(),max():            Comparator
- count():                Returns the number of elements.
- collect(Collector):     Converts the stream into a collection or another form.
- forEach(Consumer):      Performs an action for each element.
- reduce(BinaryOperator): Combines elements to produce a single result.
- findFirst():            Finds the first element.
- anyMatch(Predicate)    Checks if any elements match the condition.
- allMatch()
- noneMatch() 


**lambda expression** -- 
Function without a name, and Clear, Concise way to represent an anonymous function .   
A way to implement instances of functional interfaces.

**Functional interfaces** --
Interfaces with single abstract method, used for lambda expression or method reference. Main categories:

a.) Predicates: Boolean-valued function of 1 arg.
- Predicate<T>: Takes 1 arg, returns boolean.
- BiPredicate<T, U>: Takes 2 arg, returns boolean.

b.) Functions: Function that produces a result.
- Function<T, R>: Takes 1 arg, a returns  result.
- BiFunction<T, U, R>: Takes 2 arg, returns  result.
- UnaryOperator<T>:  operand and result are of the same type.
- BinaryOperator<T>:  BiFunctions where operands, result are of same type.

c.) Consumers: operation that accepts a single input arg, returns no result.
- Consumer<T>:  1 arg, no result.
- BiConsumer<T, U>: 2 arg, no result.

d.)Suppliers: Functional interfaces that represent a supplier of results.
- Supplier<T>: no args , returns result.

https://www.geeksforgeeks.org/stream-in-java/?ref=header_search
