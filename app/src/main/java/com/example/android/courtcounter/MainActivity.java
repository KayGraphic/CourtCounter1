package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThree(View view) {


        score = score + 3;


        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + score);

    }


    public void plusTwo(View view) {
        score = score + 2;


        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + score);

    }

    public void freeThrow(View view) {
        displayForTeamA(score = score + 5);


        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + score);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void plusThreeb(View view) {


        scoreb = scoreb + 3;


        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + scoreb);

    }


    public void plusTwob(View view) {
        scoreb = scoreb + 2;


        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + scoreb);

    }

    public void freeThrowb(View view) {
        displayForTeamB(scoreb = scoreb + 5);


        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + scoreb);

    }

    public void calculate(View view) {
        int winner = 0;
        if (score < scoreb) {
            winner = 2;

        } else if (score > scoreb)
            winner = 1;
        TextView finalscore = (TextView) findViewById(R.id.FinalScoreText);
        finalscore.setText("Team A is #" + winner);

    }


}
