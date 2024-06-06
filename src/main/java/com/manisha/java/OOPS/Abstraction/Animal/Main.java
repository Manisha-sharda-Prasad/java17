package com.manisha.java.OOPS.Abstraction.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal("animal","big" , 100) ; //not possible cannot make new instance/only by subclass.

        Dog dog = new Dog("Wolf", "big",100);
        Fish fish = new Fish("Goldfish", "small",3);
        dog.makeNoise();
        doAnimalStuff(dog);

        fish.makeNoise();
        doAnimalStuff(fish);

        //also using ArrayList multiple instances---
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Salmon","small",2));

        for (Animal animal : animals){
            doAnimalStuff(animal);
        }
    }
    public static void doAnimalStuff(Animal a) {
        a.makeNoise();
        a.move("slow");
    }
}
