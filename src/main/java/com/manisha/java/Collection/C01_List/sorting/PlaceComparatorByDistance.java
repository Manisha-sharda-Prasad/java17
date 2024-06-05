package com.manisha.java.Collection.C01_List.sorting;

import java.util.Comparator;

public class PlaceComparatorByDistance implements Comparator<Place> {
    @Override
    public int compare(Place place1, Place place2) {
        return place1.name.compareTo(place2.name);
    }
}

// Shorthand (Comparator)
        /*
        //way-1 (lambda/Arrow-function) - PREFERRED
        Collections.sort(placesList,(p1,p2)->p1.name.compareTo(p2.name));

        //way-2
        Collections.sort(placesList, new Comparator<Place>() {
            @Override public int compare(Place o1, Place o2) {  return 0; }
        });
*/
