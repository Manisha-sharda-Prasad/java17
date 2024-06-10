package com.manisha.java.OOPS.Abstraction.AbstractClass.AnimalBird;

public abstract class Animal {
    protected  String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    protected abstract void move(String speed);
    protected abstract void makeNoise();
    public String getExplicitType(){
        return getClass().getSimpleName()+", "+type ;
    }
}
//Class-->Subclass--
//Animal-->Mammal(abstract), Fish.
//Mammal-->Horse, Dog