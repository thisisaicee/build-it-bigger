package net.aicee.tellJoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TellJokeActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "EXTRA_JOKE";

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_joke);
        jokeTextView = findViewById(R.id.jokeContent);
        displayCurrentJoke();
    }

    private void displayCurrentJoke() {
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(EXTRA_JOKE)) {
            String currentJoke = intent.getStringExtra(EXTRA_JOKE);
            jokeTextView.setText(currentJoke);
        }
        else{
            jokeTextView.setText(R.string.featured_joke_not_loaded);
        }
    }
}
