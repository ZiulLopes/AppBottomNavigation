package com.example.luizpereira.appbottomnavigation.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.luizpereira.appbottomnavigation.R;
import com.example.luizpereira.appbottomnavigation.fragments.UsersFragment;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private final AppCompatActivity activity = MainActivity.this;

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }

    private void initViews() {

        navigationView = (BottomNavigationView)findViewById(R.id.navigationView);
    }

    private void initListeners(){
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.navigation_home: {
                break;
            }
            case R.id.navigation_users: {
                getSupportActionBar().setTitle("Usuarios");
                Fragment usersFragment = UsersFragment.newInstance();
                openFragment(usersFragment);
                break;
            }
            case R.id.navigation_block: {
                break;
            }
        }
        return true;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
