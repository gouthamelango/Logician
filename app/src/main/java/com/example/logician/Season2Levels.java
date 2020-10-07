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
    RelativeLayout levelG, levelH, levelI, levelJ, levelK, levelL,levelM,levelN,levelO,levelP;
    ImageView levelGStar1 ,levelGStar2, levelGStar3;
    ImageView levelHStar1 ,levelHStar2, levelHStar3;
    ImageView levelIStar1 ,levelIStar2, levelIStar3;
    ImageView levelJStar1 ,levelJStar2, levelJStar3;
    ImageView levelKStar1 ,levelKStar2, levelKStar3;
    ImageView levelLStar1 ,levelLStar2, levelLStar3;
    ImageView levelMStar1 ,levelMStar2, levelMStar3;
    ImageView levelNStar1 ,levelNStar2, levelNStar3;
    ImageView levelOStar1 ,levelOStar2, levelOStar3;
    ImageView levelPStar1 ,levelPStar2, levelPStar3;
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
        levelM = (RelativeLayout)findViewById(R.id.layoutSeason2LevelM);
        levelN = (RelativeLayout)findViewById(R.id.layoutSeason2LevelN);
        levelO = (RelativeLayout)findViewById(R.id.layoutSeason2LevelO);
        levelP = (RelativeLayout)findViewById(R.id.layoutSeason2LevelP);

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

        levelIStar1 = findViewById(R.id.levelIStar1);
        levelIStar2 = findViewById(R.id.levelIStar2);
        levelIStar3 = findViewById(R.id.levelIStar3);

        levelJStar1 = findViewById(R.id.levelJStar1);
        levelJStar2 = findViewById(R.id.levelJStar2);
        levelJStar3 = findViewById(R.id.levelJStar3);

        levelKStar1 = findViewById(R.id.levelKStar1);
        levelKStar2 = findViewById(R.id.levelKStar2);
        levelKStar3 = findViewById(R.id.levelKStar3);

        levelLStar1 = findViewById(R.id.levelLStar1);
        levelLStar2 = findViewById(R.id.levelLStar2);
        levelLStar3 = findViewById(R.id.levelLStar3);

        levelMStar1 = findViewById(R.id.levelMStar1);
        levelMStar2 = findViewById(R.id.levelMStar2);
        levelMStar3 = findViewById(R.id.levelMStar3);

        levelNStar1 = findViewById(R.id.levelNStar1);
        levelNStar2 = findViewById(R.id.levelNStar2);
        levelNStar3 = findViewById(R.id.levelNStar3);

        levelOStar1 = findViewById(R.id.levelOStar1);
        levelOStar2 = findViewById(R.id.levelOStar2);
        levelOStar3 = findViewById(R.id.levelOStar3);

        levelPStar1 = findViewById(R.id.levelPStar1);
        levelPStar2 = findViewById(R.id.levelPStar2);
        levelPStar3 = findViewById(R.id.levelPStar3);


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
        if(!mPrefs.contains("levelILockValue")){
            prefsEditor.putBoolean("levelILockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelJLockValue")){
            prefsEditor.putBoolean("levelJLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelKLockValue")){
            prefsEditor.putBoolean("levelKLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelLLockValue")){
            prefsEditor.putBoolean("levelLLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelMLockValue")){
            prefsEditor.putBoolean("levelMLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelNLockValue")){
            prefsEditor.putBoolean("levelNLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelOLockValue")){
            prefsEditor.putBoolean("levelOLockValue", true);
            prefsEditor.commit();
            // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        if(!mPrefs.contains("levelPLockValue")){
            prefsEditor.putBoolean("levelPLockValue", true);
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
        //LEVEL I
        Boolean DataLevelILock = mPrefs.getBoolean("levelILockValue",true);
        if(DataLevelILock){
            levelIStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelI = mPrefs.getString("levelI", "0");

            if (dataLevelI.equals("0")){
                levelIStar1.setImageResource(R.drawable.emptystar);
                levelIStar2.setImageResource(R.drawable.emptystar);
                levelIStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelI.equals("3")){
                levelIStar1.setImageResource(R.drawable.fullstar);
                levelIStar2.setImageResource(R.drawable.fullstar);
                levelIStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelI.equals("2.5")){
                levelIStar1.setImageResource(R.drawable.fullstar);
                levelIStar2.setImageResource(R.drawable.fullstar);
                levelIStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelI.equals("2")){
                levelIStar1.setImageResource(R.drawable.fullstar);
                levelIStar2.setImageResource(R.drawable.fullstar);
                levelIStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelI.equals("1.5")){
                levelIStar1.setImageResource(R.drawable.fullstar);
                levelIStar2.setImageResource(R.drawable.halfstar);
                levelIStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelI.equals("1")){
                levelIStar1.setImageResource(R.drawable.fullstar);
                levelIStar2.setImageResource(R.drawable.emptystar);
                levelIStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL J
        Boolean DataLevelJLock = mPrefs.getBoolean("levelJLockValue",true);
        if(DataLevelJLock){
            levelJStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelJ = mPrefs.getString("levelJ", "0");

            if (dataLevelJ.equals("0")){
                levelJStar1.setImageResource(R.drawable.emptystar);
                levelJStar2.setImageResource(R.drawable.emptystar);
                levelJStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelJ.equals("3")){
                levelJStar1.setImageResource(R.drawable.fullstar);
                levelJStar2.setImageResource(R.drawable.fullstar);
                levelJStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelJ.equals("2.5")){
                levelJStar1.setImageResource(R.drawable.fullstar);
                levelJStar2.setImageResource(R.drawable.fullstar);
                levelJStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelJ.equals("2")){
                levelJStar1.setImageResource(R.drawable.fullstar);
                levelJStar2.setImageResource(R.drawable.fullstar);
                levelJStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelJ.equals("1.5")){
                levelJStar1.setImageResource(R.drawable.fullstar);
                levelJStar2.setImageResource(R.drawable.halfstar);
                levelJStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelJ.equals("1")){
                levelJStar1.setImageResource(R.drawable.fullstar);
                levelJStar2.setImageResource(R.drawable.emptystar);
                levelJStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL K
        Boolean DataLevelKLock = mPrefs.getBoolean("levelKLockValue",true);
        if(DataLevelKLock){
            levelKStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelK = mPrefs.getString("levelK", "0");

            if (dataLevelK.equals("0")){
                levelKStar1.setImageResource(R.drawable.emptystar);
                levelKStar2.setImageResource(R.drawable.emptystar);
                levelKStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelK.equals("3")){
                levelKStar1.setImageResource(R.drawable.fullstar);
                levelKStar2.setImageResource(R.drawable.fullstar);
                levelKStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelK.equals("2.5")){
                levelKStar1.setImageResource(R.drawable.fullstar);
                levelKStar2.setImageResource(R.drawable.fullstar);
                levelKStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelK.equals("2")){
                levelKStar1.setImageResource(R.drawable.fullstar);
                levelKStar2.setImageResource(R.drawable.fullstar);
                levelKStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelK.equals("1.5")){
                levelKStar1.setImageResource(R.drawable.fullstar);
                levelKStar2.setImageResource(R.drawable.halfstar);
                levelKStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelK.equals("1")){
                levelKStar1.setImageResource(R.drawable.fullstar);
                levelKStar2.setImageResource(R.drawable.emptystar);
                levelKStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL L
        Boolean DataLevelLLock = mPrefs.getBoolean("levelLLockValue",true);
        if(DataLevelLLock){
            levelLStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelL = mPrefs.getString("levelL", "0");

            if (dataLevelL.equals("0")){
                levelLStar1.setImageResource(R.drawable.emptystar);
                levelLStar2.setImageResource(R.drawable.emptystar);
                levelLStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelL.equals("3")){
                levelLStar1.setImageResource(R.drawable.fullstar);
                levelLStar2.setImageResource(R.drawable.fullstar);
                levelLStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelL.equals("2.5")){
                levelLStar1.setImageResource(R.drawable.fullstar);
                levelLStar2.setImageResource(R.drawable.fullstar);
                levelLStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelL.equals("2")){
                levelLStar1.setImageResource(R.drawable.fullstar);
                levelLStar2.setImageResource(R.drawable.fullstar);
                levelLStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelL.equals("1.5")){
                levelLStar1.setImageResource(R.drawable.fullstar);
                levelLStar2.setImageResource(R.drawable.halfstar);
                levelLStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelL.equals("1")){
                levelLStar1.setImageResource(R.drawable.fullstar);
                levelLStar2.setImageResource(R.drawable.emptystar);
                levelLStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL M
        Boolean DataLevelMLock = mPrefs.getBoolean("levelMLockValue",true);
        if(DataLevelMLock){
            levelMStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelM = mPrefs.getString("levelM", "0");

            if (dataLevelM.equals("0")){
                levelMStar1.setImageResource(R.drawable.emptystar);
                levelMStar2.setImageResource(R.drawable.emptystar);
                levelMStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelM.equals("3")){
                levelMStar1.setImageResource(R.drawable.fullstar);
                levelMStar2.setImageResource(R.drawable.fullstar);
                levelMStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelM.equals("2.5")){
                levelMStar1.setImageResource(R.drawable.fullstar);
                levelMStar2.setImageResource(R.drawable.fullstar);
                levelMStar3.setImageResource(R.drawable.halfstar);

            }
            else if (dataLevelM.equals("2")){
                levelMStar1.setImageResource(R.drawable.fullstar);
                levelMStar2.setImageResource(R.drawable.fullstar);
                levelMStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelM.equals("1.5")){
                levelMStar1.setImageResource(R.drawable.fullstar);
                levelMStar2.setImageResource(R.drawable.halfstar);
                levelMStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelM.equals("1")){
                levelMStar1.setImageResource(R.drawable.fullstar);
                levelMStar2.setImageResource(R.drawable.emptystar);
                levelMStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL N
        Boolean DataLevelNLock = mPrefs.getBoolean("levelNLockValue",true);
        if(DataLevelNLock){
            levelNStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelN = mPrefs.getString("levelN", "0");

            if (dataLevelN.equals("0")){
                levelNStar1.setImageResource(R.drawable.emptystar);
                levelNStar2.setImageResource(R.drawable.emptystar);
                levelNStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelN.equals("3")){
                levelNStar1.setImageResource(R.drawable.fullstar);
                levelNStar2.setImageResource(R.drawable.fullstar);
                levelNStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelN.equals("2.5")){
                levelNStar1.setImageResource(R.drawable.fullstar);
                levelNStar2.setImageResource(R.drawable.fullstar);
                levelNStar3.setImageResource(R.drawable.halfstar);
            }
            else if (dataLevelN.equals("2")){
                levelNStar1.setImageResource(R.drawable.fullstar);
                levelNStar2.setImageResource(R.drawable.fullstar);
                levelNStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelN.equals("1.5")){
                levelNStar1.setImageResource(R.drawable.fullstar);
                levelNStar2.setImageResource(R.drawable.halfstar);
                levelNStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelN.equals("1")){
                levelNStar1.setImageResource(R.drawable.fullstar);
                levelNStar2.setImageResource(R.drawable.emptystar);
                levelNStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL O
        Boolean DataLevelOLock = mPrefs.getBoolean("levelOLockValue",true);
        if(DataLevelOLock){
            levelOStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelO = mPrefs.getString("levelO", "0");

            if (dataLevelO.equals("0")){
                levelOStar1.setImageResource(R.drawable.emptystar);
                levelOStar2.setImageResource(R.drawable.emptystar);
                levelOStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelO.equals("3")){
                levelOStar1.setImageResource(R.drawable.fullstar);
                levelOStar2.setImageResource(R.drawable.fullstar);
                levelOStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelO.equals("2.5")){
                levelOStar1.setImageResource(R.drawable.fullstar);
                levelOStar2.setImageResource(R.drawable.fullstar);
                levelOStar3.setImageResource(R.drawable.halfstar);
            }
            else if (dataLevelO.equals("2")){
                levelOStar1.setImageResource(R.drawable.fullstar);
                levelOStar2.setImageResource(R.drawable.fullstar);
                levelOStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelO.equals("1.5")){
                levelOStar1.setImageResource(R.drawable.fullstar);
                levelOStar2.setImageResource(R.drawable.halfstar);
                levelOStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelO.equals("1")){
                levelOStar1.setImageResource(R.drawable.fullstar);
                levelOStar2.setImageResource(R.drawable.emptystar);
                levelOStar3.setImageResource(R.drawable.emptystar);
            }
        }

        //LEVEL P
        Boolean DataLevelPLock = mPrefs.getBoolean("levelPLockValue",true);
        if(DataLevelPLock){
            levelPStar2.setImageResource(R.drawable.lock);
        }
        else {
            String dataLevelP = mPrefs.getString("levelP", "0");

            if (dataLevelP.equals("0")){
                levelPStar1.setImageResource(R.drawable.emptystar);
                levelPStar2.setImageResource(R.drawable.emptystar);
                levelPStar3.setImageResource(R.drawable.emptystar);
            }

            else if (dataLevelP.equals("3")){
                levelPStar1.setImageResource(R.drawable.fullstar);
                levelPStar2.setImageResource(R.drawable.fullstar);
                levelPStar3.setImageResource(R.drawable.fullstar);
            }
            else if (dataLevelP.equals("2.5")){
                levelPStar1.setImageResource(R.drawable.fullstar);
                levelPStar2.setImageResource(R.drawable.fullstar);
                levelPStar3.setImageResource(R.drawable.halfstar);
            }
            else if (dataLevelP.equals("2")){
                levelPStar1.setImageResource(R.drawable.fullstar);
                levelPStar2.setImageResource(R.drawable.fullstar);
                levelPStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelP.equals("1.5")){
                levelPStar1.setImageResource(R.drawable.fullstar);
                levelPStar2.setImageResource(R.drawable.halfstar);
                levelPStar3.setImageResource(R.drawable.emptystar);

            }
            else if (dataLevelP.equals("1")){
                levelPStar1.setImageResource(R.drawable.fullstar);
                levelPStar2.setImageResource(R.drawable.emptystar);
                levelPStar3.setImageResource(R.drawable.emptystar);
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
        levelI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelILock = mPrefs.getBoolean("levelILockValue",true);
                if(!DataLevelILock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelI");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelJLock = mPrefs.getBoolean("levelJLockValue",true);
                if(!DataLevelJLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelJ");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelKLock = mPrefs.getBoolean("levelKLockValue",true);
                if(!DataLevelKLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelK");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelLLock = mPrefs.getBoolean("levelLLockValue",true);
                if(!DataLevelLLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelL");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelMLock = mPrefs.getBoolean("levelMLockValue",true);
                if(!DataLevelMLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelM");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelNLock = mPrefs.getBoolean("levelNLockValue",true);
                if(!DataLevelNLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelN");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelOLock = mPrefs.getBoolean("levelOLockValue",true);
                if(!DataLevelOLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelO");
                    startActivity(GamePlayIntent);
                }
            }
        });
        levelP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean DataLevelPLock = mPrefs.getBoolean("levelPLockValue",true);
                if(!DataLevelPLock){
                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelP");
                    startActivity(GamePlayIntent);
                }
            }
        });
    }
}