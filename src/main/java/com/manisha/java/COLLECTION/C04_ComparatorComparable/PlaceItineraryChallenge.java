package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import com.manisha.java.util.Print;

import java.util.*;

/**
 * TOPIC/s :
 * Comparator vs Comparable,
 * Iterator vs ListIterator
 * switch block vs Switch Expression
 */

public class PlaceItineraryChallenge {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean quitLoop = false;

        //1. create LinkedList .
        //   item type - Place
        List<Place> placesList = new LinkedList<>();

        //2. list - items add
        placesList.add(new Place("Adelaide", 1374));
        placesList.add(Place.builder().name("Adelaide").distance(1374).build());
        placesList.add(new Place("Brisbane", 917));
        placesList.add(new Place("Perth", 3923));
        placesList.add(new Place("Alice Springs", 2771));
        placesList.add(new Place("Darwin", 3972));
        placesList.add(new Place("Melbourne", 877));
        placesList.add(new Place("Sydney", 0));

        /* List l = placesList
                .stream()
                .filter(p -> p.name.equals("Perth"))
                .peek(p-> {})
                .map(p->p)
                .collect(Collectors.toList());*/

        Collections.sort(placesList,new PlaceComparatorByName()); // comparator-1
        Print.print("SORT-1 (Custom-Order/Comparator-2 - by distance)",placesList);

        Collections.sort(placesList,new PlaceComparatorByDistance()); // comparator-2
        Print.print("SORT-2 (Custom-Order/Comparator-1 - by name)",placesList);
        //Collections.sort(placesList,Integer::m);                 <<< Lambda


        Collections.sort(placesList); // comparable
        Print.print("SORT-3 (natural-Order of Place - by distance)",placesList);

        // 3. create listIterator
        ListIterator<Place> listIterator = placesList.listIterator();
        Iterator<Place> iterator = placesList.iterator();
        // listIterator.next();
        // listIterator.previous();

        // 4. Menu program
        printMenu();
        while (!quitLoop)
        {
            Print.print("Enter Value your choice: ");
            String menuItem = scan.nextLine().toUpperCase().substring(0,1);

            Place item = switch (menuItem)
            {
                case "F"-> listIterator.hasNext() ? listIterator.next() : placesList.get(placesList.size()-1);
                case "B"-> listIterator.hasPrevious()?listIterator.previous() : placesList.get(0);
                case "L"-> { Print.print(placesList);  yield null;}
                default -> { quitLoop = true; yield null;}
            };
            if(item!=null) Print.print(item);
        }
    }

    private static void printMenu(){
        Print.print("""
                Available actions(select word or letter):
                (F)Forward
                (B)Backwards
                (L)List Places
                (M)Menu
                (Q)Quit
                """);
    }
}





