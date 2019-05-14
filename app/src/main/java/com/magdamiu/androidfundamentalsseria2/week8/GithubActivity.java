package com.magdamiu.androidfundamentalsseria2.week8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsseria2.R;
import com.magdamiu.androidfundamentalsseria2.utils.Logging;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    private TextView mTextViewRetrofit;
    private ImageView mImageViewPicasso;

    private UsersRepository mUsersRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        initView();

        mUsersRepository = UsersRepository.getInstance();

        mUsersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                mTextViewRetrofit.append("Github users = ");
                for (User user : users) {
                    mTextViewRetrofit.append(user.toString() + " /// ");
                }
                Logging.show("Github users = ", users.toString());
            }

            @Override
            public void onError() {
                mTextViewRetrofit.setText("error Github users = check the code :D ");
                Logging.show("error Github users = ", "check the code :D ");
            }
        });
    }

    private void initView() {
        mTextViewRetrofit = findViewById(R.id.textViewRetrofit);
        mImageViewPicasso = findViewById(R.id.imageViewPicasso);

        Picasso.get().load("https://9to5google.com/wp-content/uploads/sites/4/2015/10/android-versions.jpg").into(mImageViewPicasso);
    }
}
