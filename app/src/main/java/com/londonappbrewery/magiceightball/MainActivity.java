package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFortune = (Button) findViewById(R.id.btnAsk);

        final ImageView eightBall = (ImageView) findViewById(R.id.imageEightBall);

        final int[] fortuneArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        btnFortune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("8 ball", "onClick: a fortune have been told!");

                Random randomGenerator = new Random();

                int randomFortune = randomGenerator.nextInt(5);

                Log.d("8 ball", "onClick: fortunenumer: " +randomFortune );
                eightBall.setImageResource(fortuneArray[randomFortune]);
            }
        });
        }

    }