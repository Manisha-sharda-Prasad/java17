package com.manisha.java.Fundamental.basicFundamental;

import com.manisha.java.util.Print;

public class ExpressionAndStatement {
 static void learn()
 {
     //abbreviating operators------------------------------------------
     //(increment, decrement, addition compound assignment, subtraction comp, multi comp, division comp).---
     int plus = 10;
     plus += 3;
     Print.info(plus);

     int minus = 5;
     minus -= 2;
     Print.info(minus);

     double multi = 10;
     multi *= 1.5;
     Print.info(multi);

     double division = 6;
     division /= 2.5;
     Print.info(division);

     //if-then Statement----------------------------------------------------
     //01.-------
     boolean isDonkey = false;
     if (isDonkey){
         Print.info("See that is a Donkey!!!");}
     else{
         Print.info("No!");
         Print.info("That's a Cow!!!!");
     }


     //logical-operators (&&, ||) -------------------------------------------------
     int avgSalary = 9000;
     int employeeOneSalary = 10000;
     int employeeTwoSalary = 8000;

     if ((employeeOneSalary >= avgSalary) && (employeeOneSalary >= employeeTwoSalary)){
         Print.info("Employee one is earning well!!");
     }else {
         Print.info("Employee one is not getting paid enough!!");
     }

     if ((employeeTwoSalary >= avgSalary) || (employeeTwoSalary >= employeeOneSalary)){
         Print.info("Employee two is earning well!!");
     }else {
         Print.info("Employee two is not getting paid enough!!");
     }

     //Ternary-operators( ? : )-------------------------------------------------------

     int currentAge = 15;
     String  ageOfClient = (currentAge >= 18) ? "Over Eighteen" : "Still a kid" ;
     Print.info("Our client is " + ageOfClient );


     //Operator-Precedence///CODING-CHALLENGE///---------------------------------------
     double dobVar = 20.00d;
     double secVar = 80.00d;
     double operationVar = (dobVar + secVar) * 100.00d;
     Print.info(operationVar);

     double theRemainder = (operationVar) % 40.00d;
     Print.info(theRemainder);

     boolean zeroOrNot = Boolean.parseBoolean((theRemainder == 0) ? "true" : "false");
     Print.info("got some remainder !!");

 }


 //  ############## MAIN #############
 public static void main(String[]agrs){
     learn();
 }

}
