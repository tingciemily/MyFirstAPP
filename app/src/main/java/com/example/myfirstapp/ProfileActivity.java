package com.example.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BackFragment()).commit();

        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemReselectedListener((BottomNavigationView.OnNavigationItemReselectedListener) item -> {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.back:
                    fragment = new BackFragment();
                    break;
                case R.id.post:
                    fragment = new PostFragment();
                    break;
                case R.id.me:
                    fragment = new MeFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        });
    }
}