package com.zybooks.gamelibrary;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public class AboutScreen extends Fragment {

    MaterialButton backButton;
    TextView aboutHeader;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the fragment for the AboutScreen page
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        // Provide button and textview id references for the clicker to look for
        backButton = view.findViewById(R.id.back_button);
        aboutHeader = view.findViewById(R.id.about_header);

        // Sets an onClick listener to navigate to fragment_home if the back button is clicked
        backButton.setOnClickListener(view1 -> {
            // Declares a new instance of HomeScreen
            HomeScreen home = new HomeScreen();
            // Replace the current fragment (fragment_about) with home fragment (fragment_home)
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        // Sets an onClick listener to navigate to fragment_home if the textview header is clicked
        aboutHeader.setOnClickListener(view2 -> {
            // Performs the same process for textview aboutHeader as above
            HomeScreen home = new HomeScreen();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        return view;
    }
}