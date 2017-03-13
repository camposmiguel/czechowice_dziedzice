package com.miguelcr.duckhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    EditText nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nick = (EditText) findViewById(R.id.editTextNick);

    }

    public void startGame(View view) {
        // Get the nickname that user wrote
        String nickName = nick.getText().toString();

        Intent i = new Intent(this, GameActivity.class);
        i.putExtra("username",nickName);
        //i.putExtra("points",0);
        startActivity(i);
    }
}
