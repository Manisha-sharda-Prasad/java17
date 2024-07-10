package com.manisha.java.FUNDAMENTAL.ControlFlow;

import com.manisha.java.util.Print;

public class WhileandDowhile {
//break and continue-----------------------------------
    static void beak_concept(String searchItem){
        String[] items = new String[] {"bag", "shoes", "watch", "phone","cable"};

        for(int i =0; i<items.length; i++  ){
            if(searchItem.equals(items[i])){
                Print.info("Items found");
                break;
            }else{
                Print.info("Items Not Found");
            }
        }
    }

    static void continue_concept(){
        String[] items = new String[] {
                "Accessory_bag",
                "Accessory_shoes",
                "electronic_watch",
                "electronic_phone",
                "electronic_laptop"};

        for(int i =0; i<items.length; i++  ){
            String currentItem = items[i];

            //skip the Accessory---
            if(currentItem.contains("Accessory"))
                continue;

            Print.info("charging... "+ currentItem);
        }
    }
//-----------------------------MAIN----------------------------------------------
    public static void main(String[]args){
        beak_concept("watch");
        continue_concept();

        //while--------
        int j = 1;
        boolean isReady = false;

        while(isReady){
            if (j > 5) {
                break;
            }
            Print.info(j);
            j++;
        }
        //do while--------
        do {
            if (j > 5) {
                break;
            }
            Print.info(j);
            j++;
            isReady = (j > 0);
        } while(isReady);

        //continue--------
        int number = 0;
        while (number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            Print.info(number , "_");
        }
    }
}

/*
continue -- skip the current iteration, jump to next iteration.
break - breaks the loop / comes out of for loop / No more iteration will run.

while vs do-while : do-block runs at least once.
 */
