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
    ImageView levelIStar1 ,levelIStar2, levelIStar3;
    ImageView levelJStar1 ,levelJStar2, levelJStar3;
    ImageView levelKStar1 ,levelKStar2, levelKStar3;
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

        levelIStar1 = findViewById(R.id.levelIStar1);
        levelIStar2 = findViewById(R.id.levelIStar2);
        levelIStar3 = findViewById(R.id.levelIStar3);

        levelJStar1 = findViewById(R.id.levelJStar1);
        levelJStar2 = findViewById(R.id.levelJStar2);
        levelJStar3 = findViewById(R.id.levelJStar3);

        levelKStar1 = findViewById(R.id.levelKStar1);
        levelKStar2 = findViewById(R.id.levelKStar2);
        levelKStar3 = findViewById(R.id.levelKStar3);



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
    }
}