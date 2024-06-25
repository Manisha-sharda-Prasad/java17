package com.manisha.java.Streams;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Builder @Getter @ToString
class Student { Long id; String name; String email; }
@Slf4j
public class Streams
{
    public static void print(Object... o){
        Arrays.stream(o).forEach(System.out::println);
        System.out.println("-------------------");
    }

    //========= collection / list
    static List<String> listStr = List.of( "manisha", "lekhraj", "Arush");
    static List<Integer> listInt = List.of( 3,3,3,5,5,4,4,4,4,4,4);
    static List<Student> listStudent = List.of(
            Student.builder().name("Manisha").id(1L).email("p4m@g.c").build(),
            Student.builder().name("lekhraj").id(1L).email("ld@g.c").build(),
            Student.builder().name("Arush").id(1L).email("ac@g.c").build()
    );


    // ========== stream processing
    // my-Stream
    // .intermediate operation-1, operation-2, operation-3,.....   Optional
    // .terminal operation (last/single)



    public static void main(String[] args)
    {
        //1.  List:[ ARUSH, LEKHRAJ, MANISHA ]
        print( listStr.stream()
                // intermediate
                .map(i -> i.toUpperCase()+" DINKAR")
                .peek( i -> System.out.println(i) )
                .sorted()
                .peek(i -> System.out.println(i) )
                // terminal
                .collect( Collectors.toList() )
        );

        //2. Map:[ 1-1, 2-1, 3-3, 4-6, 5-2, 10-1, 0-1]
        print(listInt.stream().
                collect(Collectors.groupingBy(i->i, Collectors.counting()))
        );

        print( listInt.stream()
                .collect(Collectors.counting())
        );

        print( listInt.stream()
                .collect(Collectors.summingInt(i->i))
        );
        print( listInt.stream()
                .collect(Collectors.averagingInt(i->i))
        );

        print( listStr.stream()
                .collect(Collectors.joining(" --- ", "< ", " >"))
        );

        print(
                listStudent.stream()
                        .map( s -> s.toString())
                        .collect(Collectors.joining(" --- ","< ", " >"))
        );

        // List [ e1, e2, e3]
        print(
                listStudent.stream()
                        .map( s -> s.getEmail())
                        .collect( Collectors.toList())
        );

        // 5,5
        print( listInt.stream()
                .limit(5)
                .skip(3)
                .filter( i-> i>4 ? true : false )
                .collect(Collectors.toList())
        );
    }
}
