package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class Main extends AppCompatActivity {

    TextView mInstructionText;
    Button mRockButton;
    Button mPaperButton;
    Button mScissorsButton;
    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Main", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInstructionText = (TextView) findViewById(R.id.instruction_text);
        mRockButton = (Button) findViewById(R.id.rock_button);
        mPaperButton = (Button) findViewById(R.id.paper_button);
        mScissorsButton = (Button) findViewById(R.id.scissors_button);
        mResultText = (TextView) findViewById(R.id.result_text);

        mRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Main", "Rock button clicked");

            }
        });

        mPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Main", "Paper button clicked");

            }
        });

        mScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Main", "Scissors button clicked");

            }
        });
    }

}
