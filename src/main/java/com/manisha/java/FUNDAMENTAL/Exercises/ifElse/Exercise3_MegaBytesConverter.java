package com.manisha.java.FUNDAMENTAL.Exercises.ifElse;

import com.manisha.java.util.Print;

public class Exercise3_MegaBytesConverter
{
    // --- start here ---

      public static void  printMegaBytesAndKiloBytes(int kiloBytes){ //2050
          // 1 MB = 1024 KB--
          int megaBytes = kiloBytes / 1024; // 2050/2 = 2
          int remainder = kiloBytes % 1024; // give remainder - % modulus operator

          if (kiloBytes < 0) {
              Print.info("Invalid Value");
          }
          else{
              Print.info( kiloBytes + " KB = "+ megaBytes  + " MB and " + remainder + " KB");
          }
      }


    //  ############## MAIN #############
    public static  void main(String[] args){
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(2122);
    }
}


