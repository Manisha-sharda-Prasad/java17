package com.manisha.java.STREAMS;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
@Slf4j
public class StreamsCollectorMethods {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
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
        //groupingBy (classifier)--
        Map <Character, List<String>> groupByFirstLetter = chars.stream()
                                                                .collect(Collectors.groupingBy(c -> c.charAt(0)));
                                                          System.out.println(groupByFirstLetter);



    }
}
