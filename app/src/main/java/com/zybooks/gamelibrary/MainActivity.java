package com.zybooks.gamelibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Sets the current fragment to home fragment (fragment_home) on app launch
        setContentView(R.layout.fragment_home);
        // Open the fragment home_fragment for the HomeScreen class
        getSupportFragmentManager().beginTransaction().add(R.id.container, new HomeScreen()).commit();
    }
}