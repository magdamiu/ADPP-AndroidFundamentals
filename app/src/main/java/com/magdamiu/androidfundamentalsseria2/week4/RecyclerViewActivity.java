package com.magdamiu.androidfundamentalsseria2.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsseria2.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewCars;
    private List<Car> mCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initView();
        setLayoutManager();
        setCars();
        setAdapter();
        setRecyclerViewListener();
    }

    private void setAdapter() {
        CarAdapter carAdapter = new CarAdapter(mCars);
        mRecyclerViewCars.setAdapter(carAdapter);
    }

    private void initView() {
        mRecyclerViewCars = findViewById(R.id.recycler_view_cars);
    }

    private void setLayoutManager() {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this);
        mRecyclerViewCars.setLayoutManager(layoutManager);
    }

    private void setRecyclerViewListener() {
        mRecyclerViewCars.addOnItemTouchListener(new RecyclerTouchListener(this,
                mRecyclerViewCars, new CarClickListener() {
            @Override
            public void onClick(View view, final int position) {
                Toast.makeText(RecyclerViewActivity.this, getString(R.string.single_click) + position,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this, getString(R.string.long_click) + position,
                        Toast.LENGTH_LONG).show();
            }
        }));
    }

    private void setCars() {
        mCars = new ArrayList<>();
        Car car1 = new Car("Dacia", "red", 70);
        Car car2 = new Car("Benveu", "negru", 500);
        Car car3 = new Car("Trabant", "roz", 2);
        Car car4 = new Car("Bentley", "lila", 650);
        Car car5 = new Car("Audi", "alb", 300);
        Car car6 = new Car("Dacia", "red", 70);
        Car car7 = new Car("Benveu", "negru", 500);
        Car car8 = new Car("Trabant", "gri", 12);
        Car car9 = new Car("Bentley", "albastru", 220);
        Car car10 = new Car("Audi", "galben", 170);
        mCars.add(car1);
        mCars.add(car2);
        mCars.add(car3);
        mCars.add(car4);
        mCars.add(car5);
        mCars.add(car6);
        mCars.add(car7);
        mCars.add(car8);
        mCars.add(car9);
        mCars.add(car10);
    }
}
