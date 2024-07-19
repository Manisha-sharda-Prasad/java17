package com.manisha.java.STREAMS;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
public class StreamsCollectorMethods {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        //counting--
        Long count = numbers.stream()
                           .collect(Collectors.counting());
                 System.out.println(count);


        //summingInt--
        int sum = numbers.stream()
                .collect(Collectors.summingInt(n -> n));
        System.out.println(sum);

        //averagingInt--
        double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(average);


    }
}
