package com.manisha.java.Collection.ArrayListAndSet;

import com.manisha.java.util.Print;
import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
class Place   implements Comparable<Place>{
    String name;
    int distance;
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }

    @Override // compare-logic-1
    public int compareTo(Place place2) {
        // place1 - this
        // compare place1 and place2, return  -1 ,0, 1
        if(this.distance == place2.distance) return 0;
        else if(this.distance < place2.distance) return -1;
        else if(this.distance > place2.distance) return 1;
        else return 0;
    }
}

// compare-logic-2
class PlaceComparatorByName implements Comparator<Place>{
    @Override
    public int compare(Place place1, Place place2) {
      return place1.name.compareTo(place2.name);
    }
}

// compare-logic-3
class PlaceComparatorByDistance implements Comparator<Place>{
    @Override
    public int compare(Place place1, Place place2) {
        if(place1.distance == place2.distance) return 0;
        else if(place1.distance < place2.distance) return -1;
        else if(place1.distance > place2.distance) return 1;
        else return 0;
    }
}

public class ItineraryChallenge {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

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
        //Print.print(placesList);

        Collections.sort(placesList); // comparable
        Collections.sort(placesList,new PlaceComparatorByName()); // comparator-1
        Collections.sort(placesList,new PlaceComparatorByDistance()); // comparator-2
        //Collections.sort(placesList,(p1,p2)->p1.name.compareTo(p2.name));

        Print.print(placesList);

        // 3. create listIterator
        ListIterator<Place> listIterator = placesList.listIterator();
        Iterator<Place> iterator = placesList.iterator();
        // listIterator.next();
        // listIterator.previous();

        // 4. Menu program
        while (!quitLoop)
        {
            printMenu();
            Print.print("Enter Value your choice: ");
            String menuItem = scan.nextLine().toUpperCase().substring(0,1);

            switch (menuItem)
            {
                case "F":
                    Print.print("User wants to go forward");
                    if (listIterator.hasNext()) Print.print(listIterator.next());
                    break;

                case "B":
                    Print.print("User wants to go backward");
                    if (listIterator.hasPrevious()) Print.print(listIterator.previous());
                    break;

                case "L": Print.print(placesList); break;

                default : quitLoop = true; break;
            }
        }
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
