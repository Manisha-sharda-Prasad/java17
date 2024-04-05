package com.manisha.java.fundamental;

import com.manisha.java.util.Print;

public class PrimitiveDataTypes { // can have only one public class in one file.
	// A.properties

	// A. property
	static int topVariable = 100000;

	// B.method
	static void learnBoolean(){
		System.out.println("======= A. boolean =========");
		boolean hasCar = false;System.out.println("1. boolean - hasCar : "+hasCar);
	}

	static void learnNumbers(){
		System.out.println("======= C. Number type/s (6)=========");

		// ======== C.1 Integer (4) ==========
		// (byte 8, short 16, int* 32, long 64 )

		// --- cast. big size --> small size
		// put (type)
		int i1 = 20; // less than 32000
		short s1 = (short) i1; // no data corruption
		System.out.println("i1 : "+i1 + " , s1 : "+ s1);

		i1 = 60000; // more than 32000
		s1 = (short) i1; // data is corrupted
		System.out.println("i1 : "+i1 + " , s1 (data corrupted) : "+ s1);

		// --- cast. small --> big
		// NO NEED, to put (type)
		s1 = 32000;
		i1 = s1;
		System.out.println("i1 : "+i1 + " , s1 : "+ s1);

		long l1 = 20L; //notice L,l
		System.out.println("l1 : "+l1);



		// ======== C.2 Floating type (2) ==========
		// (float 32 f , double*  64 ) Notice d,f
		float f1 = 3.1556f;
		double d1 = 3.1556;
		d1 = f1; // Small >> Big
		f1 = (float)d1; // Big >>  Small

	}

	static void learnChar(){
		System.out.println("======= B. Char =========");
		char c1 = 'A';
		System.out.println("2. char - c1 : "+c1);

		//a.char to int
		int char2int = '&';
		System.out.println("\t '&' as int : "+char2int);

		// b.int to char
		char charFromInt = 65;
		System.out.println("\t 65 as char : "+charFromInt);

		//  --- ASCII / UNICODE (character encoding scheme )----
		// eg :: 'A' - \u0041
		// binary (2) 	- 0,1    					 'A' - 1000001
		// decimal (10) - 0,1,2.....9				 'A' - 65
		// hexa (16) 	- 0,1,2.....9,A,B,C,D,E,F 	 'A' - 41
		// https://www.rapidtables.com/convert/number/decimal-to-binary.html
	}

	static  void methods(int manuScore, int lekhuScore){
		calcScore(manuScore);
		calcScore(lekhuScore);
	}
//--------------------------------------------------------------------------------------------------------
	static void learn(){
		//short,long,int,double------------------------------------------
		short myShortVar = Short.MIN_VALUE;
		Print.single(myShortVar);

		long myLongVar = Long.SIZE;
		Print.single(myLongVar);

		int myIntVar = Integer.MAX_VALUE;
		Print.single(myIntVar);

		double myDoubleVar = Double.MAX_VALUE;
		Print.single(myDoubleVar);


		//abbreviating operators------------------------------------------
		//(increment, decrement, addition compound assignment, subtraction comp, multi comp, division comp).---
		int plus = 10;
		plus += 3;
		Print.single(plus);

		int minus = 5;
		minus -= 2;
		Print.single(minus);

		double multi = 10;
		multi *= 1.5;
		Print.single(multi);

		double division = 6;
		division /= 2.5;
		Print.single(division);

		//if-then Statement----------------------------------------------------
        //01.-------
		boolean isDonkey = false;
		if (isDonkey){
			Print.single("See that is a Donkey!!!");}
		else{
		Print.single("No!");
		Print.single("That's a Cow!!!!");
		}
        //02-------
		int manuScore = 50; //local variable
		int lekhuScore = 100;
		calcScore(manuScore);
		calcScore(lekhuScore);

		//logical-operators (&&, ||) -------------------------------------------------
		int avgSalary = 9000;
		int employeeOneSalary = 10000;
		int employeeTwoSalary = 8000;

		if ((employeeOneSalary >= avgSalary) && (employeeOneSalary >= employeeTwoSalary)){
			Print.single("Employee one is earning well!!");
		}else {
			Print.single("Employee one is not getting paid enough!!");
		}

		if ((employeeTwoSalary >= avgSalary) || (employeeTwoSalary >= employeeOneSalary)){
			Print.single("Employee two is earning well!!");
		}else {
			Print.single("Employee two is not getting paid enough!!");
		}

        //Ternary-operators( ? : )-------------------------------------------------------

        int currentAge = 15;
		String  ageOfClient = (currentAge >= 18) ? "Over Eighteen" : "Still a kid" ;
		Print.single("Our client is " + ageOfClient );


		//Operator-Precedence///CODING-CHALLENGE///---------------------------------------
		double dobVar = 20.00d;
		double secVar = 80.00d;
		double operationVar = (dobVar + secVar) * 100.00d;
		Print.single(operationVar);

		double theRemainder = (operationVar) % 40.00d;
		Print.single(theRemainder);

     	boolean zeroOrNot = Boolean.parseBoolean((theRemainder == 0) ? "true" : "false");
		Print.single("got some remainder !!");

	}

	static void calcScore(int score ){
		int firstDivision = 100;
		if (score >= firstDivision){
			Print.single("Yes!! I got first division");
		}else {
			Print.single("Ohh No!! I need to study hard :(");
		}
	}

	//===================== MAIN ======================
	public static void main(String[] args)
	{
		 Print.multiple("cvjdfjkvnbjfd", "knfdklnnfg", "kbknkv", "bvfdbvfdbif");
//		learnBoolean();
//		learnNumbers();
//		learnChar();
		learn();
	}
}



