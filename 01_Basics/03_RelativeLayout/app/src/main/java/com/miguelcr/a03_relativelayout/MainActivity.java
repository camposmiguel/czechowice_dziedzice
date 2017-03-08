package com.miguelcr.a03_relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pokemonName;
    ImageView star1, star2, star3, star4, star5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the references to the View components
        pokemonName = (TextView) findViewById(R.id.textViewPokemonName);
        ImageView avatar = (ImageView) findViewById(R.id.imageViewAvatar);
        star1 = (ImageView) findViewById(R.id.imageViewStar1);
        star2 = (ImageView) findViewById(R.id.imageViewStar2);
        star3 = (ImageView) findViewById(R.id.imageViewStar3);
        star4 = (ImageView) findViewById(R.id.imageViewStar4);
        star5 = (ImageView) findViewById(R.id.imageViewStar5);


        // We can change the text that appear by default in the TextView
        pokemonName.setText("Pikachu");

        // We can change the image that we show in the ImageView component
        avatar.setImageResource(R.drawable.ic_pikachu);
    }

    public void starClicked(View view) {
        // Convert the "View view" to "ImageView star"
        ImageView star = (ImageView) view;

        int idStarClicked = star.getId();


        if(idStarClicked==R.id.imageViewStar1) {
            star1.setImageResource(R.drawable.ic_star);
            star2.setImageResource(R.drawable.ic_star_off);
            star3.setImageResource(R.drawable.ic_star_off);
            star4.setImageResource(R.drawable.ic_star_off);
            star5.setImageResource(R.drawable.ic_star_off);
        } else if(idStarClicked==R.id.imageViewStar2) {
            star1.setImageResource(R.drawable.ic_star);
            star2.setImageResource(R.drawable.ic_star);
            star3.setImageResource(R.drawable.ic_star_off);
            star4.setImageResource(R.drawable.ic_star_off);
            star5.setImageResource(R.drawable.ic_star_off);
        } else if(idStarClicked==R.id.imageViewStar3) {
            star1.setImageResource(R.drawable.ic_star);
            star2.setImageResource(R.drawable.ic_star);
            star3.setImageResource(R.drawable.ic_star);
            star4.setImageResource(R.drawable.ic_star_off);
            star5.setImageResource(R.drawable.ic_star_off);
        } else if(idStarClicked==R.id.imageViewStar4) {
            star1.setImageResource(R.drawable.ic_star);
            star2.setImageResource(R.drawable.ic_star);
            star3.setImageResource(R.drawable.ic_star);
            star4.setImageResource(R.drawable.ic_star);
            star5.setImageResource(R.drawable.ic_star_off);
        } else {
            star1.setImageResource(R.drawable.ic_star);
            star2.setImageResource(R.drawable.ic_star);
            star3.setImageResource(R.drawable.ic_star);
            star4.setImageResource(R.drawable.ic_star);
            star5.setImageResource(R.drawable.ic_star);
        }

    }

}
