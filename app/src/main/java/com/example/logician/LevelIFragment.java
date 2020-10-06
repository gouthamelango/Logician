package com.example.logician;

import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelIFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelIFragment extends Fragment implements DatePickerDialog.OnDateSetListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView informAns;
    TextView textView;
    Button button, levelHAns;
    String answer = "144", date, answerdate;


    public LevelIFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelIFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelIFragment newInstance(String param1, String param2) {
        LevelIFragment fragment = new LevelIFragment();
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
        View view = inflater.inflate(R.layout.fragment_level_i, container, false);
        informAns = view.findViewById(R.id.inform);
        textView = view.findViewById(R.id.textView);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatepicker();
            }
        });

        levelHAns = view.findViewById(R.id.submit);
        levelHAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //emptyinput();
                if(answerdate.equals(answer)){
                    levelHAns.setBackgroundColor(Color.GREEN);
                    showanswer();
                }
                else {
                    levelHAns.setBackgroundColor(Color.RED);
                    wronganswer();
                }
            }
        });
        return view;
    }
    private void showDatepicker() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this.getContext(),
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
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
                prefsEditor.putBoolean("levelJLockValue", false);
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
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month = month + 1;
        answerdate = dayOfMonth+""+month;
        date = dayOfMonth+"-"+month+"-"+year;
        textView.setText("Selected Date : "+date);
    }




}