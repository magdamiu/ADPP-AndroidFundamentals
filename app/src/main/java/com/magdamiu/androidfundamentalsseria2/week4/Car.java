package com.magdamiu.androidfundamentalsseria2.week4;

public class Car {
    private String mName;
    private String mColor;
    private int mHp;

    public Car(String name, String color, int hp) {
        mName = name;
        mColor = color;
        mHp = hp;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public int getHp() {
        return mHp;
    }

    public void setHp(int hp) {
        mHp = hp;
    }
}
