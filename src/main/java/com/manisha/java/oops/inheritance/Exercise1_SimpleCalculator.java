package com.manisha.java.oops.inheritance;

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
        return additionalResult;
    }

    public double getSubtractionResult() {
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        return multiplicationResult;
    }

    public double getDivisionResult() {
        return divisionResult;
    }


}
