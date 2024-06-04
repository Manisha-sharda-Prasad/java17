package com.manisha.java.Collection.ArrayListAndSet;
 import com.manisha.java.util.Print;

 import  java.util.LinkedList;
 import java.util.ListIterator;

public class LinkedListMethods {
    //------------------------MAIN----------------------------------------
    public static void main(String[] args) {
        //var placesToVisit = new LinkedList<String>();

        LinkedList <String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add("New Jersey");
        placesToVisit.add(0,"Mexico"); //first index at 0
        Print.print(placesToVisit);

        addElements(placesToVisit); //adding elements
        Print.print(placesToVisit);

//        removeElements(placesToVisit);//removing elements
//        Print.print(placesToVisit);
        gettingElements(placesToVisit);
        Print.print(placesToVisit);

        printItinerary3(placesToVisit);
        Print.print(placesToVisit);
    }
    private static void addElements(LinkedList<String> list){
        //add elements------------
        list.add("Ladakh");
        list.addFirst("Darwin");
        list.addLast("Holland");

        //Queue methods------------
        list.offer("Melbourne"); //last
        list.offerFirst("Zimbabwe");//first
        list.offerLast("NewYork");//last

       //Stack methods-------------
        list.push("Alice Springs"); //push in first
    }
    public static void removeElements(LinkedList<String> list) {
        //remove elements-----------
        list.remove(4);
        list.remove("Darwin");

        Print.print(list);
        String s1 = list.remove(); //removes first
        Print.print(s1 + " was removed");

        String s2 = list.removeFirst(); //removes first
        Print.print(s2 + " was removed");

        String s3 = list.removeLast(); //removes last
        Print.print(s3 + " was removed");

        //Queue/Deque poll methods---------
        String p1 = list.poll(); //removes first
        Print.print(p1 + " was removed");

        String p2 = list.pollFirst(); //removes first
        Print.print(p2 + " was removed");

        String p3 = list.pollLast(); //removes last
        Print.print(p3 + " was removed");

        //adding push-----------
        list.push("Las Vegas"); // add first
        list.push("Yosemite");
        Print.print(list);

        //pop/remove ------------
        String p4 = list.pop(); //removes first
        Print.print(p4 + " was removed");
    }

    public static void gettingElements(LinkedList<String> list) {
        Print.print("Retrieved Element " + list.get(4));
        Print.print("First element " + list.getFirst());
        Print.print("Last element " + list.getLast());

        Print.print("New Jersey is at position " + list.indexOf("New Jersey"));
        Print.print("Mexico is at position " + list.lastIndexOf("Mexico"));

        //Queue retrieval method----
        Print.print("Element from element() = " + list.element()); //first
        Print.print("Element from peek() = " + list.peek()); //first
        Print.print("Element from peekFirst() = " + list.peekFirst());
        Print.print("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        Print.print("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i ++){
            Print.print("-->From: " + list.get( i -1) + " to " + list.get(i) );
        }
        Print.print("Trip ends at " + list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list) {

        Print.print("Trip starts at " + list.getFirst());
        String previousPlace = list.getFirst();
        for (String place : list){
            Print.print("-->From: " + previousPlace + " to " + place );
            //setting 'previousPlace' to current iterations 'place' var.
        }
        Print.print("Trip ends at " + list.getLast());
    }
    public static void printItinerary3(LinkedList<String> list) {

        Print.print("Trip starts at " + list.getFirst());

        String previousPlace = list.getFirst();
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            var place = iterator.next();
            Print.print("-->From: " + previousPlace + " to " + place );
            previousPlace = place;
        }
        Print.print("Trip ends at " + list.getLast());
    }

}
