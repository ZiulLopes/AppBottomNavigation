package com.example.luizpereira.appbottomnavigation.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luizpereira.appbottomnavigation.R;


public class UsersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_users, container, false);
    }

    public static UsersFragment newInstance() {
        return new UsersFragment();
    }
}
