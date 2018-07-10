package com.engim.svilupposw.profilemanagement.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.engim.svilupposw.profilemanagement.R;

/**
 * Created by elisagiuliano on 20/03/18.
 */

public class HomeActivity extends AppCompatActivity {
    private ImageView goToProfileImage;
    private TextView goToProfileText;
    private ImageView goToDataImage;
    private TextView goToDataText;
    private ImageView goToMapImage;
    private TextView goToMapText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        goToProfileImage = findViewById(R.id.goToProfileImage);
        goToProfileText = findViewById(R.id.goToProfileText);
        goToDataImage = findViewById(R.id.goToDataImage);
        goToDataText = findViewById(R.id.goToDataText);
        goToMapImage = findViewById(R.id.goToMapImage);
        goToMapText = findViewById(R.id.goToMapText);

    }
}
