package com.miguelcr.duckhunt;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    TextView nick, textViewCounter, textViewTimer;
    ImageView duck;
    Random random;
    int counterDucks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        nick = (TextView) findViewById(R.id.textViewNick);
        textViewCounter = (TextView) findViewById(R.id.textViewCounter);
        textViewTimer = (TextView) findViewById(R.id.textViewTimer);
        duck = (ImageView) findViewById(R.id.imageViewDuck);
        random = new Random();

        // GEt the username value that we receive through the Intent object
        Bundle extras = getIntent().getExtras();
        String user = extras.getString("username");

        nick.setText(user);

        // Hide the toolbar
        getSupportActionBar().hide();

        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                textViewTimer.setText(millisUntilFinished / 1000 + "s");
            }

            public void onFinish() {
                textViewTimer.setText("Game over!");
            }
        }.start();

    }

    public void duckClicked(View view) {
        counterDucks++;
        textViewCounter.setText(String.valueOf(counterDucks));

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int heightScreen = displayMetrics.heightPixels;
        int widthScreen = displayMetrics.widthPixels;

        int heightDuck = duck.getHeight();
        int widthDuck = duck.getWidth();

        int maxHeight = heightScreen - heightDuck;
        int maxWidth = widthScreen - widthDuck;

        int randomX = random.nextInt(maxWidth - 0 + 1) + 0;
        int randomY = random.nextInt(maxHeight - 0 + 1) + 0;

        duck.setX(randomX);
        duck.setY(randomY);

    }
}
