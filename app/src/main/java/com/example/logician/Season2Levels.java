package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Season2Levels extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout levelG, levelH, levelI, levelJ, levelK, levelL;
    ImageView levelGStar1 ,levelGStar2, levelGStar3;
    ImageView levelHStar1 ,levelHStar2, levelHStar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season2_levels);
        goBack = (ImageView)findViewById(R.id.goBackBtnFromLevelToSeason);

        levelG = (RelativeLayout)findViewById(R.id.layoutSeason2LevelG);
        levelH = (RelativeLayout)findViewById(R.id.layoutSeason2LevelH);
        levelI = (RelativeLayout)findViewById(R.id.layoutSeason2LevelI);
        levelJ = (RelativeLayout)findViewById(R.id.layoutSeason2LevelJ);
        levelK = (RelativeLayout)findViewById(R.id.layoutSeason2LevelK);
        levelL = (RelativeLayout)findViewById(R.id.layoutSeason2LevelL);

        listener();
        getStars();

    }

    public void getStars(){
        levelGStar1 = findViewById(R.id.levelGStar1);
        levelGStar2 = findViewById(R.id.levelGStar2);
        levelGStar3 = findViewById(R.id.levelGStar3);

        levelHStar1 = findViewById(R.id.levelHStar1);
        levelHStar2 = findViewById(R.id.levelHStar2);
        levelHStar3 = findViewById(R.id.levelHStar3);

        SharedPreferences mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();

        if(!mPrefs.contains("levelGLockValue")){
            prefsEditor.putBoolean("levelGLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelHLockValue")){
            prefsEditor.putBoolean("levelHLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        //LEVEL G
        Boolean DataLevelGLock = mPrefs.getBoolean("levelGLockValue",true);
        if(DataLevelGLock){
            levelGStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelG = mPrefs.getString("levelG", "0");

            if (dataLevelG.equals("0")){
                levelGStar1.setImageResource(R.drawable.emptystar);
                levelGStar2.setImageResource(R.drawable.emptystar);
                levelGStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelG.equals("3")){
                levelGStar1.setImageResource(R.drawable.fullstar);
                levelGStar2.setImageResource(R.drawable.fullstar);
                levelGStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelG.equals("2.5")){
                levelGStar1.setImageResource(R.drawable.fullstar);
                levelGStar2.setImageResource(R.drawable.fullstar);
                levelGStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelG.equals("2")){
                levelGStar1.setImageResource(R.drawable.fullstar);
                levelGStar2.setImageResource(R.drawable.fullstar);
                levelGStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelG.equals("1.5")){
                levelGStar1.setImageResource(R.drawable.fullstar);
                levelGStar2.setImageResource(R.drawable.halfstar);
                levelGStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelG.equals("1")){
                levelGStar1.setImageResource(R.drawable.fullstar);
                levelGStar2.setImageResource(R.drawable.emptystar);
                levelGStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL H
        Boolean DataLevelHLock = mPrefs.getBoolean("levelHLockValue",true);
        if(DataLevelHLock){
            levelHStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelH = mPrefs.getString("levelH", "0");

            if (dataLevelH.equals("0")){
                levelHStar1.setImageResource(R.drawable.emptystar);
                levelHStar2.setImageResource(R.drawable.emptystar);
                levelHStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelH.equals("3")){
                levelHStar1.setImageResource(R.drawable.fullstar);
                levelHStar2.setImageResource(R.drawable.fullstar);
                levelHStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelH.equals("2.5")){
                levelHStar1.setImageResource(R.drawable.fullstar);
                levelHStar2.setImageResource(R.drawable.fullstar);
                levelHStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelH.equals("2")){
                levelHStar1.setImageResource(R.drawable.fullstar);
                levelHStar2.setImageResource(R.drawable.fullstar);
                levelHStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelH.equals("1.5")){
                levelHStar1.setImageResource(R.drawable.fullstar);
                levelHStar2.setImageResource(R.drawable.halfstar);
                levelHStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelH.equals("1")){
                levelHStar1.setImageResource(R.drawable.fullstar);
                levelHStar2.setImageResource(R.drawable.emptystar);
                levelHStar3.setImageResource(R.drawable.emptystar);
            }
        }
    }

    public void listener(){
        final SharedPreferences  mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(seasonIntent);
            }
        });
        levelG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelGLock = mPrefs.getBoolean("levelGLockValue",true);
                if(!DataLevelGLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelG");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelHLock = mPrefs.getBoolean("levelHLockValue",true);
                if(!DataLevelHLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelH");
                    startActivity(GamePlayIntent);
                }
            }
        });
    }
}