package com.manisha.java.Collection.ArrayListAndSet;

import com.manisha.java.util.Print;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class ItineraryChallenge {
    public static void main(String[] args) {
        //LinkedList contains our list of Place records.
        LinkedList <Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        Print.print(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scan = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop){
            if (!iterator.hasPrevious()){
                Print.print("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                Print.print("Final : " + iterator.previous());
                forward = false;
            }
            Print.print("Enter Value: ");
            String menuItem = scan.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    Print.print("User wants to go forward");
                    if (iterator.hasNext()){
                        Print.print(iterator.next());
                    }
                    break;
                case "B":
                    Print.print("User wants to go backward");
                    if (iterator.hasPrevious()){
                        Print.print(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    Print.print(placesToVisit);
                    break;
                default :
                    quitLoop = true;
                    break;
            }
        }

    }
    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){
            Print.print("Found duplicate : "+ place);
            return; //contains-checks duplicates, and returns.
        }
        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                Print.print("Found duplicate : " + place);
                return;//equalsIgnoreCase- check in upper-lower case
            }
        }
        int matchedIndex = 0; //index var,keeps track of what element is processing.
        for(var listPlace : list){
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex , place);
                return;
            }
            matchedIndex++;  //increment var, in each iteration.
        }
        list.add(place);
    }
    private static void printMenu(){
        Print.print("""
                Available actions(select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
