package com.bart.android.meme_generator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openStarWars(View view) {
        Intent i = new Intent(this, StarWars.class);
        startActivity(i);
    }

    public void openDead(View view) {
        Intent i = new Intent(this, Dead.class);
        startActivity(i);
    }

    public void openDank(View view) {
        Intent i = new Intent(this, Dank.class);
        startActivity(i);
    }

    public void openMarvel_Thanos(View view) {
        Intent i = new Intent(this, Marvel_Thanos.class);
        startActivity(i);
    }

    public void openSpooky(View view) {
        Intent i = new Intent(this, Spooky.class);
        startActivity(i);
    }

//    Button uploadmeme = (uploadmeme) findViewById(R.id.upload_butt);
//uploadmeme.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            // Do something in response to button click
//            ACTION_GET_CONTENT
//        }
//    });

}
