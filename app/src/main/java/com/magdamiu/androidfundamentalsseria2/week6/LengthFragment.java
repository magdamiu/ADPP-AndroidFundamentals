package com.magdamiu.androidfundamentalsseria2.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.magdamiu.androidfundamentalsseria2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LengthFragment extends Fragment {

    private EditText mEditTextInput;
    private Button mButtonGetLength;

    public LengthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_length, container, false);

        initView(view);
        return view;
    }

    private void initView(View view) {
        mEditTextInput = view.findViewById(R.id.edit_text_input);
        mButtonGetLength = view.findViewById(R.id.btn_get_length);

        mButtonGetLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInputValue();
            }
        });
    }

    private void sendInputValue() {
        if(mEditTextInput != null && mEditTextInput.getText() != null) {
            String value = mEditTextInput.getText().toString();
            if(!TextUtils.isEmpty(value)) {
                LengthListener lengthListener = (LengthListener) getActivity();
                lengthListener.displayLength(value);
            }
        }
    }

}
