package com.nd.frt.fragmentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.nd.frt.fragmentdemo.fragment.DeputyFragment;
import com.nd.frt.fragmentdemo.fragment.ListFragment;
import com.nd.frt.fragmentdemo.model.UserInfo;

public class MainActivity extends AppCompatActivity implements DeputyFragment.OnEditUserInfo {

    private ListFragment mListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListFragment = new ListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flContent, mListFragment)
                .commit();
    }

    @Override
    public void onSuccess(UserInfo userInfo, int index) {
        mListFragment.edit(index, userInfo);
    }
}
