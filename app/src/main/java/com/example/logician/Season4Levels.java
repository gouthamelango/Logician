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

                    Intent GamePlayIntent  =  new Intent(getApplicationContext(),GameActivity.class);
                    GamePlayIntent.putExtra("level","levelW");
                    startActivity(GamePlayIntent);

            }
        });

    }

}