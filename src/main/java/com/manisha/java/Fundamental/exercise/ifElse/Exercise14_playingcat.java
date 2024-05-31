package com.manisha.java.Fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise14_playingcat {
public static boolean isCatPlaying(boolean summer,int temparature){

    if(summer){
       return  (temparature >= 25 && temparature <= 45)? true : false;
    }
    else {
        return  (temparature >= 25 && temparature <= 35)? true : false;
    }


}

public static void main(String[] args) {
    Print.info(isCatPlaying(true, 30));
    Print.info(isCatPlaying(true, 10));
    Print.info(isCatPlaying(true, 40));

    Print.info(isCatPlaying(false, 36));
    Print.info(isCatPlaying(false, 35));
    Print.info(isCatPlaying(false, 50));

    }
}
