package com.manisha.java.OOPS.Encapsulation.Player;

import com.manisha.java.util.Print;

public class PlayerMain {
    public static void main(String[]args){
    //(bad practice)--public--so able to use here--adding, manipulating--

//        Player player = new Player();
//        player.playerName ="Manisha";
//        player.health = 30;
//        player.weapon = "Sword";

//        int damage = 10;
//        player.loseHealth(damage);
//        Print.print("Remaining health = " + player.healthRemaining());//Remaining health = 20
//
//        player.loseHealth(20);
//        Print.print("Remaining health = " + player.healthRemaining()); //Remaining health = 0
//
//        int extraHealth = 200;
//        player.restoreHealth(extraHealth);
//        Print.print("New health of player = " + player.healthRemaining());//New health of player = 100

    //change parameter Names (name-> fullName),((health->healthPercent--won't effect, not changed in main)--
    EnhancedPlayer manisha = new EnhancedPlayer("Manisha", 200, "Sword");
        Print.print("Initial health is = " + manisha.healthRemaining());
   }
}
