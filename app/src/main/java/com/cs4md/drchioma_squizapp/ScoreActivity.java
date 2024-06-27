package com.cs4md.drchioma_squizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    // declaring variables
    TextView scoreTV;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTV = (TextView) findViewById(R.id.scorenumber);
        score = 0;

        // retrieving the "int extra" (i.e. score) we put into the intent
        // when we started this activity
        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);

        // inflating UI element variables


        //concatenating the string score with the numerical score
        scoreTV.setText("" + score);

    }
}