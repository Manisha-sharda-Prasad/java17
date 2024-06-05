package com.manisha.java.Collection.C01_List.sorting;

import java.util.Comparator;

public class PlaceComparatorByName implements Comparator<Place> {
    @Override
    public int compare(Place place1, Place place2) {
        if(place1.distance == place2.distance) return 0;
        else if(place1.distance < place2.distance) return -1;
        else if(place1.distance > place2.distance) return 1;
        else return 0;
    }
}
