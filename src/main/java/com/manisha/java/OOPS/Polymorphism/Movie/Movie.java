package com.manisha.java.OOPS.Polymorphism.Movie;

import com.manisha.java.util.Print;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        Print.print( title + " is a " + instanceType + " film");
    }
    //Factory method--(better with switch... get classes)---
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
}
class  Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happens!");
        Print.print("****************************");
    }
}
class  Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Very funny Scenes",
                "Funny actors",
                "Happy ending!");
        Print.print("****************************");
    }
}
class  SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens",
                "Space Guys saved Planet",
                "Planet blows up!");
        Print.print("****************************");
    }
}