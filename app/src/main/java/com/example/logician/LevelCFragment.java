package com.example.logician;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LevelCFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LevelCFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView informAns, shelf, levelCAns;

    public LevelCFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LevelCFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LevelCFragment newInstance(String param1, String param2) {
        LevelCFragment fragment = new LevelCFragment();
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
        View view = inflater.inflate(R.layout.fragment_level_c, container, false);
        informAns = view.findViewById(R.id.inform);
        shelf = view.findViewById(R.id.shelf);
        levelCAns = view.findViewById(R.id.racecar);

        levelCAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GameActivity)getActivity()).cancelTimer();
                new CountDownTimer(2000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        informAns.setImageResource(R.drawable.correct);
                    }

                    public void onFinish() {
                        informAns.setImageResource(0);
                        ((GameActivity)getActivity()).levelCleared();
                    }
                }.start();
            }
        });

        shelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(500, 1) {

                    public void onTick(long millisUntilFinished) {
                        informAns.setImageResource(R.drawable.wrong_ans);
                    }

                    public void onFinish() {
                        informAns.setImageResource(0);
                    }
                }.start();
            }
        });

        return view;
    }
}