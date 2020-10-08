package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Season4Levels extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout levelW, levelX, levelY, levelZ;
    ImageView levelWStar1 ,levelWStar2, levelWStar3;
    ImageView levelXStar1 ,levelXStar2, levelXStar3;
    ImageView levelYStar1 ,levelYStar2, levelYStar3;
    ImageView levelZStar1 ,levelZStar2, levelZStar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season4_levels);
        goBack = (ImageView)findViewById(R.id.goBackBtnFromLevelToSeason);

        levelW = (RelativeLayout)findViewById(R.id.layoutSeason4LevelW);
        levelX = (RelativeLayout)findViewById(R.id.layoutSeason4LevelX);
        levelY = (RelativeLayout)findViewById(R.id.layoutSeason4LevelY);
        levelZ = (RelativeLayout)findViewById(R.id.layoutSeason4LevelZ);

        listener();
        getStars();
    }
    public void    getStars(){
        levelWStar1 = findViewById(R.id.levelWStar1);
        levelWStar2 = findViewById(R.id.levelWStar2);
        levelWStar3 = findViewById(R.id.levelWStar3);

        levelXStar1 = findViewById(R.id.levelXStar1);
        levelXStar2 = findViewById(R.id.levelXStar2);
        levelXStar3 = findViewById(R.id.levelXStar3);

        levelYStar1 = findViewById(R.id.levelYStar1);
        levelYStar2 = findViewById(R.id.levelYStar2);
        levelYStar3 = findViewById(R.id.levelYStar3);

        levelZStar1 = findViewById(R.id.levelZStar1);
        levelZStar2 = findViewById(R.id.levelZStar2);
        levelZStar3 = findViewById(R.id.levelZStar3);

        SharedPreferences mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();

        if(!mPrefs.contains("levelWLockValue")){
            prefsEditor.putBoolean("levelWLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelXLockValue")){
            prefsEditor.putBoolean("levelXLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelYLockValue")){
            prefsEditor.putBoolean("levelYLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelZLockValue")){
            prefsEditor.putBoolean("levelZLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        //LEVEL W
        Boolean DataLevelWLock = mPrefs.getBoolean("levelWLockValue",true);
        if(DataLevelWLock){
            levelWStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelW = mPrefs.getString("levelW", "0");

            if (dataLevelW.equals("0")){
                levelWStar1.setImageResource(R.drawable.emptystar);
                levelWStar2.setImageResource(R.drawable.emptystar);
                levelWStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelW.equals("3")){
                levelWStar1.setImageResource(R.drawable.fullstar);
                levelWStar2.setImageResource(R.drawable.fullstar);
                levelWStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelW.equals("2.5")){
                levelWStar1.setImageResource(R.drawable.fullstar);
                levelWStar2.setImageResource(R.drawable.fullstar);
                levelWStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelW.equals("2")){
                levelWStar1.setImageResource(R.drawable.fullstar);
                levelWStar2.setImageResource(R.drawable.fullstar);
                levelWStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelW.equals("1.5")){
                levelWStar1.setImageResource(R.drawable.fullstar);
                levelWStar2.setImageResource(R.drawable.halfstar);
                levelWStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelW.equals("1")){
                levelWStar1.setImageResource(R.drawable.fullstar);
                levelWStar2.setImageResource(R.drawable.emptystar);
                levelWStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL X
        Boolean DataLevelXLock = mPrefs.getBoolean("levelXLockValue",true);
        if(DataLevelXLock){
            levelXStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelX = mPrefs.getString("levelX", "0");

            if (dataLevelX.equals("0")){
                levelXStar1.setImageResource(R.drawable.emptystar);
                levelXStar2.setImageResource(R.drawable.emptystar);
                levelXStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelX.equals("3")){
                levelXStar1.setImageResource(R.drawable.fullstar);
                levelXStar2.setImageResource(R.drawable.fullstar);
                levelXStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelX.equals("2.5")){
                levelXStar1.setImageResource(R.drawable.fullstar);
                levelXStar2.setImageResource(R.drawable.fullstar);
                levelXStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelX.equals("2")){
                levelXStar1.setImageResource(R.drawable.fullstar);
                levelXStar2.setImageResource(R.drawable.fullstar);
                levelXStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelX.equals("1.5")){
                levelXStar1.setImageResource(R.drawable.fullstar);
                levelXStar2.setImageResource(R.drawable.halfstar);
                levelXStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelX.equals("1")){
                levelXStar1.setImageResource(R.drawable.fullstar);
                levelXStar2.setImageResource(R.drawable.emptystar);
                levelXStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL Y
        Boolean DataLevelYLock = mPrefs.getBoolean("levelYLockValue",true);
        if(DataLevelYLock){
            levelYStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelY = mPrefs.getString("levelY", "0");

            if (dataLevelY.equals("0")){
                levelYStar1.setImageResource(R.drawable.emptystar);
                levelYStar2.setImageResource(R.drawable.emptystar);
                levelYStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelY.equals("3")){
                levelYStar1.setImageResource(R.drawable.fullstar);
                levelYStar2.setImageResource(R.drawable.fullstar);
                levelYStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelY.equals("2.5")){
                levelYStar1.setImageResource(R.drawable.fullstar);
                levelYStar2.setImageResource(R.drawable.fullstar);
                levelYStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelY.equals("2")){
                levelYStar1.setImageResource(R.drawable.fullstar);
                levelYStar2.setImageResource(R.drawable.fullstar);
                levelYStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelY.equals("1.5")){
                levelYStar1.setImageResource(R.drawable.fullstar);
                levelYStar2.setImageResource(R.drawable.halfstar);
                levelYStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelY.equals("1")){
                levelYStar1.setImageResource(R.drawable.fullstar);
                levelYStar2.setImageResource(R.drawable.emptystar);
                levelYStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL Z
        Boolean DataLevelZLock = mPrefs.getBoolean("levelZLockValue",true);
        if(DataLevelZLock){
            levelZStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelZ = mPrefs.getString("levelZ", "0");

            if (dataLevelZ.equals("0")){
                levelZStar1.setImageResource(R.drawable.emptystar);
                levelZStar2.setImageResource(R.drawable.emptystar);
                levelZStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelZ.equals("3")){
                levelZStar1.setImageResource(R.drawable.fullstar);
                levelZStar2.setImageResource(R.drawable.fullstar);
                levelZStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelZ.equals("2.5")){
                levelZStar1.setImageResource(R.drawable.fullstar);
                levelZStar2.setImageResource(R.drawable.fullstar);
                levelZStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelZ.equals("2")){
                levelZStar1.setImageResource(R.drawable.fullstar);
                levelZStar2.setImageResource(R.drawable.fullstar);
                levelZStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelZ.equals("1.5")){
                levelZStar1.setImageResource(R.drawable.fullstar);
                levelZStar2.setImageResource(R.drawable.halfstar);
                levelZStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelZ.equals("1")){
                levelZStar1.setImageResource(R.drawable.fullstar);
                levelZStar2.setImageResource(R.drawable.emptystar);
                levelZStar3.setImageResource(R.drawable.emptystar);
            }
        }




    }
    public void   listener(){

        final SharedPreferences  mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(seasonIntent);
            }
        });

        levelW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelWLock = mPrefs.getBoolean("levelWLockValue",true);
                if(!DataLevelWLock) {
                    Intent GamePlayIntent = new Intent(getApplicationContext(), GameActivity.class);
                    GamePlayIntent.putExtra("level", "levelW");
                    startActivity(GamePlayIntent);
                }

            }
        });
        levelX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelXLock = mPrefs.getBoolean("levelXLockValue",true);
                if(!DataLevelXLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelX");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelYLock = mPrefs.getBoolean("levelYLockValue",true);
                if(!DataLevelYLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelY");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelZLock = mPrefs.getBoolean("levelZLockValue",true);
                if(!DataLevelZLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelZ");
                    startActivity(GamePlayIntent);
                }
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Season4Levels.this, SeasonActivity.class));
        finish();

    }

}