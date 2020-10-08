package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class GameActivity extends AppCompatActivity {
    String levelAlpha;
    TextView levelName;
    ImageView exitGame;
    Dialog pauseDialog, scoreCard;
    ImageView pauseGame,restartGame;

    Boolean isPaused = false,isCancelled  = false;
    int myProgress = 0;
    ProgressBar progressBarView;
    private String timeRemaining;
    TextView tv_time;
    CountDownTimer countDownTimer;
    int progress;
    int endTime = 60;

    ImageView s1,s2,s3;

    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_game);
        pauseDialog = new Dialog(this);
        scoreCard = new Dialog(this);
        restartGame =  (ImageView)findViewById(R.id.replaybw) ;
        //Restart Game
        restartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
        //Load Game
        Intent intent = getIntent();
        levelName = (TextView)findViewById(R.id.levelName);
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

            FragmentTransaction levelBFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelBFragment levelBFragment = new LevelBFragment();
            levelBFragmentTransaction.replace(R.id.gameLayoutContainer,levelBFragment);
            levelBFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelC")){

            levelName.setText("Level C");

            FragmentTransaction levelCFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelCFragment levelCFragment = new LevelCFragment();
            levelCFragmentTransaction.replace(R.id.gameLayoutContainer,levelCFragment);
            levelCFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelD")){

            levelName.setText("Level D");

            FragmentTransaction levelDFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelDFragment levelDFragment = new LevelDFragment();
            levelDFragmentTransaction.replace(R.id.gameLayoutContainer,levelDFragment);
            levelDFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelE")){

            levelName.setText("Level E");

            FragmentTransaction levelEFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelEFragment levelEFragment = new LevelEFragment();
            levelEFragmentTransaction.replace(R.id.gameLayoutContainer,levelEFragment);
            levelEFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelF")){

            levelName.setText("Level F");

            FragmentTransaction levelFFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelFFragment levelFFragment = new LevelFFragment();
            levelFFragmentTransaction.replace(R.id.gameLayoutContainer,levelFFragment);
            levelFFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelG")){

            levelName.setText("Level G");

            FragmentTransaction levelGFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelGFragment levelGFragment = new LevelGFragment();
            levelGFragmentTransaction.replace(R.id.gameLayoutContainer,levelGFragment);
            levelGFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelH")){

            levelName.setText("Level H");

            FragmentTransaction levelHFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelHFragment levelHFragment = new LevelHFragment();
            levelHFragmentTransaction.replace(R.id.gameLayoutContainer,levelHFragment);
            levelHFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelI")){

            levelName.setText("Level I");

            FragmentTransaction levelIFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelIFragment levelIFragment = new LevelIFragment();
            levelIFragmentTransaction.replace(R.id.gameLayoutContainer,levelIFragment);
            levelIFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelJ")){

            levelName.setText("Level J");

            FragmentTransaction levelJFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelJFragment levelJFragment = new LevelJFragment();
            levelJFragmentTransaction.replace(R.id.gameLayoutContainer,levelJFragment);
            levelJFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelK")){

            levelName.setText("Level K");

            FragmentTransaction levelKFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelKFragment levelKFragment = new LevelKFragment();
            levelKFragmentTransaction.replace(R.id.gameLayoutContainer,levelKFragment);
            levelKFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelL")){

            levelName.setText("Level L");

            FragmentTransaction levelLFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelLFragment levelLFragment = new LevelLFragment();
            levelLFragmentTransaction.replace(R.id.gameLayoutContainer,levelLFragment);
            levelLFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelM")){

            levelName.setText("Level M");

            FragmentTransaction levelMFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelMFragment levelMFragment = new LevelMFragment();
            levelMFragmentTransaction.replace(R.id.gameLayoutContainer,levelMFragment);
            levelMFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelN")){

            levelName.setText("Level N");

            FragmentTransaction levelNFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelNFragment levelNFragment = new LevelNFragment();
            levelNFragmentTransaction.replace(R.id.gameLayoutContainer,levelNFragment);
            levelNFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelO")){

            levelName.setText("Level O");

            FragmentTransaction levelOFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelOFragment levelOFragment = new LevelOFragment();
            levelOFragmentTransaction.replace(R.id.gameLayoutContainer,levelOFragment);
            levelOFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelP")){

            levelName.setText("Level P");

            FragmentTransaction levelPFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelPFragment levelPFragment = new LevelPFragment();
            levelPFragmentTransaction.replace(R.id.gameLayoutContainer,levelPFragment);
            levelPFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelQ")){

            levelName.setText("Level Q");

            FragmentTransaction levelQFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelQFragment levelQFragment = new LevelQFragment();
            levelQFragmentTransaction.replace(R.id.gameLayoutContainer,levelQFragment);
            levelQFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelR")){

            levelName.setText("Level R");

            FragmentTransaction levelRFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelRFragment levelRFragment = new LevelRFragment();
            levelRFragmentTransaction.replace(R.id.gameLayoutContainer,levelRFragment);
            levelRFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelS")){

            levelName.setText("Level S");

            FragmentTransaction levelSFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelSFragment levelSFragment = new LevelSFragment();
            levelSFragmentTransaction.replace(R.id.gameLayoutContainer,levelSFragment);
            levelSFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelT")){

            levelName.setText("Level T");

            FragmentTransaction levelTFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelTFragment levelTFragment = new LevelTFragment();
            levelTFragmentTransaction.replace(R.id.gameLayoutContainer,levelTFragment);
            levelTFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelU")){

            levelName.setText("Level U");

            FragmentTransaction levelUFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelUFragment levelUFragment = new LevelUFragment();
            levelUFragmentTransaction.replace(R.id.gameLayoutContainer,levelUFragment);
            levelUFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelV")){

            levelName.setText("Level V");

            FragmentTransaction levelVFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelVFragment levelVFragment = new LevelVFragment();
            levelVFragmentTransaction.replace(R.id.gameLayoutContainer,levelVFragment);
            levelVFragmentTransaction.commit();

        }

        if(levelAlpha.equals("levelW")){

            levelName.setText("Level W");

            FragmentTransaction levelWFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelWFragment levelWFragment = new LevelWFragment();
            levelWFragmentTransaction.replace(R.id.gameLayoutContainer,levelWFragment);
            levelWFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelX")){

            levelName.setText("Level X");

            FragmentTransaction levelXFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelXFragment levelXFragment = new LevelXFragment();
            levelXFragmentTransaction.replace(R.id.gameLayoutContainer,levelXFragment);
            levelXFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelY")){

            levelName.setText("Level Y");

            FragmentTransaction levelYFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelYFragment levelYFragment = new LevelYFragment();
            levelYFragmentTransaction.replace(R.id.gameLayoutContainer,levelYFragment);
            levelYFragmentTransaction.commit();

        }
        if(levelAlpha.equals("levelZ")){

            levelName.setText("Level Z");

            FragmentTransaction levelZFragmentTransaction  =getSupportFragmentManager().beginTransaction();
            LevelZFragment levelZFragment = new LevelZFragment();
            levelZFragmentTransaction.replace(R.id.gameLayoutContainer,levelZFragment);
            levelZFragmentTransaction.commit();

        }





        //Pause Game
       pauseGame  =  (ImageView)findViewById(R.id.pauseGamePlay);
        pauseGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView close;
                isPaused = true;
                pauseDialog.setCancelable(false);

                pauseDialog.setContentView(R.layout.pausegame_popup);

                close = (ImageView) pauseDialog.findViewById(R.id.pauseToPlay);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pauseDialog.dismiss();
                        isPaused = false;
                        resume_countdown();
                    }
                });

                ImageView restartBtn;
                restartBtn =  (ImageView)pauseDialog.findViewById(R.id.restart);
                restartBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pauseDialog.dismiss();
                    //    isPaused = false;
                       // fn_countdown();
                        finish();
                        startActivity(getIntent());
                    }
                });

                ImageView returnHomeBtn;
                returnHomeBtn =  (ImageView)pauseDialog.findViewById(R.id.returnHome);
                returnHomeBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent HomeActivityIntent  = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(HomeActivityIntent);
                    }
                });

                pauseDialog.show();
            }
        });

        //Exit Game
        exitGame = (ImageView)findViewById(R.id.exitGamePlay);
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(season1LevelIntent);
            }
        });



        progressBarView = (ProgressBar) findViewById(R.id.view_progress_bar);
        tv_time= (TextView)findViewById(R.id.tv_timer);
        /*Animation*/
        RotateAnimation makeVertical = new RotateAnimation(0, -90, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        makeVertical.setFillAfter(true);
        progressBarView.startAnimation(makeVertical);
        progressBarView.setSecondaryProgress(endTime);
        progressBarView.setProgress(0);

        fn_countdown();


    }


    private void fn_countdown() {
            myProgress = 0;
            String timeInterval = "60";
            progress = 1;
            endTime = Integer.parseInt(timeInterval); // up to finish time
            countDownTimer = new CountDownTimer(endTime * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    if(isPaused||isCancelled){
                        cancel();
                    }
                    else {
                        setProgress(progress, endTime);
                        progress = progress + 1;
                        int seconds = (int) (millisUntilFinished / 1000) % 60;
                       // int minutes = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                        String newtime =String.valueOf(seconds);
                        tv_time.setText(newtime);
                        timeRemaining = String.valueOf(seconds);
                    }
                }
                @Override
                public void onFinish() {
                    setProgress(progress, endTime);
                    timeUp();
                }
            };
            countDownTimer.start();
    }

    private void resume_countdown() {
        String timeInterval = timeRemaining;
        endTime = Integer.parseInt(timeInterval); // up to finish time
        countDownTimer = new CountDownTimer(endTime * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(isPaused){
                    cancel();
                }
                else {
                    setProgress(progress, endTime);
                    progress = progress + 1;
                    int seconds = (int) (millisUntilFinished / 1000) % 60;
                    int minutes = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                    String newtime =String.valueOf(seconds);
                    tv_time.setText(newtime);
                    timeRemaining = String.valueOf(seconds);
                }
            }
            @Override
            public void onFinish() {
                setProgress(progress, endTime);
                timeUp();
            }
        };
        countDownTimer.start();
    }

    public void setProgress(int startTime, int endTime) {
        progressBarView.setMax(endTime);
        progressBarView.setSecondaryProgress(endTime);
        progressBarView.setProgress(startTime);

    }
    public void cancelTimer(){
        isCancelled=true;
    }

    public void timeUp(){
      //  ImageView close;
        scoreCard.setCancelable(false);
        isPaused = true;
        scoreCard.setContentView(R.layout.scorecard_popup);
        s1 = (ImageView)scoreCard.findViewById(R.id.starImg1);
        s2 = (ImageView)scoreCard.findViewById(R.id.starImg2);
        s3 = (ImageView)scoreCard.findViewById(R.id.starImg3);
        int completedTime  = Integer.parseInt(timeRemaining);
        if(completedTime==0){
            s1.setImageResource(R.drawable.emptystar);
            s2.setImageResource(R.drawable.emptystar);
            s3.setImageResource(R.drawable.emptystar);
        }

        TextView popupTitle;
        popupTitle = (TextView)scoreCard.findViewById(R.id.scoreCardTitle);
        popupTitle.setText("Time Up!");

        ImageView timeUpImg;
        timeUpImg = (ImageView)scoreCard.findViewById(R.id.treasureImg);
        timeUpImg.setImageResource(R.drawable.timeup);

        ImageView nextBtn;
        nextBtn =  (ImageView)scoreCard.findViewById(R.id.nextLevel);
        nextBtn.setVisibility(View.INVISIBLE);

        ImageView restartBtn;
        restartBtn =  (ImageView)scoreCard.findViewById(R.id.restart);
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCard.dismiss();
                //isPaused = false;
                //isCancelled = false;
               // fn_countdown();
                finish();
                startActivity(getIntent());
            }
        });

        ImageView returnHomeBtn;
        returnHomeBtn =  (ImageView)scoreCard.findViewById(R.id.returnHome);
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),Season1Levels.class);
                startActivity(season1LevelIntent);
            }
        });

        scoreCard.show();


    }

    private void  storePref(String levelKey,String starsCount){
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        if(!sharedpreferences.contains(levelKey)){
            editor.putString(levelKey, starsCount);
            editor.commit();
           // Toast.makeText(this,"Committed",Toast.LENGTH_LONG).show();
        }
        else {
            editor.putString(levelKey, starsCount);
           // Toast.makeText(this,"Updated",Toast.LENGTH_LONG).show();
            editor.apply();
        }

    }

    public  void levelCleared(){

        String star = "0";
        ImageView close;
        scoreCard.setCancelable(false);
        isPaused = true;
        scoreCard.setContentView(R.layout.scorecard_popup);

        s1 = (ImageView)scoreCard.findViewById(R.id.starImg1);
        s2 = (ImageView)scoreCard.findViewById(R.id.starImg2);
        s3 = (ImageView)scoreCard.findViewById(R.id.starImg3);

        int completedTime  = Integer.parseInt(timeRemaining);
        if(completedTime>=50){
            star = "3";
            s1.setImageResource(R.drawable.fullstar);
            s2.setImageResource(R.drawable.fullstar);
            s3.setImageResource(R.drawable.fullstar);

        }
        if((completedTime>=45)&&(completedTime<50)){
            star = "2.5";
            s1.setImageResource(R.drawable.fullstar);
            s2.setImageResource(R.drawable.fullstar);
            s3.setImageResource(R.drawable.halfstar);

        }
        if((completedTime>=40)&&(completedTime<45)){
            star = "2";
            s1.setImageResource(R.drawable.fullstar);
            s2.setImageResource(R.drawable.fullstar);
            s3.setImageResource(R.drawable.emptystar);
        }
        if((completedTime>=30)&&(completedTime<40)){
            star = "1.5";
            s1.setImageResource(R.drawable.fullstar);
            s2.setImageResource(R.drawable.halfstar);
            s3.setImageResource(R.drawable.emptystar);
        }
        if(completedTime<30){
            star = "1";
            s1.setImageResource(R.drawable.fullstar);
            s2.setImageResource(R.drawable.emptystar);
            s3.setImageResource(R.drawable.emptystar);
        }

        storePref(levelAlpha,star);

        ImageView nextBtn;
        nextBtn =  (ImageView)scoreCard.findViewById(R.id.nextLevel);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(levelAlpha.equals("levelA")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelB");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelB")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelC");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelC")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelD");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelD")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelE");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelE")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelF");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelF")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelG");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelG")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelH");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelH")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelI");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelI")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelJ");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelJ")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelK");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelK")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelL");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelL")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelM");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelM")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelN");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelN")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelO");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelO")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelP");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelP")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelQ");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelQ")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelR");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelR")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelS");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelS")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelT");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelT")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelV");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelV")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelW");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelW")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelX");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelX")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelY");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelY")){
                    Intent intent = new Intent(GameActivity.this, GameActivity.class);
                    intent.putExtra("level","levelZ");
                    startActivity(intent);
                    GameActivity.this.finish();
                }
                if(levelAlpha.equals("levelZ")){
                    Intent intent = new Intent(GameActivity.this, MainActivity.class);
                   // intent.putExtra("level","levelW");
                    startActivity(intent);
                   // GameActivity.this.finish();
                    Toast.makeText(getApplicationContext(),"Version 2.0 Coming Up Soon",Toast.LENGTH_LONG).show();
                }

            }
        });

        ImageView restartBtn;
        restartBtn =  (ImageView)scoreCard.findViewById(R.id.restart);
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCard.dismiss();
             //   isPaused = false;
              //  isCancelled = false;
               // fn_countdown();
                finish();
                startActivity(getIntent());
            }
        });

        ImageView returnHomeBtn;
        returnHomeBtn =  (ImageView)scoreCard.findViewById(R.id.returnHome);
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent season1LevelIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(season1LevelIntent);
            }
        });

       scoreCard.show();

    }




}