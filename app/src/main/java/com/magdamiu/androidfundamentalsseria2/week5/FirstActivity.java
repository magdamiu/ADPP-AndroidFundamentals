package com.magdamiu.androidfundamentalsseria2.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsseria2.R;

public class FirstActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";

    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();
    }

    private void initView() {
        mEditTextMessage = findViewById(R.id.edit_text_message);
    }

    public void startSecondActivityOnClick(View view) {
        Intent goToSecondActivity = new Intent(FirstActivity.this,
                SecondActivity.class);
        startActivity(goToSecondActivity);
    }

    public void callImplicitIntentOnClick(View view) {
        Intent callAction = new Intent(Intent.ACTION_DIAL);
        callAction.setData(Uri.parse("tel:0777777777"));
        if (callAction.resolveActivity(getPackageManager()) != null) {
            startActivity(callAction);
        }
    }

    public void sendMessageOnClick(View view) {
        if (mEditTextMessage != null && mEditTextMessage.getText() != null) {
            String message = mEditTextMessage.getText().toString();
            if(!TextUtils.isEmpty(message)) {
                Intent sendMessage = new Intent(FirstActivity.this,
                        SecondActivity.class);
                sendMessage.putExtra(MESSAGE, message);
                startActivity(sendMessage);
            }
        }
    }

    public void btnStartActivityOnClick(View view) {
        Intent newIntent = new Intent(FirstActivity.this, ForResultActivity1.class);
        startActivity(newIntent);
    }

    public void startDebugActivityOnClick(View view) {
        Intent newIntent = new Intent(FirstActivity.this,
                DebugActivity.class);
        startActivity(newIntent);
    }
}
