package com.magdamiu.androidfundamentalsseria2.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.magdamiu.androidfundamentalsseria2.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private List<String> mColors;
    private Spinner mSpinnerColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initView();
        setColors();
        setAdapter();
    }

    // get Spinner
    private void initView() {
        mSpinnerColors = findViewById(R.id.spinner_colors);
    }

    // adapter
    private void setAdapter() {
        mSpinnerColors.setAdapter(new ArrayAdapter<>(SpinnerActivity.this,
                android.R.layout.simple_list_item_1,
                mColors));
    }

    // data source
    private void setColors() {
        mColors = new ArrayList<>();
        mColors.add("Verde");
        mColors.add("Albastru");
        mColors.add("Siclam");
        mColors.add("Magenta");
        mColors.add("Roz");
        mColors.add("Galben");
    }

}
