package com.manisha.java.oops.Encapsulation.Player;

import com.manisha.java.util.Print;
public class EnhancedPlayer {
    private String fullName;
    private int healthPercent;
    private String weapon;
    //Constructors----
    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health <= 0){
            this.healthPercent = 1;
        }else if(health > 100){
            this.healthPercent = 100;
        }else {this.healthPercent = health;
        }
        this.weapon = weapon;
    }
    //Methods---------
    public void loseHealth(int damage){
        healthPercent = healthPercent - damage;
        if(healthPercent <= 0){
            Print.print("Player knocked out of the game");
        }
    }
    public int healthRemaining(){
        return healthPercent;
    }
    public void restoreHealth(int extraHealth){
        healthPercent = healthPercent + extraHealth;
        if (healthPercent > 100){
            Print.print("Player restored 100%");
            healthPercent = 100;
        }
    }
}
