package com.manisha.java.Fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise1_HighScore {

//Methods//if/else---------------------------------------------------------------------------------------

    //1---------------------
    static int calcHighScorePosition(int score){
    int result = 0;
     if (score >= 1500 && score > 1000){
         result = 1;
     } else if (score >= 500 && score <= 1000) {
         result = 2;
     } else if (score >= 100){
         result = 3;
     }else{
         result = 4;
     }
         return result;
    }
    //2---------------------
    static  void displayHighScorePosition( String playerName, int score){
        int position = calcHighScorePosition(score);
        Print.info(playerName + " managed to get into position " + position + " on the high score list");
    }
    //3----------------------
    static  void checkingScores(){
     displayHighScorePosition("Tim" ,1500 );
     displayHighScorePosition("Lek" ,1000 );
     displayHighScorePosition("Manu" ,400 );

    }

// ======================MAIN========================
    public static  void main(String[]args){
        checkingScores();

    }

}


