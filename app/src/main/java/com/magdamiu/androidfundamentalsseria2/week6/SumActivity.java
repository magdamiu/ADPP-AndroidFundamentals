package com.magdamiu.androidfundamentalsseria2.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsseria2.R;

public class SumActivity extends AppCompatActivity {
    public static final String FIRST_NUMBER = "first";
    public static final String SECOND_NUMBER = "second";

    private EditText mEditTextA, mEditTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        initView();
    }

    private void initView() {
        mEditTextA = findViewById(R.id.edit_text_a);
        mEditTextB = findViewById(R.id.edit_text_b);
    }

    public void sumOnClick(View view) {
        int firstNumber = 0;
        int secondNumber = 0;
        if(mEditTextA != null && mEditTextA.getText() != null) {
            firstNumber = Integer.valueOf(mEditTextA.getText().toString());
        }
        if(mEditTextB != null && mEditTextB.getText() != null) {
            secondNumber = Integer.valueOf(mEditTextB.getText().toString());
        }
        Bundle sendParams = new Bundle();
        sendParams.putInt(FIRST_NUMBER, firstNumber);
        sendParams.putInt(SECOND_NUMBER, secondNumber);

        // Bundle
        //sendBundle(sendParams);

        // Method
        sendMethod(firstNumber, secondNumber);

    }

    private void sendBundle(Bundle sendParams) {
        SumFragment sumFragment = new SumFragment();
        sumFragment.setArguments(sendParams);
        replaceFragment(sumFragment);
    }

    private void sendMethod(int firstNumber, int secondNumber) {
        SumFragment sumFragment = new SumFragment();
        sumFragment.setFirstNumber(firstNumber);
        sumFragment.setSecondNumber(secondNumber);
        replaceFragment(sumFragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_fragment_sum, fragment);
        fragmentTransaction.commit();
    }
}
