package com.magdamiu.androidfundamentalsseria2.week6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsseria2.R;

public class LengthActivity extends AppCompatActivity implements LengthListener{

    private TextView mTextViewLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        initView();

        replaceFragment(new LengthFragment());
    }

    private void initView() {
        mTextViewLength = findViewById(R.id.text_view_length);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_fragment_length, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void displayLength(String str) {
        mTextViewLength.setText("Length = " + str.length());
    }
}
