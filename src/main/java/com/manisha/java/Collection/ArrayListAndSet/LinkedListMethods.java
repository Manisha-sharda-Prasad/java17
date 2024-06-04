package com.manisha.java.Collection.ArrayListAndSet;
 import com.manisha.java.util.Print;

 import  java.util.LinkedList;
public class LinkedListMethods {
    public static void main(String[] args) {
        //var placesToVisit = new LinkedList<String>();

        LinkedList <String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Mexico"); //first index at 0
        Print.print(placesToVisit);

        addElements(placesToVisit); //adding elements
        Print.print(placesToVisit);

        removeElements(placesToVisit);//removing elements
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
}
