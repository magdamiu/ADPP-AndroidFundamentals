package com.magdamiu.androidfundamentalsseria2.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsseria2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {

    private TextView mTextViewSum;
    private int mFirstNumber, mSecondNumber;

    public SumFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        initView(view);

        //bundleVersion();

        methodVersion();

        return view;
    }

    private void bundleVersion() {
        Bundle receivedParams = getArguments();
        int firstNumber = receivedParams.getInt(SumActivity.FIRST_NUMBER);
        int secondNumber = receivedParams.getInt(SumActivity.SECOND_NUMBER);
        int sum = firstNumber + secondNumber;
        mTextViewSum.setText("Sum = " + sum);
    }

    private void methodVersion() {
        int sum = mFirstNumber + mSecondNumber;
        mTextViewSum.setText("Sum = " + sum);
    }

    private void initView(View view) {
        mTextViewSum = view.findViewById(R.id.text_view_sum);
    }

    public void setFirstNumber(int firstNumber) {
        mFirstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        mSecondNumber = secondNumber;
    }
}
