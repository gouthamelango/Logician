package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SeasonActivity extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout season1,season2,season3,season4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season);

        season1  = (RelativeLayout)findViewById(R.id.layoutSeason1);
        season2  = (RelativeLayout)findViewById(R.id.layoutSeason2);
        season3  = (RelativeLayout)findViewById(R.id.layoutSeason3);
        season4  = (RelativeLayout)findViewById(R.id.layoutSeason4);
        goBack = (ImageView)findViewById(R.id.goBackBtnFromSeasonToHome);
        listener();
    }
    public void listener(){
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent  = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(homeIntent);
            }
        });

        season1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),Season1Levels.class);
                startActivity(season1LevelIntent);
            }
        });
        season2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),Season2Levels.class);
                startActivity(season1LevelIntent);
            }
        });
        season3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),Season3Levels.class);
                startActivity(season1LevelIntent);
            }
        });
        season4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season4LevelIntent  = new Intent(getApplicationContext(),Season4Levels.class);
                startActivity(season4LevelIntent);
            }
        });
    }
}