package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    String levelAlpha;
    TextView levelName;
    ImageView exitGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        levelName = (TextView)findViewById(R.id.levelName);

        exitGame = (ImageView)findViewById(R.id.exitGamePlay);
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),Season1Levels.class);
                startActivity(season1LevelIntent);
            }
        });

        if(intent.hasExtra("level"))
        {
           levelAlpha  = getIntent().getExtras().getString("level");

        }
        if(levelAlpha.equals("levelA")){

            levelName.setText("Level A");

            FragmentTransaction levelAFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelAFragment levelAFragment = new LevelAFragment();
            levelAFragmentTransaction.replace(R.id.gameLayoutContainer,levelAFragment);
            levelAFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelB")){

            levelName.setText("Level B");

           /* FragmentTransaction levelAFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelAFragment levelAFragment = new LevelAFragment();
            levelAFragmentTransaction.replace(R.id.gameLayoutContainer,levelAFragment);
            levelAFragmentTransaction.commit();*/

        }

    }
}