package com.zybooks.gamelibrary;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public class InstructionsScreen extends Fragment {

    MaterialButton backButton;
    TextView instructionsHeader;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the fragment for the InstructionsScreen page
        View view = inflater.inflate(R.layout.fragment_instructions, container, false);

        // Provide button and textview id references for the clicker to look for
        backButton = view.findViewById(R.id.back_button);
        instructionsHeader = view.findViewById(R.id.instructions_header);

        // Sets an onClick listener to navigate to fragment_home if the back button is clicked
        backButton.setOnClickListener(view1 -> {
            // Declares a new instance of HomeScreen
            HomeScreen home = new HomeScreen();
            // Replace the current fragment (fragment_instructions) with home fragment (fragment_home)
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        // Sets an onClick listener to navigate to fragment_home if the textview header is clicked
        instructionsHeader.setOnClickListener(view12 -> {
            // Performs the same process for textview instructionsHeader as above
            HomeScreen home = new HomeScreen();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        return view;
    }
}