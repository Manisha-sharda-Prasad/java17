package com.manisha.java.fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise1_HighScore {

//Methods//if/else---------------------------------------------------------------------------------------

static  void displayHighScorePosition( String playerName, int score){
    int position = calcHighScorePosition(score);
    Print.info(playerName + " managed to get into position " + position + " on the high score list");
}

static int calcHighScorePosition(int score){
    int result = 0;
     if (score >= 1000){
         result = 1;
     } else if (score >= 500 ) {
         result = 2;
     } else if (score >= 100 ){
         result = 3;
     }else{
         result = 4;
     }
         return result;
}

 static  void checkingScores(){

    displayHighScorePosition("Tim" ,1500 );
    displayHighScorePosition("Lek" ,500 );
}

   // ======================MAIN========================
    public static  void main(String[]args){
        checkingScores();
    }

}


