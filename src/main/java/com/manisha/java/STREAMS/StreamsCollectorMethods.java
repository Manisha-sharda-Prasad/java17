package com.manisha.java.STREAMS;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class StreamsCollectorMethods {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,12,15);
        List <String> chars = Arrays.asList("Apple", "Banana", "Orange", "apricot", "cherry");

        //counting--
        Long count = numbers.stream()
                            .collect(Collectors.counting());
                      System.out.println(count);

        //summingInt (ToIntFunction<? super T> mapper)--
        int sum = numbers.stream()
                         .collect(Collectors.summingInt(n -> n));
                   System.out.println(sum);

        //averagingInt (ToIntFunction<? super T> mapper)--
        double average = numbers.stream()
                                .collect(Collectors.averagingInt(n -> n));
                          System.out.println(average);

        //joining (CharSequence delimiter)--
        String string = chars.stream()
                             .collect(Collectors.joining("::"));
                       System.out.println(string);

        //toList--
        List list = numbers.stream()
                           .collect(Collectors.toList());
                     System.out.println(list);

        //toSet--
        Set set = chars.stream()
                       .collect(Collectors.toSet());
                 System.out.println(set);

        //toMap (keyMapper, valueMapper)--
        Map <String,Integer> charMapLength = chars.stream()
                                                  .collect(Collectors.toMap(m->m, m->m.length()));
                                            System.out.println(charMapLength);
        //1.groupingBy (classifier)--
        Map <Character, List<String>> groupByFirstLetter = chars.stream()
                                                                .collect(Collectors.groupingBy(c -> c.charAt(0)));
                                                          System.out.println(groupByFirstLetter);
        //2.--
        Map<String, List<Integer>> result =
        Stream.of(1,2,3,4,5,6,7,8)
              .collect(Collectors.groupingBy(i-> i%2==0 ? "even" : "odd")); // any no. of group
        System.out.println(result);

        //1. partitioningBy--
        Map<Boolean, List<Integer>> result2 =
        Stream.of(1,2,3,4,5,6,7,8)
              .collect(Collectors.partitioningBy(i-> i%2==0 ? true : false)); // only 2 group : T/F
        System.out.println(result2);

        //2.--
        Map<Boolean, List<Integer>> partition = numbers.stream()
                                                       .collect(Collectors.partitioningBy(i -> i >= 5 ? true : false));
                                                 System.out.println(partition);





    }
}

// even = [2,4,6,8]
// odd = [1,3,5,7]
//k:v, k:v, k:v, ... // map<String, List<Integer>>
// map<boolean, List<Integer>>


//groupingBy-- for categorizing data based on one or more attributes,
//-such as grouping( people by age), (products by category).

//partitioningBy-- for binary splits based on a condition,
//-separating (passed and failed students), (positive and negative numbers).