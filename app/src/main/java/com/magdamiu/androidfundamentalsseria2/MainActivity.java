package com.magdamiu.androidfundamentalsseria2;

import android.content.Intent;
import android.graphics.RadialGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsseria2.week2.ViewExampleActivity;
import com.magdamiu.androidfundamentalsseria2.week3.LoginActivity;
import com.magdamiu.androidfundamentalsseria2.week3.SpinnerActivity;
import com.magdamiu.androidfundamentalsseria2.week3.ViewGroupsActivity;
import com.magdamiu.androidfundamentalsseria2.week3.WebViewActivity;
import com.magdamiu.androidfundamentalsseria2.week4.ConstraintLayoutActivity;
import com.magdamiu.androidfundamentalsseria2.week4.RecyclerViewActivity;
import com.magdamiu.androidfundamentalsseria2.week5.FirstActivity;
import com.magdamiu.androidfundamentalsseria2.week5.ForResultActivity1;
import com.magdamiu.androidfundamentalsseria2.week6.FragmentInActivity;
import com.magdamiu.androidfundamentalsseria2.week6.LengthActivity;
import com.magdamiu.androidfundamentalsseria2.week6.NavigationActivity;
import com.magdamiu.androidfundamentalsseria2.week6.SumActivity;
import com.magdamiu.androidfundamentalsseria2.week7.MaterialDesignActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void week2OnClick(View view) {
        startActivity(new Intent(MainActivity.this, ViewExampleActivity.class));
    }

    public void weekLoginOnClick(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void week3SpinnerOnClick(View view) {
        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
    }

    public void week3ViewGroupOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ViewGroupsActivity.class));
    }

    public void week3WebViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
    }

    public void week4RecyclerViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    public void week4ConstraintLayoutOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ConstraintLayoutActivity.class));
    }

    public void week5FirstActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, FirstActivity.class));
    }

    public void week5FirstActivityForResultOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ForResultActivity1.class));
    }

    public void week6FragmentInActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, FragmentInActivity.class));
    }

    public void week6LengthActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, LengthActivity.class));
    }

    public void week6SumActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, SumActivity.class));
    }

    public void week6NavigationActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, NavigationActivity.class));
    }

    public void week7MaterialDesignOnClick(View view) {
        startActivity(new Intent(MainActivity.this, MaterialDesignActivity.class));
    }
}