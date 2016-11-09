package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

    private String mPlayerMove;
    private String mComputerMove;
    private String[] mPlays;

    public Game(){
        this.mPlays = new String[3];
        setUpPlays();
        this.mPlayerMove = new String();
        this.mComputerMove = new String();
    }

    public void setUpPlays(){
        mPlays[0] = "Rock";
        mPlays[1] = "Paper";
        mPlays[2] = "Scissors";
    }

    public String computerMove() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(3);
        mComputerMove = mPlays[randomIndex];
        return mComputerMove;
    }



    //method to record the player choice

    //call a method to get a random play for the computer

    //method to compare moves and decide a winner
}
