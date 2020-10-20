package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Dialog settingsDialog;
    ImageView startGameBtn;
    ImageView exitGame;
    Boolean isMusicPlaying;
    Intent svc;
    SharedPreferences mPrefs ; //add key
    SharedPreferences.Editor prefsEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);
        settingsDialog = new Dialog(this);
        startGameBtn = (ImageView) findViewById(R.id.startGame);
        exitGame = (ImageView)findViewById(R.id.exit_game);

        mPrefs = getSharedPreferences(GameActivity.MyPREFERENCES, Context.MODE_PRIVATE); //add key
        prefsEditor = mPrefs.edit();

        if(!mPrefs.contains("isMusicAllowed")){
            prefsEditor.putBoolean("isMusicAllowed", true);
            prefsEditor.commit();
        }
        isMusicPlaying = mPrefs.getBoolean("isMusicAllowed",false);
        listener();
        svc=new Intent(this, BackgroundSoundService.class);
        if(isMusicPlaying){
            startService(svc);
        }
    }
    public void listener(){
        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(seasonIntent);
            }
        });
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Exit Game");
                alertDialog.setMessage("Are you sure you want to exit?");
                alertDialog.setCancelable(false);
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                stopService(svc);
                                startActivity(intent);
                            }
                        });

                alertDialog.show();
            }
        });

    }
    public  void  showSettingsPopup(View v){
        ImageView close;
        RelativeLayout musicBtn;
        final TextView musicText;

        settingsDialog.setContentView(R.layout.settings_popup);
        close = settingsDialog.findViewById(R.id.txtClose);

        musicBtn = (RelativeLayout)settingsDialog.findViewById(R.id.settingsLayoutBtn1);
        musicText = (TextView)settingsDialog.findViewById(R.id.musicSettings);
        if(isMusicPlaying){
            musicText.setText("Music Off");
        }
        else {
            musicText.setText("Music On");
        }
        musicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isMusicPlaying){
                    prefsEditor.putBoolean("isMusicAllowed", false);
                    prefsEditor.apply();
                    isMusicPlaying = mPrefs.getBoolean("isMusicAllowed",false);
                    musicText.setText("Music On");
                    stopService(svc);
                }
                else {
                    prefsEditor.putBoolean("isMusicAllowed", true);
                    prefsEditor.apply();
                    isMusicPlaying = mPrefs.getBoolean("isMusicAllowed",true);
                    musicText.setText("Music Off");
                    startService(svc);

                }

            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsDialog.dismiss();
            }
        });
        settingsDialog.show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        stopService(svc);
        startActivity(intent);


    }

    @Override
    protected void onResume() {
        super.onResume();
        startService(svc);
    }
}