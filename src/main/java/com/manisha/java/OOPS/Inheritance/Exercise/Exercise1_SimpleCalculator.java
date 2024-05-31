package com.manisha.java.OOPS.Inheritance.Exercise;

import com.manisha.java.util.Print;

public class Exercise1_SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    private double additionalResult;
    private double subtractionResult;
    private double multiplicationResult;
    private double divisionResult;

    public double getFirstNumber() {
        return firstNumber;
    }
    //set-get first num second num------->

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //get- other methods------->
    public double getAdditionalResult() {
        Print.print("Add = " + (firstNumber + secondNumber));
        return additionalResult;
    }

    public double getSubtractionResult() {
        Print.print("Subtract = " + (firstNumber - secondNumber));
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        Print.print("Multiply = " + (firstNumber * secondNumber));
        return multiplicationResult;
    }

    public double getDivisionResult() {
        Print.print("Divide = " + (firstNumber / secondNumber));
        return divisionResult;
    }
    //--------------------------Main----------------------------------
    public static void main(String[]args){
    Exercise1_SimpleCalculator calculator = new Exercise1_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

       double additionalResult = calculator.getAdditionalResult();
       double subtractionResult = calculator.getSubtractionResult();
       double multiplicationResult = calculator.getMultiplicationResult();
       double divisionResult = calculator.getDivisionResult();
    }
}
