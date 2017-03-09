package com.miguelcr.a01_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.imageViewRealMadrid);
        Picasso.with(this)
                .load("https://pbs.twimg.com/profile_images/2482198530/iql2hfa8kks5q78q4ag3_400x400.jpeg")
                .into(logo);
    }
}
