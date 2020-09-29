package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Season1Levels extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout levelA, levelB, levelC, levelD, levelE, levelF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season1_levels);

        goBack = (ImageView)findViewById(R.id.goBackBtnFromLevelToSeason);

        levelA = (RelativeLayout)findViewById(R.id.layoutSeason1LevelA);
        levelB = (RelativeLayout)findViewById(R.id.layoutSeason1LevelB);
        levelC = (RelativeLayout)findViewById(R.id.layoutSeason1LevelC);
        listener();
    }
    public void listener(){
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(seasonIntent);
            }
        });
        levelA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                GamePlayIntent.putExtra("level","levelA");
                startActivity(GamePlayIntent);
            }
        });
        levelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                GamePlayIntent.putExtra("level","levelB");
                startActivity(GamePlayIntent);
            }
        });
    }
}