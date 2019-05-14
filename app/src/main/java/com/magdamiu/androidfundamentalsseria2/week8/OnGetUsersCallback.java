package com.magdamiu.androidfundamentalsseria2.week8;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}