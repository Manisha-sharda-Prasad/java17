package com.manisha.java.oops.Inheritance.Worker;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
}
