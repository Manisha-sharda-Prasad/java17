package com.manisha.java.Streams;

import com.manisha.java.util.Print;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args)
    {
        intermediate();
        terminal();
    }
//-------------------------------------------TERMINAL-OPERATION---------------------------------------------------------s
    static  void terminal()
    {
        // T1. forOrdered
        // T2. forEachOrdered - same as above.
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,6);
        List<String> words = Arrays.asList("one","two", "three","four", "five","six", "seven","eight");

        // T3. count : Long
        Stream<String> stream1 = words.stream();
        Long size = stream1.count();
                            Print.print(size);

        // T4.1 toArray() : []
        Object[] array = words.stream()
                              .toArray();
                         Print.print(Arrays.toString(array));

        // T4.2 toArray(IntFunction) : []
        String[] arrStr = words.stream()
                               .toArray(String[] :: new);
                          Print.print(Arrays.toString(arrStr));

        // T5.1 reduce()
        Optional<Integer> sum = number.stream()
                                      .reduce((i, agg)-> i+agg);
                                 Print.print(sum.get());

        // T5.2 reduce(...)
        int subtract = number.stream()
                             .reduce(0, (i,agg) -> i-agg );
                        Print.print(subtract);

        // T6. collect(Collectors.*)
        // Collectors --> toList(), toSet(), toMap()
        List <Integer> toList = number.stream()
                .collect(Collectors.toList());
           Print.print(toList);

        Set<Integer> toSet = number.stream()
                .collect(Collectors.toSet());
        Print.print(toSet);

        Map<Integer, Integer> toMap = number.stream()
                .collect(Collectors.toMap((i)-> i,(i)-> i, (old,nw)->old+nw));
        Print.print(toMap);


        // 7. min(),max() : long
        Optional <Integer> result = number.stream()
                                            //.min((i, i2)-> i.compareTo(i2));
                                            .max((i, i2)-> i.compareTo(i2));
                                       Print.print(result.get());

        // 8. anyMatch, allMatch, noneMatch : Boolean
        //number = Arrays.asList(2,4,1,8,5);
        boolean anyOdd = number.stream()
                               .noneMatch(  i -> i % 3 == 0 ); //similar- (anyMatch, allMatch)
                          Print.print(anyOdd);


        // 9. findAny(), findFirst() : T
        Print.print(number.stream().findFirst()); //similar syntax- (findAny)

    }

//-------------------------------------------INTERMEDIATE-OPERATION-----------------------------------------------------

    static void intermediate()
    {
        // list of int --
        List<Integer> num = Arrays.asList(3,2,3,4,9,6,8,12,11,12,6);

        // int (primitive type)         <--> Auto-boxing    <--> Integer
        // IntStream( Primitive stream) <-->   boxed()      <--> Stream<Integer>

        Stream<Integer> myIntStream_generic = num.stream();
        IntStream       myIntStream_primitive = IntStream.of(3,2,3,4,9,6,8,12,11,12,6);

        //1. Intermediate Operations: --
        List<Integer> processesNum = num.stream()
                .filter( n -> n % 3 == 0 ) //3,9,6,12.. /Predicate
                .map( n -> n + n)          //6,12,18,24 /Function
                .sorted()
                .distinct()
                .collect(Collectors.toList()); //collect-results//Terminal

        //2. Terminal Operations: --
        processesNum.forEach(System.out::println);


        // list of String --
        List<String> characters = Arrays.asList("phone", "tablet", "computer", "laptop", "mouse" , "pen");
        characters.stream()
                .limit(characters.size()-1)                     //long
                .map ((i)-> { return i.toUpperCase()+"*";})             //function
                .sorted((i1,i2) -> {return 0;})                         //comparator
                .forEach((i)-> { System.out.println(i);});


        //List of String --
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );

        nestedList.stream()
                .flatMap((list)->  list.stream())                          //Function /FlatMap-
                //.peek((List) -> {System.out.println(List);})
                .skip(2)                                               //a,b skipped
                .sorted(Comparator.reverseOrder())                       //f,e,d,c
                .forEach((list) -> System.out.println(list));            //c,d,e....

        List<String> words = Arrays.asList("one","two", "three","four", "five","six", "seven","eight");


        words.stream()
                .mapToInt((i)-> i.length())
                .forEach((i) ->System.out.printf("%s, ", i));
    }
}
// Streams-- Process sequence of elements(like collection) in a functional style - readable/ concise /parallel process.

//1.) Source: Obtain stream from a data source. (stream)

//2.) Intermediate Operations:  Chain one or more intermediate operations to transform the stream.
    //(Filter, map, sorted, distinct)

//3.) Terminal Operation:  Apply a terminal operation to produce a result or a side effect.
    //(collect, forEach, reduce, count).

//4.) Functional Interfaces--
    //a.Predicates-- takes value of 1 arg, returns boolean./ BiPredicates--takes 2,return 1 / IntPre/ LongPre/ DoublePre.
    //b.Functions-- takes 1 arg , returns 1 result./ BiFunction/ UnaryOperator/ BinaryOperator.
    //c.Consumers-- takes 1 arg , returns nothing./ BiConsumer.
    //d.Suppliers-- takes no arg, returns result.

//FlatMap--Transforms each element into a stream, and put resulting streams into a single stream.
