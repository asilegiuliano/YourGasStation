package com.engim.svilupposw.profilemanagement.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.engim.svilupposw.profilemanagement.R;

/**
 * Created by elisagiuliano on 10/07/18.
 */

public class WelcomeActivity extends AppCompatActivity {

    // creo il launcher iniziale e setto il tempo
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // launcher iniziale intent
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
