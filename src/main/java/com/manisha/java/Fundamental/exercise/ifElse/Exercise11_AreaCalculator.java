package com.manisha.java.Fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise11_AreaCalculator {
public static double area(double radius){
    if(radius < 0){
        Print.info("Invalid Value.");
        return -1;
    }
    double areaOfCircle = 3.14 * (radius + radius);
    Print.info("Circle : " + areaOfCircle );
    return areaOfCircle;
}

public static double area(double x, double y) {
    if(x < 0 || y < 0){
        Print.info("Invalid Value.");
        return -1;
    }
    double areaOfRectangle = ( x * y );
    Print.info("rectangle : " + areaOfRectangle );
    return areaOfRectangle;
}
public static void main(String[] args) {
    area(5.0);
    area(-1);

    area(5.0, 4.0);
    area(-1.0, 4.0);
 }
}
