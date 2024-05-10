package com.manisha.java.oops.Encapsulation;

import com.manisha.java.util.Print;

public class Player {
   public String playerName;
   public int health;
   public String weapon;
   public void loseHealth(int damage){
       health = health - damage;
       if(health <= 0){
           Print.print("Player knocked out of the game");
       }
   }
   public int healthRemaining(){
       return health;
   }
   public void restoreHealth(int extraHealth){
       health = health + extraHealth;
       if (health > 100){
           Print.print("Player restored 100%");
           health = 100;
       }
   }
}
