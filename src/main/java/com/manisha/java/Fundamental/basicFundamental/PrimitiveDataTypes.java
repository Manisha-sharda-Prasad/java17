package com.manisha.java.Fundamental.basicFundamental;

import com.manisha.java.util.Print;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrimitiveDataTypes { // can have only one public class in one file.
	// A.properties

	// A. property
	//static int topVariable = 100000;

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

	void learnMore(){
		//short,long,int,double------------------------------------------
		short myShortVar = Short.MIN_VALUE;
		Print.info(myShortVar);

		long myLongVar = Long.SIZE;
		Print.info(myLongVar);

		int myIntVar = Integer.MAX_VALUE;
		Print.info(myIntVar);

		double myDoubleVar = Double.MAX_VALUE;
		Print.info(myDoubleVar);
	}


	//  ############## MAIN #############

	public static void main(String[] args)
	{
		learnBoolean();
		learnNumbers();
		learnChar();
	}
}
/*
Number:
	Integer:
 		int, short, byte, long
 	Floating:
 		float, double

boolean

char


** can be interchange using cast and inbuilt methods provided by wrapper class.
 */



