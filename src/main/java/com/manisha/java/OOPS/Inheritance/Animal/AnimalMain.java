package com.manisha.java.OOPS.Inheritance.Animal;

import com.manisha.java.util.Print;

import static com.manisha.java.OOPS.Inheritance.Animal.Animal.doAnimalStuff;

public class AnimalMain {
    public static void main(String[]args){

        Animal animal = new Animal("Tiger", "Huge", 400);
        doAnimalStuff(animal,"slow");
        Print.print(animal);
        Print.print("********");

        // Dog 'new' instances---->

        Dog husky = new Dog(); //no parameter() of Dog Class
        doAnimalStuff(husky, "fast");
        Print.print(husky);
        Print.print("********");

        Dog pug = new Dog("Pug", 40);//(2 parameter) of Dog Class
        doAnimalStuff(pug, "slow");
        Print.print(pug);
        Print.print("********");

        Dog retriever = new Dog("Labrador Retriever", 80, "Swimmer", "Floppy");
        doAnimalStuff(retriever, "slow");
        Print.print(retriever);
        Print.print("********");

        Dog yorkie = new Dog("Yorkie", 15, "Straight", "Curled");
        doAnimalStuff(yorkie, "fast");
        Print.print(yorkie);
        Print.print("********");
    }
}
