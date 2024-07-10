package com.manisha.java.STREAMS;

import com.manisha.java.util.Print;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsMore {
    public static void main(String[] args) {

        List <List<String>> names = Arrays.asList(
                Arrays.asList("manisha", "arush","vageesh","ashish"),
                Arrays.asList("pratibha","lekhraj","sharda","tanushri")
        );

        List<String> familyNames = names.stream()
                                        .flatMap(i -> i.stream())
                                        .map(i -> i.toUpperCase() + " PRASAD|")
                                        .sorted()
                                        .collect(Collectors.toList());          //terminal
                                   Print.print(familyNames);



        List<Integer> intNum = Arrays.asList(2,3,7,8,9,3,6,4,3,12);

        List<Integer> var = intNum.stream()
                                   .filter(i -> i >= 3 && i % 3 == 0 )
                                   .peek((i)-> Print.print(i))
                                   .distinct()
                                   .sorted()
                                   .limit(3)
                                   .collect(Collectors.toList());                //terminal
                                 //.forEach(i -> Print.print(i));
                              Print.print(var);


        Optional<Integer> num = intNum.stream()
                                      .map(i -> i * 5 )
                                      .distinct()
                                      .peek((i)-> Print.print(i))
                                      .max((i1,i2)-> i1.compareTo(i2));            //terminal
                                 Print.print(num);

        Optional<Integer> add = intNum.stream()
                                      .reduce((i1,i2)-> i1+i2);
                                Print.print(add);

        Optional<Integer> minus = intNum.stream()
                                        .reduce((i,j) -> i-j);                      //terminal
                                   Print.print(minus);

        boolean numCheck = intNum.stream()
                                 .anyMatch( i -> i % 2 == 0);                       //terminal
                            Print.print(numCheck);

        boolean numCheck2 = intNum.stream()
                                  .allMatch( i -> i % 3 == 0);                      //terminal
                             Print.print(numCheck2);



        List <String> fruits = Arrays.asList("Apple","Papaya","Orange","Kiwi","Litchi","Mango");

        List<String> toList = fruits.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
                               Print.print(toList);

        Set<String> toSet = fruits.stream()
                                  .limit(4)
                                  .collect(Collectors.toSet());
                             Print.print(toSet);

        Map <String, String> toMap = fruits.stream()
                                  .collect(Collectors.toMap((i)-> i, (i)-> i, (old,nw)-> old+nw));
                            Print.print(toMap);


    }
}
//Only 1 terminal operation allowed in Stream operations.