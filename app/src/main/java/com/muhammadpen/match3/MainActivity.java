package com.muhammadpen.match3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 0 = empty
    int[] gameState = {0, 0, 0, 0, 0, 0, 0, 0, 0};


    int activePlayer = 1;


    public void centerOnClick (View view) {

        ImageView dot = (ImageView) view;

        int  dotTag = Integer.parseInt(dot.getTag().toString());

        if (gameState[dotTag] == 0) {

            gameState[dotTag] = activePlayer;

            Log.i("Field Pressed", dot.getTag().toString());

            dot.setTranslationY(-1000f);
            dot.setAlpha(1.0f);

            // 1 = green dot; 2 = purple dot

            if (activePlayer == 1) {

                dot.setImageResource(R.drawable.dot1);

                activePlayer = 2;

                Toast.makeText(this, "Player " + activePlayer + "'s turn.", Toast.LENGTH_SHORT).show();
            } else {

                dot.setImageResource(R.drawable.dot2);

                activePlayer = 1;

                Toast.makeText(this, "Player " + activePlayer + "'s turn.", Toast.LENGTH_SHORT).show();

            }

            dot.animate().translationYBy(1000f).setDuration(170);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dot11 = findViewById(R.id.imageView11);
        ImageView dot12 = findViewById(R.id.imageView12);
        ImageView dot13 = findViewById(R.id.imageView13);
        ImageView dot21 = findViewById(R.id.imageView21);
        ImageView dot22 = findViewById(R.id.imageView22);
        ImageView dot23 = findViewById(R.id.imageView23);
        ImageView dot31 = findViewById(R.id.imageView31);
        ImageView dot32 = findViewById(R.id.imageView32);
        ImageView dot33 = findViewById(R.id.imageView33);

        dot11.setAlpha(0.0f);
        dot12.setAlpha(0.0f);
        dot13.setAlpha(0.0f);
        dot21.setAlpha(0.0f);
        dot22.setAlpha(0.0f);
        dot23.setAlpha(0.0f);
        dot31.setAlpha(0.0f);
        dot32.setAlpha(0.0f);
        dot33.setAlpha(0.0f);



    }
}
