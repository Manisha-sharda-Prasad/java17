package com.manisha.java.util;

import java.util.Arrays;

public class Print{
    static int lineNo = 0;
    public static void single(Object o){
        lineNo++;
        System.out.println( lineNo+". "+o+"\n------------------------------");
    }

    public static void multiple(Object... o){
        lineNo++;
        System.out.print( lineNo+". ");
        Arrays.stream(o)
                //.peek(x->lineNo++)
                .map(x->  " * "+x)
                .forEach(System.out::println);
        System.out.println("------------------------------");
    }
}
