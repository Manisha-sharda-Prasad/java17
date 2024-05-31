package com.manisha.java.OOPS.Polymorphism.Movie;

public class MovieMain {
    public static void main(String[] args){
        Movie theMovie = new Movie("Planet of the Apes");
        theMovie.watchMovie();

        //extended Movie by Adventure subclass----
        Movie movie = new Adventure("Avtar");
        movie.watchMovie();

        Movie movie2 = new Comedy("Hungama");
        movie2.watchMovie();

        Movie movie3 = new SciFi("Marvel");
        movie3.watchMovie();
        // better--
        Movie movie4 = Movie.getMovie("Comedy", "Hungama");
        movie4.watchMovie();

        Movie movie5 = Movie.getMovie("Adventure", "Avtar");
        movie5.watchMovie();

        //casting with classes---
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Comedy comedy = (Comedy) Movie.getMovie("C", "Airplane");
        comedy.watchMovie();

    }
}

