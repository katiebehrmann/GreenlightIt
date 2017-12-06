package com.example.katiebehrmann.greenlightit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
    }

    public void playGameAlready(View view) {
        Intent i = new Intent(this, beginGame.class);
        startActivity(i);
    }
}
