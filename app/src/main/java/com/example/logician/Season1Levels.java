package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Season1Levels extends AppCompatActivity {
    ImageView goBack;
    RelativeLayout levelA, levelB, levelC, levelD, levelE, levelF;
    ImageView levelAStar1 ,levelAStar2, levelAStar3;
    ImageView levelBStar1 ,levelBStar2, levelBStar3;
    ImageView levelCStar1 ,levelCStar2, levelCStar3;
    ImageView levelDStar1 ,levelDStar2, levelDStar3;
    ImageView levelEStar1 ,levelEStar2, levelEStar3;
    ImageView levelFStar1 ,levelFStar2, levelFStar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_season1_levels);

        goBack = (ImageView)findViewById(R.id.goBackBtnFromLevelToSeason);

        levelA = (RelativeLayout)findViewById(R.id.layoutSeason1LevelA);
        levelB = (RelativeLayout)findViewById(R.id.layoutSeason1LevelB);
        levelC = (RelativeLayout)findViewById(R.id.layoutSeason1LevelC);
        levelD = (RelativeLayout)findViewById(R.id.layoutSeason1LevelD);
        levelE = (RelativeLayout)findViewById(R.id.layoutSeason1LevelE);
        levelF = (RelativeLayout)findViewById(R.id.layoutSeason1LevelF);
        listener();
        getStars();

    }

    public void getStars(){
        levelAStar1 = findViewById(R.id.levelAStar1);
        levelAStar2 = findViewById(R.id.levelAStar2);
        levelAStar3 = findViewById(R.id.levelAStar3);

        levelBStar1 = findViewById(R.id.levelBStar1);
        levelBStar2 = findViewById(R.id.levelBStar2);
        levelBStar3 = findViewById(R.id.levelBStar3);

        levelCStar1 = findViewById(R.id.levelCStar1);
        levelCStar2 = findViewById(R.id.levelCStar2);
        levelCStar3 = findViewById(R.id.levelCStar3);

        levelDStar1 = findViewById(R.id.levelDStar1);
        levelDStar2 = findViewById(R.id.levelDStar2);
        levelDStar3 = findViewById(R.id.levelDStar3);

        levelEStar1 = findViewById(R.id.levelEStar1);
        levelEStar2 = findViewById(R.id.levelEStar2);
        levelEStar3 = findViewById(R.id.levelEStar3);

        levelFStar1 = findViewById(R.id.levelFStar1);
        levelFStar2 = findViewById(R.id.levelFStar2);
        levelFStar3 = findViewById(R.id.levelFStar3);

        SharedPreferences mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, MODE_PRIVATE); //add key
        SharedPreferences.Editor prefsEditor = mPrefs.edit();

        if(!mPrefs.contains("levelALockValue")){
           prefsEditor.putBoolean("levelALockValue", false);
           prefsEditor.commit();
          //  Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        if(!mPrefs.contains("levelBLockValue")){
            prefsEditor.putBoolean("levelBLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelCLockValue")){
            prefsEditor.putBoolean("levelCLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelDLockValue")){
            prefsEditor.putBoolean("levelDLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        if(!mPrefs.contains("levelELockValue")){
            prefsEditor.putBoolean("levelELockValue", true);
            prefsEditor.commit();
           // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }

        if(!mPrefs.contains("levelFLockValue")){
            prefsEditor.putBoolean("levelFLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }


        String dataLevelA = mPrefs.getString("levelA", "0");
        if (dataLevelA.equals("0")){
            levelAStar1.setImageResource(R.drawable.emptystar);
            levelAStar2.setImageResource(R.drawable.emptystar);
            levelAStar3.setImageResource(R.drawable.emptystar);
        }
        if (dataLevelA.equals("3")){
            levelAStar1.setImageResource(R.drawable.fullstar);
            levelAStar2.setImageResource(R.drawable.fullstar);
            levelAStar3.setImageResource(R.drawable.fullstar);
        }
        else if (dataLevelA.equals("2.5")){
            levelAStar1.setImageResource(R.drawable.fullstar);
            levelAStar2.setImageResource(R.drawable.fullstar);
            levelAStar3.setImageResource(R.drawable.halfstar);

        }
        else if (dataLevelA.equals("2")){
            levelAStar1.setImageResource(R.drawable.fullstar);
            levelAStar2.setImageResource(R.drawable.fullstar);
            levelAStar3.setImageResource(R.drawable.emptystar);

        }
        else if (dataLevelA.equals("1.5")){
            levelAStar1.setImageResource(R.drawable.fullstar);
            levelAStar2.setImageResource(R.drawable.halfstar);
            levelAStar3.setImageResource(R.drawable.emptystar);

        }
        else if (dataLevelA.equals("1")){
            levelAStar1.setImageResource(R.drawable.fullstar);
            levelAStar2.setImageResource(R.drawable.emptystar);
            levelAStar3.setImageResource(R.drawable.emptystar);
        }

        //LEVEL B
        Boolean DataLevelBLock = mPrefs.getBoolean("levelBLockValue",true);
        if(DataLevelBLock){
            levelBStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelB = mPrefs.getString("levelB", "0");

            if (dataLevelB.equals("0")){
                levelBStar1.setImageResource(R.drawable.emptystar);
                levelBStar2.setImageResource(R.drawable.emptystar);
                levelBStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelB.equals("3")){
                levelBStar1.setImageResource(R.drawable.fullstar);
                levelBStar2.setImageResource(R.drawable.fullstar);
                levelBStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelB.equals("2.5")){
                levelBStar1.setImageResource(R.drawable.fullstar);
                levelBStar2.setImageResource(R.drawable.fullstar);
                levelBStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelB.equals("2")){
                levelBStar1.setImageResource(R.drawable.fullstar);
                levelBStar2.setImageResource(R.drawable.fullstar);
                levelBStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelB.equals("1.5")){
                levelBStar1.setImageResource(R.drawable.fullstar);
                levelBStar2.setImageResource(R.drawable.halfstar);
                levelBStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelB.equals("1")){
                levelBStar1.setImageResource(R.drawable.fullstar);
                levelBStar2.setImageResource(R.drawable.emptystar);
                levelBStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL C
        Boolean DataLevelCLock = mPrefs.getBoolean("levelCLockValue",true);
        if(DataLevelCLock){
            levelCStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelC = mPrefs.getString("levelC", "0");

            if (dataLevelC.equals("0")){
                levelCStar1.setImageResource(R.drawable.emptystar);
                levelCStar2.setImageResource(R.drawable.emptystar);
                levelCStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelC.equals("3")){
                levelCStar1.setImageResource(R.drawable.fullstar);
                levelCStar2.setImageResource(R.drawable.fullstar);
                levelCStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelC.equals("2.5")){
                levelCStar1.setImageResource(R.drawable.fullstar);
                levelCStar2.setImageResource(R.drawable.fullstar);
                levelCStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelC.equals("2")){
                levelCStar1.setImageResource(R.drawable.fullstar);
                levelCStar2.setImageResource(R.drawable.fullstar);
                levelCStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelC.equals("1.5")){
                levelCStar1.setImageResource(R.drawable.fullstar);
                levelCStar2.setImageResource(R.drawable.halfstar);
                levelCStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelC.equals("1")){
                levelCStar1.setImageResource(R.drawable.fullstar);
                levelCStar2.setImageResource(R.drawable.emptystar);
                levelCStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL D
        Boolean DataLevelDLock = mPrefs.getBoolean("levelDLockValue",true);
        if(DataLevelDLock){
            levelDStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelD = mPrefs.getString("levelD", "0");

            if (dataLevelD.equals("0")){
                levelDStar1.setImageResource(R.drawable.emptystar);
                levelDStar2.setImageResource(R.drawable.emptystar);
                levelDStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelD.equals("3")){
                levelDStar1.setImageResource(R.drawable.fullstar);
                levelDStar2.setImageResource(R.drawable.fullstar);
                levelDStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelD.equals("2.5")){
                levelDStar1.setImageResource(R.drawable.fullstar);
                levelDStar2.setImageResource(R.drawable.fullstar);
                levelDStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelD.equals("2")){
                levelDStar1.setImageResource(R.drawable.fullstar);
                levelDStar2.setImageResource(R.drawable.fullstar);
                levelDStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelD.equals("1.5")){
                levelDStar1.setImageResource(R.drawable.fullstar);
                levelDStar2.setImageResource(R.drawable.halfstar);
                levelDStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelD.equals("1")){
                levelDStar1.setImageResource(R.drawable.fullstar);
                levelDStar2.setImageResource(R.drawable.emptystar);
                levelDStar3.setImageResource(R.drawable.emptystar);
            }
        }


        //LEVEL E
        Boolean DataLevelELock = mPrefs.getBoolean("levelELockValue",true);
        if(DataLevelELock){
            levelEStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelE = mPrefs.getString("levelE", "0");

            if (dataLevelE.equals("0")){
                levelEStar1.setImageResource(R.drawable.emptystar);
                levelEStar2.setImageResource(R.drawable.emptystar);
                levelEStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelE.equals("3")){
                levelEStar1.setImageResource(R.drawable.fullstar);
                levelEStar2.setImageResource(R.drawable.fullstar);
                levelEStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelE.equals("2.5")){
                levelEStar1.setImageResource(R.drawable.fullstar);
                levelEStar2.setImageResource(R.drawable.fullstar);
                levelEStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelE.equals("2")){
                levelEStar1.setImageResource(R.drawable.fullstar);
                levelEStar2.setImageResource(R.drawable.fullstar);
                levelEStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelE.equals("1.5")){
                levelEStar1.setImageResource(R.drawable.fullstar);
                levelEStar2.setImageResource(R.drawable.halfstar);
                levelEStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelE.equals("1")){
                levelEStar1.setImageResource(R.drawable.fullstar);
                levelEStar2.setImageResource(R.drawable.emptystar);
                levelEStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL F
        Boolean DataLevelFLock = mPrefs.getBoolean("levelFLockValue",true);
        if(DataLevelFLock){
            levelFStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelF = mPrefs.getString("levelF", "0");

            if (dataLevelF.equals("0")){
                levelFStar1.setImageResource(R.drawable.emptystar);
                levelFStar2.setImageResource(R.drawable.emptystar);
                levelFStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelF.equals("3")){
                levelFStar1.setImageResource(R.drawable.fullstar);
                levelFStar2.setImageResource(R.drawable.fullstar);
                levelFStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelF.equals("2.5")){
                levelFStar1.setImageResource(R.drawable.fullstar);
                levelFStar2.setImageResource(R.drawable.fullstar);
                levelFStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelF.equals("2")){
                levelFStar1.setImageResource(R.drawable.fullstar);
                levelFStar2.setImageResource(R.drawable.fullstar);
                levelFStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelF.equals("1.5")){
                levelFStar1.setImageResource(R.drawable.fullstar);
                levelFStar2.setImageResource(R.drawable.halfstar);
                levelFStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelF.equals("1")){
                levelFStar1.setImageResource(R.drawable.fullstar);
                levelFStar2.setImageResource(R.drawable.emptystar);
                levelFStar3.setImageResource(R.drawable.emptystar);
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
                Boolean DataLevelELock = mPrefs.getBoolean("levelBLockValue",true);
                if(!DataLevelELock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelB");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelELock = mPrefs.getBoolean("levelCLockValue",true);
                if(!DataLevelELock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelC");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelELock = mPrefs.getBoolean("levelDLockValue",true);
                if(!DataLevelELock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelD");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelELock = mPrefs.getBoolean("levelELockValue",true);
                if(!DataLevelELock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelE");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelFLock = mPrefs.getBoolean("levelFLockValue",true);
                if(!DataLevelFLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelF");
                    startActivity(GamePlayIntent);
                }
            }
        });
    }
}