package com.manisha.java.FUNDAMENTAL.BasicFundamental;

import com.manisha.java.util.Print;

public class Methods
{
    // ============= game Score exercise =============
    // method-1-------
    static void calcScore(int score ){
        int firstDivision = 100;
        if (score >= firstDivision) Print.info("Yes!! I got first division");
        else Print.info("Ohh No!! I need to study hard :(");
    }
    // method-2-------
    static  int calculateGameScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver == true ) {
            finalScore +=  (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    //  ============================MAIN=================================
    public static void main(String[]agrs)
    {   //calling calcScore-----------
        // methods -1
        int manuScore = 50, lekhuScore = 100;
        calcScore(manuScore);
        calcScore(lekhuScore);


        //calling calculateGameScore-------
        // methods -2
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateGameScore (gameOver, score, levelCompleted, bonus);
        Print.info("The highScore is " + highScore);
        //method -2
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        Print.info("The highScore is " + calculateGameScore (gameOver, score, levelCompleted, bonus));
    }
}
