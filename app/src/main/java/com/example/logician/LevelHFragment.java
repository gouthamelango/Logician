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
 * Use the {@link LevelHFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelHFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns, eldest;
    Button levelHAns, optionA, optionC, optionD;


    public LevelHFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelHFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelHFragment newInstance(String param1, String param2) {
        LevelHFragment fragment = new LevelHFragment();
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
        View view =inflater.inflate(R.layout.fragment_level_h, container, false);
        informAns = view.findViewById(R.id.inform);
        eldest = view.findViewById(R.id.clock);
        levelHAns = view.findViewById(R.id.submit);
        optionA = view.findViewById(R.id.optionA);
        optionC = view.findViewById(R.id.optionC);
        optionD = view.findViewById(R.id.optionD);

        levelHAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelHAns.setBackgroundColor(Color.GREEN);
                showanswer();
            }
        });

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionA.setBackgroundColor(Color.RED);
                wronganswer();
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionC.setBackgroundColor(Color.RED);
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

        return view;
    }
    public void showanswer(){
        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
                informAns.setImageResource(R.drawable.correct);
            }

            public void onFinish() {
                informAns.setImageResource(0);
                Toast.makeText(getActivity().getApplicationContext(), "If the first two statements are true, Eric is the youngest of the three, so Eric is incorrect.", Toast.LENGTH_LONG).show();
                SharedPreferences mPrefs = getActivity().getSharedPreferences(GameActivity.MyPREFERENCES, Context.MODE_PRIVATE); //add key
                SharedPreferences.Editor prefsEditor = mPrefs.edit();
                prefsEditor.putBoolean("levelILockValue", false);
                prefsEditor.apply();
                ((GameActivity)getActivity()).levelCleared();
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