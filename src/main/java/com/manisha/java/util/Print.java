package com.manisha.java.util;

import java.util.Arrays;

public class Print{
    static int lineNo = 0;
    private static void single(Object o){
        lineNo++;
        System.out.println( lineNo+". "+o+"\n------------------------------");
    }

    public static void info(Object... o){
        //lineNo++;
        //System.out.print( lineNo+". ");
        Arrays.stream(o)
                .peek(x->lineNo++)
                .map(x->  lineNo+". "+x)
                .forEach(System.out::println);
        System.out.println("------------------------------");
    }
}
