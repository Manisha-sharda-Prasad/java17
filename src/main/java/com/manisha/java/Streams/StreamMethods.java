package com.manisha.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        // list of int --
        List<Integer> num = Arrays.asList(3,2,3,4,9,6,8,12,11,12,6);

        // Intermediate Operations: --
        List<Integer> processesNum = num.stream()
                                    .filter( n -> n % 3 == 0 ) //3,9,6,12..
                                    .map( n -> n + n)          //6,12,18,24
                                    .sorted()
                                    .distinct()
                                    .collect(Collectors.toList()); //collect results

        // Terminal Operations: --
        processesNum.forEach(System.out::println);


        // list of String --
        List<String> characters = Arrays.asList("phone", "tablet", "computer", "laptop", "mouse" , "pen");
                characters.stream()
                        .limit(characters.size()-1)                     //long
                        .map ((i)-> { return i.toUpperCase()+"*";})             //function
                        .sorted((i1,i2) -> {return 0;})                        //comparator
                        .forEach((i)-> { System.out.println(i);});              //consumer


        //List of String --
        //FlatMap--
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );
                nestedList.stream()
                        .flatMap((list)-> { return list.stream();})
                        //.peek((List) -> {System.out.println(List);})
                        .skip(2)                                             //a,b skipped
                        .forEach((list) -> {System.out.println(list);});       //c,d,e....
    }
}
// Streams-- Process sequence of elements(like collection) in a functional style - readable/ concise /parallel process.

//1.Source: Obtain stream from a data source. (stream)

//2.Intermediate Operations:  Chain one or more intermediate operations to transform the stream.
    //(Filter, map, sorted, distinct)

//3.Terminal Operation:  Apply a terminal operation to produce a result or a side -effect.
    //(collect, forEach, reduce, count).

//4. Functional Interfaces--
    //1.Predicates-- takes value of 1 arg, returns boolean. / BiPredicates--takes 2,return 1/IntPre/LongPre/DoublePre.
    //2.Functions-- takes 1 arg , returns 1 result./ BiFunction/ UnaryOperator/ BinaryOperator
    //3.Consumers-- takes 1 arg , returns nothing./ BiConsumer.
    //4.Suppliers-- takes no arg, returns result. /

//FlatMap--Transforms each element into a stream, and put resulting streams into a single stream.
