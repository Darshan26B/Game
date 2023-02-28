package com.ca.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int check;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = findViewById(R.id.image1);
        ImageView imageView2 = findViewById(R.id.image2);
        ImageView imageView3 = findViewById(R.id.image3);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check % 2 == 0) {
                    imageView1.setImageResource(R.drawable.close);
                } else {
                    imageView1.setImageResource(R.drawable.o);
                }
                check++;

            }



        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check % 2 == 0) {
                    imageView2.setImageResource(R.drawable.close);
                } else {
                    imageView2.setImageResource(R.drawable.o);
                }
                check++;

            }



        });        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check % 2 == 0) {
                    imageView3.setImageResource(R.drawable.close);
                } else {
                    imageView3.setImageResource(R.drawable.o);
                }
                check++;

            }



        });

    }
}