package com.magdamiu.androidfundamentalsseria2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.magdamiu.androidfundamentalsseria2.week2.ViewExampleActivity;
import com.magdamiu.androidfundamentalsseria2.week3.LoginActivity;
import com.magdamiu.androidfundamentalsseria2.week3.SpinnerActivity;
import com.magdamiu.androidfundamentalsseria2.week3.ViewGroupsActivity;
import com.magdamiu.androidfundamentalsseria2.week3.WebViewActivity;
import com.magdamiu.androidfundamentalsseria2.week4.ConstraintLayoutActivity;
import com.magdamiu.androidfundamentalsseria2.week4.RecyclerViewActivity;
import com.magdamiu.androidfundamentalsseria2.week5.FirstActivity;
import com.magdamiu.androidfundamentalsseria2.week5.ForResultActivity1;
import com.magdamiu.androidfundamentalsseria2.week6.fragment.FragmentInActivity;
import com.magdamiu.androidfundamentalsseria2.week6.fragment.LengthActivity;
import com.magdamiu.androidfundamentalsseria2.week6.NavigationActivity;
import com.magdamiu.androidfundamentalsseria2.week6.fragment.SumActivity;
import com.magdamiu.androidfundamentalsseria2.week6.tabs.TabsActivity;
import com.magdamiu.androidfundamentalsseria2.week7.MaterialDesignActivity;
import com.magdamiu.androidfundamentalsseria2.week8.GithubActivity;
import com.magdamiu.androidfundamentalsseria2.week8.GithubApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    // week 2
    public void week2OnClick(View view) {
        startActivity(new Intent(MainActivity.this, ViewExampleActivity.class));
    }

    public void weekLoginOnClick(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    // week 3
    public void week3SpinnerOnClick(View view) {
        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
    }

    public void week3ViewGroupOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ViewGroupsActivity.class));
    }

    public void week3WebViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, WebViewActivity.class));
    }

    // week 4
    public void week4RecyclerViewOnClick(View view) {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    public void week4ConstraintLayoutOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ConstraintLayoutActivity.class));
    }

    // week 5
    public void week5FirstActivityOnClick(View view) {
        startActivity(new Intent(MainActivity.this, FirstActivity.class));
    }

    public void week5FirstActivityForResultOnClick(View view) {
        startActivity(new Intent(MainActivity.this, ForResultActivity1.class));
    }

    // week 6
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

    public void week6TabsOnClick(View view) {
        startActivity(new Intent(MainActivity.this, TabsActivity.class));
    }

    // week 7
    public void week7MaterialDesignOnClick(View view) {
        startActivity(new Intent(MainActivity.this, MaterialDesignActivity.class));
    }

    // week 8
    public void week8GithubAndRetrofiOnClick(View view) {
        startActivity(new Intent(MainActivity.this, GithubActivity.class));
    }
}