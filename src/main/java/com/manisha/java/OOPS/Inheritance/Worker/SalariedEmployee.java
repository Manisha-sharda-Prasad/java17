package com.manisha.java.OOPS.Inheritance.Worker;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay() {
        //return (int) annualSalary/ 26;
        double paycheck = annualSalary/ 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}
