package com.manisha.java.Collection.C99_DataStructure;

import lombok.Setter;
import lombok.ToString;


// Just for references
public class MyLinkedList {
    public Item first;
    public Item last;
    void add(String s)
    {
        Item currentItem = new Item();

        // 1. value
        currentItem.setValue(s);

        // 2. forward
        if(this.first == null) {
            this.first = currentItem;
        }else{
            currentItem.setForwardlink(null);
        }

        // 3. backward
        if(this.last == null) {
            this.last = currentItem;
        }else{
            currentItem.setBackwardLink(this.last);
        }

        this.last = currentItem;
    }

    void remove(){}

    public static  void main(String... a){
        MyLinkedList myList = new MyLinkedList();
        myList.add("item-1");
        myList.add("item-2");
        System.out.println(myList.first+"\n"+myList.last);
    }
}

@Setter
@ToString
class Item{
    Item backwardLink;
    String value;
    Item forwardlink;
}



/*

i1 = { null, "abc1", }
i2 = { i1, "abc2", i3 }
i3 = { i2, "abc3", null }


["abc1", "abc2", "abc3"]

*/

