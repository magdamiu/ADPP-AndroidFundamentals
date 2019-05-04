package com.magdamiu.androidfundamentalsseria2.week5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsseria2.R;
import com.magdamiu.androidfundamentalsseria2.utils.Logging;


public class LifecycleActivity extends AppCompatActivity {

    private final String TAG = LifecycleActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Logging.show(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logging.show(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logging.show(TAG, "onDestroy");
    }
}
