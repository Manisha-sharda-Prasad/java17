**Stream processing**--
Introduced in Java 8 ,allows you to process sequences of elements (like collections),
perform operations on data in a clear and readable way.


1.)Creating a Stream -Source :
Obtain from a data source.

2.)Intermediate Operations :
It transforms a stream into another stream ->(Chained Operations), evoked with terminal operations in last.

3.)Terminal Operations :
Produce a result or a side effect, they trigger the processing of  stream pipeline.


1.)Source:-----
-stream(): Creates a stream from a collection.

2.)Intermediate Operations:----

-filter(Predicate): Filters on a condition.
-map(Function): Transforms element.
-sorted():
-distinct(): Removes duplicates.
-limit(long n): Limits the stream.
-skip(long n):

3.)Terminal Operations:----

-collect(Collector): Converts the stream into a collection or another form.
-forEach(Consumer): Performs an action for each element.
-reduce(BinaryOperator): Combines elements to produce a single result.
-count(): Returns the number of elements.
-findFirst(): Finds the first element.
-anyMatch(Predicate): Checks if any elements match the condition.


**lambda expression**-- is a concise way to represent an anonymous function (a function without a name).   
Clear and concise way to implement instances of functional interfaces.


**Functional interfaces**--
Interfaces with single abstract method, used for lambda expression or method reference. Main categories:-

a.) Predicates-- takes value of 1 arg, returns boolean./ BiPredicates--takes 2,return 1 / IntPre/ LongPre/ DoublePre.
b.) Functions-- takes 1 arg , returns 1 result./ BiFunction/ UnaryOperator/ BinaryOperator.
c.) Consumers-- takes 1 arg , returns nothing./ BiConsumer.
d.) Suppliers-- takes no arg, returns result.



a.) Predicates: Boolean-valued function of 1 arg.
-Predicate<T>: Takes 1 arg, returns boolean.
-BiPredicate<T, U>: Takes 2 arg, returns boolean.

b.) Functions: Function that produces a result.
Function<T, R>: Takes 1 arg, a returns  result.
BiFunction<T, U, R>: Takes 2 arg, returns  result.
UnaryOperator<T>:  operand and result are of the same type.
BinaryOperator<T>:  BiFunctions where operands, result are of same type.

c.) Consumers: operation that accepts a single input arg, returns no result.
Consumer<T>: Takes 1 arg, returns no result.
BiConsumer<T, U>: Takes 2 arg, returns no result.

d.)Suppliers: Functional interfaces that represent a supplier of results.
Supplier<T>: Takes no args , returns result.
