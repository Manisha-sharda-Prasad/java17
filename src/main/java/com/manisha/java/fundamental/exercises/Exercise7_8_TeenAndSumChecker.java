package com.manisha.java.fundamental.exercises;

import com.manisha.java.util.Print;

public class Exercise7_8_TeenAndSumChecker
{
public static boolean hasEqualSum(int first, int second, int third){
    boolean result =  first + second == third;
    Print.info("is third == first + second ? ",result);
    return result;

}

public  static  boolean hasTeen(int person1, int person2, int person3){
    //boolean isTeen = false;
    if(person1 >= 13 && person1 <= 19){
        return true;
    }
    else if(person2 >= 13 && person2 <= 19){
        return true;
    }
    else if(person3 >= 13 && person3 <= 19){
        return true;
    }
    else {return  false;}

}
    // --- start here ---

    //  ############## MAIN #############
    public static  void main(String[] args){
     hasEqualSum(1, 1, 3);
     hasEqualSum(1, 2, 3);
     hasEqualSum(1, -1,0);

     Print.info("isTeen ? ",hasTeen(9, 99 ,19));
     Print.info("isTeen ? ",hasTeen(23, 15 ,42));
     Print.info("isTeen ? ",hasTeen(22, 23 ,34));

    }
}


