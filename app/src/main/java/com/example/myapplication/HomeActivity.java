package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView mypagebtn = (ImageView)findViewById(R.id.mypagebtn);
        ImageView mylocation = (ImageView)findViewById(R.id.imageView8);

        mypagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MypageActivity.class);
                startActivity(intent);
            }
        });

        mylocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),landmarkRecycle.class);
                startActivity(intent);
            }
        });
    }
}