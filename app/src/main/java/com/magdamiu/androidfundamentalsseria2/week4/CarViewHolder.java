package com.magdamiu.androidfundamentalsseria2.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsseria2.R;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewName;
    private TextView mTextViewColor;
    private TextView mTextViewHp;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewName = itemView.findViewById(R.id.text_view_name);
        mTextViewColor = itemView.findViewById(R.id.text_view_color);
        mTextViewHp = itemView.findViewById(R.id.text_view_hp);
    }

    public TextView getTextViewName() {
        return mTextViewName;
    }

    public TextView getTextViewColor() {
        return mTextViewColor;
    }

    public TextView getTextViewHp() {
        return mTextViewHp;
    }
}
