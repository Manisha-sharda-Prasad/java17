package com.manisha.java.oops.Inheritance.Worker;

import com.manisha.java.util.Print;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){};
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(5));
        return (currentYear- birthYear);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
    //------------------------Main------------------------------->
    public static void main(String[]args){
        Employee manu = new Employee("Manu", "4/12/1995", "01/01/2020");
        Print.print(manu);
        Print.print("Age = " + manu.getAge());
        Print.print("Pay = " + manu.collectPay());

        SalariedEmployee lekhu = new SalariedEmployee("Lekhu", "5/18/1991", "05/02/2017", 90000);
        Print.print(lekhu);
        Print.print("Age = " + lekhu.getAge());
        Print.print("Pay = " + lekhu.collectPay());
        Print.print("Lekhu paycheck is = $" + lekhu.collectPay());

        lekhu.retire();
        Print.print("Lekhu pension check = " + lekhu.collectPay());
    }

}
