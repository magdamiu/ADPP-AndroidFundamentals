package com.magdamiu.androidfundamentalsseria2.week6.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magdamiu.androidfundamentalsseria2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment {


    public HelloFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }

}
