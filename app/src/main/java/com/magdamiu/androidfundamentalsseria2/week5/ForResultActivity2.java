package com.magdamiu.androidfundamentalsseria2.week5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.magdamiu.androidfundamentalsseria2.R;

public class ForResultActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result2);

        getDataFromFirstActivity();
    }

    private void getDataFromFirstActivity() {
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String name = extras.getString(ForResultActivity1.NAME);
            if(!TextUtils.isEmpty(name)){
                name = "Hello, " + name;
                Intent backToFirstActivity = new Intent();
                backToFirstActivity.putExtra(ForResultActivity1.NAME, name);
                setResult(RESULT_OK, backToFirstActivity);
                finish();
            }
        }
    }
}
