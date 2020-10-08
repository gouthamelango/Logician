package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Season3Levels extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout levelQ, levelR, levelS, levelT, levelU, levelV;
    ImageView levelQStar1 ,levelQStar2, levelQStar3;
    ImageView levelRStar1 ,levelRStar2, levelRStar3;
    ImageView levelSStar1 ,levelSStar2, levelSStar3;
    ImageView levelTStar1 ,levelTStar2, levelTStar3;
    ImageView levelUStar1 ,levelUStar2, levelUStar3;
    ImageView levelVStar1 ,levelVStar2, levelVStar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season3_levels);

        goBack = (ImageView)findViewById(R.id.goBackBtnFromLevelToSeason);

        levelQ = (RelativeLayout)findViewById(R.id.layoutSeason3LevelQ);
        levelR = (RelativeLayout)findViewById(R.id.layoutSeason3LevelR);
        levelS = (RelativeLayout)findViewById(R.id.layoutSeason3LevelS);
        levelT = (RelativeLayout)findViewById(R.id.layoutSeason3LevelT);
        levelU = (RelativeLayout)findViewById(R.id.layoutSeason3LevelU);
        levelV = (RelativeLayout)findViewById(R.id.layoutSeason3LevelV);

        listener();
        getStars();
    }
    public void getStars(){
        levelQStar1 = findViewById(R.id.levelQStar1);
        levelQStar2 = findViewById(R.id.levelQStar2);
        levelQStar3 = findViewById(R.id.levelQStar3);

        levelRStar1 = findViewById(R.id.levelRStar1);
        levelRStar2 = findViewById(R.id.levelRStar2);
        levelRStar3 = findViewById(R.id.levelRStar3);

        levelSStar1 = findViewById(R.id.levelSStar1);
        levelSStar2 = findViewById(R.id.levelSStar2);
        levelSStar3 = findViewById(R.id.levelSStar3);

        levelTStar1 = findViewById(R.id.levelTStar1);
        levelTStar2 = findViewById(R.id.levelTStar2);
        levelTStar3 = findViewById(R.id.levelTStar3);

        levelUStar1 = findViewById(R.id.levelUStar1);
        levelUStar2 = findViewById(R.id.levelUStar2);
        levelUStar3 = findViewById(R.id.levelUStar3);

        levelVStar1 = findViewById(R.id.levelVStar1);
        levelVStar2 = findViewById(R.id.levelVStar2);
        levelVStar3 = findViewById(R.id.levelVStar3);


        SharedPreferences mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();

        if(!mPrefs.contains("levelQLockValue")){
            prefsEditor.putBoolean("levelQLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelRLockValue")){
            prefsEditor.putBoolean("levelRLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelSLockValue")){
            prefsEditor.putBoolean("levelSLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelTLockValue")){
            prefsEditor.putBoolean("levelTLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelULockValue")){
            prefsEditor.putBoolean("levelULockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelVLockValue")){
            prefsEditor.putBoolean("levelVLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        //LEVEL Q
        Boolean DataLevelQLock = mPrefs.getBoolean("levelQLockValue",true);
        if(DataLevelQLock){
            levelQStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelQ = mPrefs.getString("levelQ", "0");

            if (dataLevelQ.equals("0")){
                levelQStar1.setImageResource(R.drawable.emptystar);
                levelQStar2.setImageResource(R.drawable.emptystar);
                levelQStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelQ.equals("3")){
                levelQStar1.setImageResource(R.drawable.fullstar);
                levelQStar2.setImageResource(R.drawable.fullstar);
                levelQStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelQ.equals("2.5")){
                levelQStar1.setImageResource(R.drawable.fullstar);
                levelQStar2.setImageResource(R.drawable.fullstar);
                levelQStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelQ.equals("2")){
                levelQStar1.setImageResource(R.drawable.fullstar);
                levelQStar2.setImageResource(R.drawable.fullstar);
                levelQStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelQ.equals("1.5")){
                levelQStar1.setImageResource(R.drawable.fullstar);
                levelQStar2.setImageResource(R.drawable.halfstar);
                levelQStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelQ.equals("1")){
                levelQStar1.setImageResource(R.drawable.fullstar);
                levelQStar2.setImageResource(R.drawable.emptystar);
                levelQStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL R
        Boolean DataLevelRLock = mPrefs.getBoolean("levelRLockValue",true);
        if(DataLevelRLock){
            levelRStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelR = mPrefs.getString("levelR", "0");

            if (dataLevelR.equals("0")){
                levelRStar1.setImageResource(R.drawable.emptystar);
                levelRStar2.setImageResource(R.drawable.emptystar);
                levelRStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelR.equals("3")){
                levelRStar1.setImageResource(R.drawable.fullstar);
                levelRStar2.setImageResource(R.drawable.fullstar);
                levelRStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelR.equals("2.5")){
                levelRStar1.setImageResource(R.drawable.fullstar);
                levelRStar2.setImageResource(R.drawable.fullstar);
                levelRStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelR.equals("2")){
                levelRStar1.setImageResource(R.drawable.fullstar);
                levelRStar2.setImageResource(R.drawable.fullstar);
                levelRStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelR.equals("1.5")){
                levelRStar1.setImageResource(R.drawable.fullstar);
                levelRStar2.setImageResource(R.drawable.halfstar);
                levelRStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelR.equals("1")){
                levelRStar1.setImageResource(R.drawable.fullstar);
                levelRStar2.setImageResource(R.drawable.emptystar);
                levelRStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL S
        Boolean DataLevelSLock = mPrefs.getBoolean("levelSLockValue",true);
        if(DataLevelSLock){
            levelSStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelS = mPrefs.getString("levelS", "0");

            if (dataLevelS.equals("0")){
                levelSStar1.setImageResource(R.drawable.emptystar);
                levelSStar2.setImageResource(R.drawable.emptystar);
                levelSStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelS.equals("3")){
                levelSStar1.setImageResource(R.drawable.fullstar);
                levelSStar2.setImageResource(R.drawable.fullstar);
                levelSStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelS.equals("2.5")){
                levelSStar1.setImageResource(R.drawable.fullstar);
                levelSStar2.setImageResource(R.drawable.fullstar);
                levelSStar3.setImageResource(R.drawable.halfstar);
            }
            else if (dataLevelS.equals("2")){
                levelSStar1.setImageResource(R.drawable.fullstar);
                levelSStar2.setImageResource(R.drawable.fullstar);
                levelSStar3.setImageResource(R.drawable.emptystar);
            }
            else if (dataLevelS.equals("1.5")){
                levelSStar1.setImageResource(R.drawable.fullstar);
                levelSStar2.setImageResource(R.drawable.halfstar);
                levelSStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelS.equals("1")){
                levelSStar1.setImageResource(R.drawable.fullstar);
                levelSStar2.setImageResource(R.drawable.emptystar);
                levelSStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL T
        Boolean DataLevelTLock = mPrefs.getBoolean("levelTLockValue",true);
        if(DataLevelTLock){
            levelTStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelT = mPrefs.getString("levelT", "0");

            if (dataLevelT.equals("0")){
                levelTStar1.setImageResource(R.drawable.emptystar);
                levelTStar2.setImageResource(R.drawable.emptystar);
                levelTStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelT.equals("3")){
                levelTStar1.setImageResource(R.drawable.fullstar);
                levelTStar2.setImageResource(R.drawable.fullstar);
                levelTStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelT.equals("2.5")){
                levelTStar1.setImageResource(R.drawable.fullstar);
                levelTStar2.setImageResource(R.drawable.fullstar);
                levelTStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelT.equals("2")){
                levelTStar1.setImageResource(R.drawable.fullstar);
                levelTStar2.setImageResource(R.drawable.fullstar);
                levelTStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelT.equals("1.5")){
                levelTStar1.setImageResource(R.drawable.fullstar);
                levelTStar2.setImageResource(R.drawable.halfstar);
                levelTStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelT.equals("1")){
                levelTStar1.setImageResource(R.drawable.fullstar);
                levelTStar2.setImageResource(R.drawable.emptystar);
                levelTStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL U
        Boolean DataLevelULock = mPrefs.getBoolean("levelULockValue",true);
        if(DataLevelULock){
            levelUStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelU = mPrefs.getString("levelU", "0");

            if (dataLevelU.equals("0")){
                levelUStar1.setImageResource(R.drawable.emptystar);
                levelUStar2.setImageResource(R.drawable.emptystar);
                levelUStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelU.equals("3")){
                levelUStar1.setImageResource(R.drawable.fullstar);
                levelUStar2.setImageResource(R.drawable.fullstar);
                levelUStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelU.equals("2.5")){
                levelUStar1.setImageResource(R.drawable.fullstar);
                levelUStar2.setImageResource(R.drawable.fullstar);
                levelUStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelU.equals("2")){
                levelUStar1.setImageResource(R.drawable.fullstar);
                levelUStar2.setImageResource(R.drawable.fullstar);
                levelUStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelU.equals("1.5")){
                levelUStar1.setImageResource(R.drawable.fullstar);
                levelUStar2.setImageResource(R.drawable.halfstar);
                levelUStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelU.equals("1")){
                levelUStar1.setImageResource(R.drawable.fullstar);
                levelUStar2.setImageResource(R.drawable.emptystar);
                levelUStar3.setImageResource(R.drawable.emptystar);
            }
        }
        //LEVEL V
        Boolean DataLevelVLock = mPrefs.getBoolean("levelVLockValue",true);
        if(DataLevelVLock){
            levelVStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelV = mPrefs.getString("levelV", "0");

            if (dataLevelV.equals("0")){
                levelVStar1.setImageResource(R.drawable.emptystar);
                levelVStar2.setImageResource(R.drawable.emptystar);
                levelVStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelV.equals("3")){
                levelVStar1.setImageResource(R.drawable.fullstar);
                levelVStar2.setImageResource(R.drawable.fullstar);
                levelVStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelV.equals("2.5")){
                levelVStar1.setImageResource(R.drawable.fullstar);
                levelVStar2.setImageResource(R.drawable.fullstar);
                levelVStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelV.equals("2")){
                levelVStar1.setImageResource(R.drawable.fullstar);
                levelVStar2.setImageResource(R.drawable.fullstar);
                levelVStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelV.equals("1.5")){
                levelVStar1.setImageResource(R.drawable.fullstar);
                levelVStar2.setImageResource(R.drawable.halfstar);
                levelVStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelV.equals("1")){
                levelVStar1.setImageResource(R.drawable.fullstar);
                levelVStar2.setImageResource(R.drawable.emptystar);
                levelVStar3.setImageResource(R.drawable.emptystar);
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
        levelQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelQLock = mPrefs.getBoolean("levelQLockValue",true);
                if(!DataLevelQLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelQ");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelRLock = mPrefs.getBoolean("levelRLockValue",true);
                if(!DataLevelRLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelR");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelSLock = mPrefs.getBoolean("levelSLockValue",true);
                if(!DataLevelSLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelS");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelTLock = mPrefs.getBoolean("levelTLockValue",true);
                if(!DataLevelTLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelT");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelULock = mPrefs.getBoolean("levelULockValue",true);
                if(!DataLevelULock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelU");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelVLock = mPrefs.getBoolean("levelVLockValue",true);
                if(!DataLevelVLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelV");
                    startActivity(GamePlayIntent);
                }
            }
        });


    }
}