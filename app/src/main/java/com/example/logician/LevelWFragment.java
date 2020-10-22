package com.example.logician;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelWFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelWFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns;
    Button levelWAns, optionA, optionB, optionD;


    public LevelWFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelWFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelWFragment newInstance(String param1, String param2) {
        LevelWFragment fragment = new LevelWFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_level_w, container, false);
        informAns = view.findViewById(R.id.inform);
        levelWAns = view.findViewById(R.id.submit);
        optionB = view.findViewById(R.id.optionB);
        optionD = view.findViewById(R.id.optionD);
        optionA = view.findViewById(R.id.optionA);

        levelWAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelWAns.setBackgroundColor(Color.GREEN);
                showanswer();
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionB.setBackgroundColor(Color.RED);
                wronganswer();
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionD.setBackgroundColor(Color.RED);
                wronganswer();
            }
        });

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionA.setBackgroundColor(Color.RED);
                wronganswer();
            }
        });


        return view;
    }
    public void showanswer(){
        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
                informAns.setImageResource(R.drawable.correct);
            }

            public void onFinish() {
                informAns.setImageResource(0);
                Toast.makeText(getActivity().getApplicationContext(), "Uncle George is the killer because it was a Sunday and mail is not delivered on Sunday.", Toast.LENGTH_LONG).show();
                ((GameActivity)getActivity()).levelCleared();
                SharedPreferences mPrefs = getActivity().getSharedPreferences(GameActivity.MyPREFERENCES, Context.MODE_PRIVATE); //add key
                SharedPreferences.Editor prefsEditor = mPrefs.edit();
                prefsEditor.putBoolean("levelXLockValue", false);
                prefsEditor.apply();
                //((GameActivity)getActivity()).levelCleared();
            }
        }.start();
    }

    public void wronganswer(){
        new CountDownTimer(500, 1) {
            public void onTick(long millisUntilFinished) {
                informAns.setImageResource(R.drawable.wrong_ans);
            }

            public void onFinish() {
                informAns.setImageResource(0);

                Toast.makeText(getActivity().getApplicationContext(), "Incorrect Answer. Try again!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }

}