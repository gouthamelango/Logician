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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelFFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelFFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns, handshake;
    Button levelFAns;
    EditText value;
    String answer = "132";


    public LevelFFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelFFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelFFragment newInstance(String param1, String param2) {
        LevelFFragment fragment = new LevelFFragment();
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
        View view = inflater.inflate(R.layout.fragment_level_f, container, false);

        informAns = (ImageView) view.findViewById(R.id.inform);
        handshake = (ImageView) view.findViewById(R.id.handshake);
        levelFAns = (Button) view.findViewById(R.id.submit);
        value = (EditText) view.findViewById(R.id.value);

        levelFAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.getText().toString().equals(answer)){
                    showanswer();
                    levelFAns.setBackgroundColor(Color.GREEN);
                }
                else {
                    new CountDownTimer(500, 1) {
                        public void onTick(long millisUntilFinished) {
                            informAns.setImageResource(R.drawable.wrong_ans);
                            levelFAns.setBackgroundColor(Color.RED);
                        }

                        public void onFinish() {
                            informAns.setImageResource(0);
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
                prefsEditor.putBoolean("levelGLockValue", false);
                prefsEditor.apply();
                ((GameActivity)getActivity()).levelCleared();
            }
        }.start();
    }

}