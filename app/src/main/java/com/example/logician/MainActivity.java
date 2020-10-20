package com.example.logician;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {
    Dialog settingsDialog;
    ImageView startGameBtn;
    ImageView exitGame;
    ImageView signIn;
    Boolean isMusicPlaying;
    Intent svc;
    SharedPreferences mPrefs ; //add key
    SharedPreferences.Editor prefsEditor;
    GoogleSignInClient mGoogleSignInClient;
    private static int RC_SIGN_IN =100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);
        settingsDialog = new Dialog(this);
        startGameBtn = (ImageView) findViewById(R.id.startGame);
        exitGame = (ImageView)findViewById(R.id.exit_game);
        signIn = (ImageView)findViewById(R.id.game_signIn);
        settingsDialog.setContentView(R.layout.settings_popup);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        // Check for existing Google Sign In account, if the user is already signed in
// the GoogleSignInAccount will be non-null.
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(isSignedIn()){
            signIn.setVisibility(View.GONE);
        }
        else {
            signIn.setVisibility(View.VISIBLE);
        }

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isSignedIn()){
                    Toast.makeText(getApplicationContext(),"Already Signed In",Toast.LENGTH_SHORT).show();
                }else {
                    signIn();
                }

            }
        });


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
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private boolean isSignedIn() {
        return GoogleSignIn.getLastSignedInAccount(this) != null;
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            if (acct != null) {
                String personName = acct.getDisplayName();
                String personGivenName = acct.getGivenName();
                String personFamilyName = acct.getFamilyName();
                String personEmail = acct.getEmail();
                String personId = acct.getId();
                Uri personPhoto = acct.getPhotoUrl();
                signIn.setVisibility(View.GONE);
               TextView userName = (TextView)settingsDialog.findViewById(R.id.LeaderBoardSettings);
               userName.setText(acct.getDisplayName());
                TextView signSettings = (TextView)settingsDialog.findViewById(R.id.signInSettings);
                signSettings.setText("Sign Out");


                Toast.makeText(getApplicationContext(),"Account Signed In",Toast.LENGTH_SHORT).show();
            }

            // Signed in successfully, show authenticated UI.
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.d("signInResult:failed" ,e.toString());

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
        RelativeLayout musicBtn, accBtn;
        final TextView musicText;
        final TextView usename;
        final TextView signSettings;
        signSettings = (TextView)settingsDialog.findViewById(R.id.signInSettings);


        close = settingsDialog.findViewById(R.id.txtClose);
        usename = (TextView)settingsDialog.findViewById(R.id.LeaderBoardSettings);


        if(isSignedIn()){
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            usename.setText(acct.getDisplayName());
            signSettings.setText("Sign Out");
        }
        else {
            signSettings.setText("Sign In");
        }

        accBtn = (RelativeLayout)settingsDialog.findViewById(R.id.settingsLayoutBtn2);
        accBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isSignedIn()){
                   signOut();

                }
                else {
                    signIn();
                }
            }
        });

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
    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(getApplicationContext(),"Account Signed Out",Toast.LENGTH_SHORT).show();
                        final TextView signSettings;
                        TextView username;
                        signSettings = (TextView)settingsDialog.findViewById(R.id.signInSettings);
                        signSettings.setText("Sign In");
                        username = (TextView)settingsDialog.findViewById(R.id.LeaderBoardSettings);
                        username.setText("Guest");
                        signIn.setVisibility(View.VISIBLE);
                    }
                });
    }
}