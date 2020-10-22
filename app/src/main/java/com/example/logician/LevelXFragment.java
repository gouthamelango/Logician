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
 * Use the {@link LevelXFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelXFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns;
    Button levelXAns, optionA, optionB, optionC;


    public LevelXFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelXFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelXFragment newInstance(String param1, String param2) {
        LevelXFragment fragment = new LevelXFragment();
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
        View view = inflater.inflate(R.layout.fragment_level_x, container, false);

        informAns = view.findViewById(R.id.inform);
        levelXAns = view.findViewById(R.id.submit);
        optionB = view.findViewById(R.id.optionB);
        optionC = view.findViewById(R.id.optionC);
        optionA = view.findViewById(R.id.optionA);
        levelXAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelXAns.setBackgroundColor(Color.GREEN);
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

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionC.setBackgroundColor(Color.RED);
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
                Toast.makeText(getActivity().getApplicationContext(), "You are right. Mid-year exam will not be conducted on the first day of the school year.", Toast.LENGTH_SHORT).show();
               // ((GameActivity)getActivity()).levelCleared();
                SharedPreferences mPrefs = getActivity().getSharedPreferences(GameActivity.MyPREFERENCES, Context.MODE_PRIVATE); //add key
                SharedPreferences.Editor prefsEditor = mPrefs.edit();
                prefsEditor.putBoolean("levelYLockValue", false);
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