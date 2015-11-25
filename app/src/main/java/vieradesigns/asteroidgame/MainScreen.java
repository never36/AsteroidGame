package vieradesigns.asteroidgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {
    Button playButton, iButton, sButton, dButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        playButton = (Button) findViewById(R.id.play);
        iButton = (Button) findViewById(R.id.instruct);
        sButton = (Button) findViewById(R.id.scores);
        dButton = (Button) findViewById(R.id.diff);

        playButton.setOnClickListener(this);
        iButton.setOnClickListener(this);
        sButton.setOnClickListener(this);
        dButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        setContentView(R.layout.content_instruction);

    }
}

