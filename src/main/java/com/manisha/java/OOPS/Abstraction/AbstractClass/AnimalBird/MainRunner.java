package com.manisha.java.OOPS.Abstraction.AbstractClass.AnimalBird;

import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) {
        //Animal a = new Animal("animal","big" , 100) ; //not possible cannot make new instance/only by subclass.

        Dog dog = new Dog("Wolf", "big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        Fish fish = new Fish("Goldfish", "small",3);
        fish.makeNoise();
        doAnimalStuff(fish);

        //also using ArrayList multiple instances/add in animals [array list].---
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Salmon","small",2));
        animals.add(new Horse("Clydesdale","large" , 1000));

        //loop iterates over a collection/array 'animals', where each element is of type Animal.
        for (Animal animal : animals){
            doAnimalStuff(animal);
        }
        for (Animal mammal : animals ){
            if (mammal instanceof  Mammal m){
                m.shedHair();
            }
        }
    }
    public static void doAnimalStuff(Animal a) {
        a.makeNoise();
        a.move("slow");
    }
}
