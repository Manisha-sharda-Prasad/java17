package com.manisha.java.fundamental;

import com.manisha.java.util.Print;

public class Methods
{
    // ============= game Score excercise =============
    // method-1
    static void calcScore(int score ){
        int firstDivision = 100;
        if (score >= firstDivision) Print.info("Yes!! I got first division");
        else Print.info("Ohh No!! I need to study hard :(");
    }
    // method-2
    static  int calculateGameScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver == true ) {
            finalScore +=  (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    //  ############## MAIN #############
    public static void main(String... agrs)
    {
        // Test methods -1
        int manuScore = 50, lekhuScore = 100;
        calcScore(manuScore); // calling method - 1
        calcScore(lekhuScore); // calling method - 1

        // Test methods -2
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateGameScore (gameOver, score, levelCompleted, bonus); // calling method -2
        Print.info("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        Print.info("The highScore is " + calculateGameScore (gameOver, score, levelCompleted, bonus)); // calling method -2
    }
}
