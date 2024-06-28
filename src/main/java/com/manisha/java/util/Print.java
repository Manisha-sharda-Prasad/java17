package com.manisha.java.util;

import org.springframework.transaction.annotation.Transactional;

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

    public static void print(Object... o){
        Arrays.stream(o).forEach(System.out::println);
        System.out.println("------------------------------");
    }

    @Transactional
    public static void sendMoney(){
        //1. sender-acct : SQL update : 1000 : 900
        // 2. receiver-acct : SQL update : 2000 : 2100
    }
}
