package com.example.logician;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog settingsDialog;
    ImageView startGameBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);
        settingsDialog = new Dialog(this);
        startGameBtn = (ImageView) findViewById(R.id.startGame);

        listener();
    }
    public void listener(){
        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seasonIntent  = new Intent(getApplicationContext(),SeasonActivity.class);
                startActivity(seasonIntent);
            }
        });
    }
    public  void  showSettingsPopup(View v){
        TextView close;
        settingsDialog.setContentView(R.layout.settings_popup);
        close = (TextView)settingsDialog.findViewById(R.id.txtclose);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsDialog.dismiss();
            }
        });
        settingsDialog.show();
    }
}