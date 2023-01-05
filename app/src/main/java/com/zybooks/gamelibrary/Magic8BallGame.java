package com.zybooks.gamelibrary;

import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class Magic8BallGame extends Fragment {

    Button askButton;
    ImageView magic_ball;
    TextView magicHeader;
    TextView display_answer;
    MaterialButton backButton;
    TextInputEditText enterQuestion;
    TextInputEditText userTextInput;
    final private static int ANIMATION_DURATION = 2000;
    final private static int FAST_ANIMATION_DURATION = 10;

    Random random = new Random();

    // Array string to store all magic 8 ball answers
    String[] magic_eight_ball_answers = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
            "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes",
            "Signs point to yes", "Try asking again", "Ask again later", "Better stay quiet",
            "Can't predict now", "Maybe", "Don’t count on it",
            "My reply is no", "I don't think so", "My sources say no", "Outlook not good",
            "Not a good idea", "Very doubtful", "Absolutely not", "Sorry, but no"};

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the fragment for the Magic8BallGame class
        View view = inflater.inflate(R.layout.fragment_magic_8, container, false);

        // Provide button and textview id references for the clicker to look for
        askButton = view.findViewById(R.id.ask_button);
        backButton = view.findViewById(R.id.back_button);
        magic_ball = view.findViewById(R.id.magic_8_ball);
        userTextInput = view.findViewById(R.id.user_input_text);
        enterQuestion = view.findViewById(R.id.user_input_text);
        display_answer = view.findViewById(R.id.display_answer);
        magicHeader = view.findViewById(R.id.instructions_header);

        // Creates a moving up and down animation for the magic 8 ball using an ObjectAnimator
        ObjectAnimator animation = ObjectAnimator.ofFloat(magic_ball, "translationY", 50f);
        animation.setRepeatCount(animation.INFINITE);
        animation.setInterpolator(new LinearInterpolator());
        animation.setDuration(ANIMATION_DURATION);
        animation.start();
        animation.setRepeatMode(animation.REVERSE);

        // Creates a moving up and down animation for the magic 8 ball output using an ObjectAnimator
        ObjectAnimator animation2 = ObjectAnimator.ofFloat(display_answer, "translationY", 50f);
        animation2.setRepeatCount(animation2.INFINITE);
        animation2.setInterpolator(new LinearInterpolator());
        animation2.setDuration(ANIMATION_DURATION);
        animation2.start();
        animation2.setRepeatMode(animation2.REVERSE);

        // Sets an onClick listener to animate a shake and display magic 8 ball output answer to user
        askButton.setOnClickListener(view1 -> {

            // Performs a "shaking" animation for the magic 8 ball when askButton button is clicked
            ObjectAnimator animation1 = ObjectAnimator.ofFloat(magic_ball, "translationY", 50f);
            animation1.setRepeatCount(20);
            animation1.setInterpolator(new AccelerateInterpolator());
            animation1.setDuration(FAST_ANIMATION_DURATION);
            animation1.start();
            animation1.setRepeatMode(animation1.REVERSE);

            // Performs a "shaking" animation for the output of the magic 8 ball when askButton button is clicked
            ObjectAnimator animation21 = ObjectAnimator.ofFloat(display_answer, "translationY", 50f);
            animation21.setRepeatCount(20);
            animation21.setInterpolator(new AccelerateInterpolator());
            animation21.setDuration(FAST_ANIMATION_DURATION);
            animation21.start();
            animation21.setRepeatMode(animation21.REVERSE);

            // Retrieve a random output int representation which is bounded by the size of array
            int randomIndex = random.nextInt(magic_eight_ball_answers.length);

            // Displays error to user if display_answer is empty
            if(userTextInput.length() == 0){
                userTextInput.setError("Please ask a question");
            }
            // Retrieves a random output and displays to user if string is !empty
            else{
                String random_answer = magic_eight_ball_answers[randomIndex];
                display_answer.setText(random_answer);
            }
        });

        // Sets an onClick listener to animate a shake and display magic 8 ball output answer to user
        magic_ball.setOnClickListener(view1 -> {

            // Performs identical game animations and string checks as listed above
            ObjectAnimator animation12 = ObjectAnimator.ofFloat(magic_ball, "translationY", 50f);
            animation12.setRepeatCount(20);
            animation12.setInterpolator(new AccelerateInterpolator());
            animation12.setDuration(FAST_ANIMATION_DURATION);
            animation12.start();
            animation12.setRepeatMode(animation12.REVERSE);

            ObjectAnimator animation212 = ObjectAnimator.ofFloat(display_answer, "translationY", 50f);
            animation212.setRepeatCount(20);
            animation212.setInterpolator(new AccelerateInterpolator());
            animation212.setDuration(FAST_ANIMATION_DURATION);
            animation212.start();
            animation212.setRepeatMode(animation212.REVERSE);

            int randomIndex = random.nextInt(magic_eight_ball_answers.length);

            if(userTextInput.length() == 0){
                userTextInput.setError("Please ask a question");
            }
            else{
                String random_answer = magic_eight_ball_answers[randomIndex];
                display_answer.setText(random_answer);
            }
        });

        // Sets an onKey listener to respond to the "enter" button to display magic 8 ball output answer to user
        enterQuestion.setOnKeyListener((v, keyCode, event) -> {
            // Checks if the event is a key-down event on the "enter" button
            if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                    (keyCode == KeyEvent.KEYCODE_ENTER)) {

                // Performs identical game animations and string checks from this point on as listed above

                ObjectAnimator animation13 = ObjectAnimator.ofFloat(magic_ball, "translationY", 50f);
                animation13.setRepeatCount(20);
                animation13.setInterpolator(new AccelerateInterpolator());
                animation13.setDuration(FAST_ANIMATION_DURATION);
                animation13.start();
                animation13.setRepeatMode(animation13.REVERSE);

                ObjectAnimator animation213 = ObjectAnimator.ofFloat(display_answer, "translationY", 50f);
                animation213.setRepeatCount(20);
                animation213.setInterpolator(new AccelerateInterpolator());
                animation213.setDuration(FAST_ANIMATION_DURATION);
                animation213.start();
                animation213.setRepeatMode(animation213.REVERSE);

                int randomIndex = random.nextInt(magic_eight_ball_answers.length);

                if(userTextInput.length() == 0){
                    userTextInput.setError("Please ask a question");
                }
                else{
                    String random_answer = magic_eight_ball_answers[randomIndex];
                    // Supposed to display string
                    display_answer.setText(random_answer);
                }

                return true;
            }
            return false;
        });

        // Sets an onClick listener to navigate to fragment_home if the back button is clicked
        backButton.setOnClickListener(v -> {
            // Declares a new instance of HomeScreen
            HomeScreen home = new HomeScreen();
            // Replace the current fragment (fragment_magic_8) with home fragment (fragment_home)
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        // Sets an onClick listener to navigate to fragment_home if the textview header is clicked
        magicHeader.setOnClickListener(v -> {
            // Performs the same process for textview aboutHeader as above
            HomeScreen home = new HomeScreen();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
        });

        return view;
    }
}
