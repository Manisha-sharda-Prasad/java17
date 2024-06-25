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
    }
}
// Streams-- Process sequence of elements(like collection) in a functional style - readable/ concise /parallel process.

//1.Source: Obtain stream from a data source. (stream)

//2.Intermediate Operations:  Chain one or more intermediate operations to transform the stream.
//(Filter, map, sorted, distinct)

//3.Terminal Operation:  Apply a terminal operation to produce a result or a side -effect.
//(collect, forEach, reduce, count)