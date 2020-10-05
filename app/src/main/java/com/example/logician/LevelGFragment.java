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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelGFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelGFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns, clock;
    Button levelGAns;
    EditText value;
    String answer = "1729";

    public LevelGFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelGFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelGFragment newInstance(String param1, String param2) {
        LevelGFragment fragment = new LevelGFragment();
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
        View view = inflater.inflate(R.layout.fragment_level_g, container, false);
        informAns = (ImageView) view.findViewById(R.id.inform);
        clock = (ImageView) view.findViewById(R.id.clock);
        levelGAns = (Button) view.findViewById(R.id.submit);
        value = (EditText) view.findViewById(R.id.value);

        levelGAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.getText().toString().equals(answer)){
                    showanswer();
                    levelGAns.setBackgroundColor(Color.GREEN);
                    Toast.makeText(getActivity().getApplicationContext(), "1729 is said to be the magic number because it is the sole number which can be expressed as the sum of the cubes of two different sets of numbers. For example: (10 3)^3 + (9 3)^3 = 1729", Toast.LENGTH_LONG).show();
                }
                else {
                    new CountDownTimer(500, 1) {
                        public void onTick(long millisUntilFinished) {
                            informAns.setImageResource(R.drawable.wrong_ans);
                            levelGAns.setBackgroundColor(Color.RED);
                        }

                        public void onFinish() {
                            informAns.setImageResource(0);
                            Toast.makeText(getActivity().getApplicationContext(), "Incorrect Answer. Try again!", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
                }
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
                SharedPreferences mPrefs = getActivity().getSharedPreferences(GameActivity.MyPREFERENCES, Context.MODE_PRIVATE); //add key
                SharedPreferences.Editor prefsEditor = mPrefs.edit();
                prefsEditor.putBoolean("levelHLockValue", false);
                prefsEditor.apply();
                ((GameActivity)getActivity()).levelCleared();
            }
        }.start();
    }

}