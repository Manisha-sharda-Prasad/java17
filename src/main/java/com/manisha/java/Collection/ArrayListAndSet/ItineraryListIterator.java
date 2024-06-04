package com.manisha.java.Collection.ArrayListAndSet;

import com.manisha.java.util.Print;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ItineraryListIterator {
    public static void itinerary(LinkedList<String> list) {
        Print.print("Trips starts from :" + list.getFirst());
        var iterator = list.listIterator();
        while (iterator.hasNext()){
            var place = iterator.next();
        }

    }

    public static void addElements(LinkedList<String> list) {
        Scanner scan = new Scanner(System.in);

        Print.print("Enter List of Places using comma- delimited strings : " );
        String[] input = scan.nextLine().split(",");
        list.addAll(List.of(input));
    }

    public static void main(String[] args) {
        LinkedList <String> placesToVisit = new LinkedList<>();

        addElements(placesToVisit);

    }
}
