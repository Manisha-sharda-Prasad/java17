package com.manisha.java.Collection.C01_ListAndSet.sorting;

import lombok.*;

public @AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
class Place implements Comparable<Place>{
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
