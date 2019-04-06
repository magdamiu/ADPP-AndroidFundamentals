package com.magdamiu.androidfundamentalsseria2.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magdamiu.androidfundamentalsseria2.R;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {
    private List<Car> mCars;

    public CarAdapter(List<Car> cars) {
        mCars = cars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.car_item,
                        viewGroup, false);
        return new CarViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {
        Car currentCar = mCars.get(i);
        if (currentCar != null) {
            if (currentCar.getName() != null) {
                carViewHolder.getTextViewName().setText(currentCar.getName());
            }
            if (currentCar.getColor() != null) {
                carViewHolder.getTextViewColor().setText(currentCar.getColor());
            }
            if (currentCar.getHp() > 0) {
                carViewHolder.getTextViewHp().setText(currentCar.getHp() + "");
            }
        }
    }

    @Override
    public int getItemCount() {
        return mCars.size();
    }
}
