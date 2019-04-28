package com.magdamiu.androidfundamentalsseria2.week5;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsseria2.R;

public class ForResultActivity1 extends AppCompatActivity {
    public static final String NAME = "name";
    public static final int FIRST_ACTIVITY = 7;

    public static final String INPUT_VALUE = "edittext";
    public static final String CHECKBOX_VALUE = "checkbox";

    private EditText mEditTextName;
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result1);

        initView();
    }

    private void initView() {
        mEditTextName = findViewById(R.id.edit_text_name);
        mCheckBox = findViewById(R.id.checkBox);
    }

    public void sendNameToSecondActivityOnClick(View view) {
        if (mEditTextName != null && mEditTextName.getText() != null) {
            String name = mEditTextName.getText().toString();
            if (!TextUtils.isEmpty(name)) {
                Intent startSecondActivity = new Intent(ForResultActivity1.this,
                        ForResultActivity2.class);
                startSecondActivity.putExtra(NAME, name);
                startActivityForResult(startSecondActivity, FIRST_ACTIVITY);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FIRST_ACTIVITY && resultCode == RESULT_OK) {
            if (data != null) {
                String name = data.getStringExtra(NAME);
                mEditTextName.setText(name);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mEditTextName != null && mEditTextName.getText() != null) {
            outState.putString(INPUT_VALUE, mEditTextName.getText().toString());
        }
        if (mCheckBox != null) {
            outState.putBoolean(CHECKBOX_VALUE, mCheckBox.isChecked());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            String inputValue = savedInstanceState.getString(INPUT_VALUE);
            Boolean checkboxValue = savedInstanceState.getBoolean(CHECKBOX_VALUE);
            if (mEditTextName != null && !TextUtils.isEmpty(inputValue)) {
                mEditTextName.setText(inputValue);
            }
            if (mCheckBox != null){
                mCheckBox.setChecked(checkboxValue);
            }
        }
    }
}
