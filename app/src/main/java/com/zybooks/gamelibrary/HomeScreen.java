package com.zybooks.gamelibrary;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeScreen extends Fragment {

    Button instructionsButton;
    Button aboutButton;
    Button magicButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment for the HomeScreen page
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Provide button and textview id references for the clicker to look for
        instructionsButton = view.findViewById(R.id.instructions_button);
        aboutButton = view.findViewById(R.id.why_magic_8_ball);
        magicButton = view.findViewById(R.id.magic_8_game_button);

        // Sets an onClick listener to navigate to fragment_about if the back button is clicked
        aboutButton.setOnClickListener(view1 -> {
            // Declares a new instance of AboutScreen
            AboutScreen aboutFragment = new AboutScreen();
            // Replace the current fragment (fragment_home) with about fragment (fragment_about)
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, aboutFragment).commit();
        });

        // Sets an onClick listener to navigate to fragment_instructions if the instructions button is clicked
        instructionsButton.setOnClickListener(view2 -> {
            // Performs the same process for the button instructionsButton as above
            InstructionsScreen instructionsFragment = new InstructionsScreen();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, instructionsFragment).commit();
        });

        // Sets an onClick listener to navigate to fragment_magic_8 if the game button is clicked
        magicButton.setOnClickListener(view3 -> {
            // Performs the same process for the button magicButton as above
            Magic8BallGame magicGameFragment = new Magic8BallGame();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, magicGameFragment).commit();
        });

        return view;
    }
}