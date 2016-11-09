package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

    private String mPlayerMove;
    private String mComputerMove;
    private String[] mPlays;

    public Game(String playerMove){
        this.mPlays = new String[3];
        setUpPlays();
        this.mPlayerMove = playerMove;
        this.mComputerMove = new String();
    }

    public void setUpPlays(){
        mPlays[0] = "rock";
        mPlays[1] = "paper";
        mPlays[2] = "scissors";
    }

    private void computerMove() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(3);
        mComputerMove = mPlays[randomIndex];
    }

    public String winChecker(){
        computerMove();
        if (mPlayerMove == mComputerMove) {return "It's a tie!";}
         else if (
            mPlayerMove == "rock" && mComputerMove == "scissors" ||
            mPlayerMove == "paper" && mComputerMove == "rock" ||
            mPlayerMove == "scissors" && mComputerMove == "paper")
        {return "You win!";}
         else {return "Computer wins. Play again.";}
    }



    //method to record the player choice

    //call a method to get a random play for the computer

    //method to compare moves and decide a winner
}
