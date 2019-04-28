package com.magdamiu.androidfundamentalsseria2.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsseria2.R;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextViewMessageReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle dataReceived = getIntent().getExtras();
        if(dataReceived != null) {
            String message = dataReceived.getString(FirstActivity.MESSAGE);
            //String messageReceived = getIntent().getStringExtra(FirstActivity.MESSAGE);
            mTextViewMessageReceived.setText(message);
        }
    }

    private void initView() {
        mTextViewMessageReceived = findViewById(R.id.text_view_message_received);
    }
}
