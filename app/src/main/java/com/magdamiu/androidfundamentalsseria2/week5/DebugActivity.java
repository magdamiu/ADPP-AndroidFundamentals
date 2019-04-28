package com.magdamiu.androidfundamentalsseria2.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsseria2.R;

public class DebugActivity extends AppCompatActivity {

    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        initView();
    }

    private void initView() {
        mSwitch = findViewById(R.id.switch1);
    }

    public void displayStatusSwitchOnClick(View view) {
        String message = "";
        if (mSwitch.isChecked()) {
            message = "Switch is on";
        } else {
            message = "Switch is off";
        }
        Toast.makeText(DebugActivity.this, message,
                Toast.LENGTH_LONG).show();
    }
}
