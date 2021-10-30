package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
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
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void score2(View view) {
        scoreA +=2;
        displayForTeamA(scoreA);
    }

    public void score3(View view) {
        scoreA +=3;
        displayForTeamA(scoreA);
    }

    public void freethrows(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }
    //team B methods
        public void score2B(View view) {
            scoreB +=2;
            displayForTeamB(scoreB);
        }

        public void score3B(View view) {
            scoreB +=3;
            displayForTeamB(scoreB);
        }

        public void freethrowsB(View view) {
            scoreB +=1;
            displayForTeamB(scoreB);
    }
    // RESET button
    public void resetbutton(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}