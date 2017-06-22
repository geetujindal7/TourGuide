package com.example.hi.paris_guidance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView places = (TextView) findViewById(R.id.places);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesintent = new Intent(MainActivity.this, places.class);
                startActivity(placesintent);
            }
        });
        TextView places1 = (TextView) findViewById(R.id.church);
        places1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesintent1 = new Intent(MainActivity.this, church.class);
                startActivity(placesintent1);
            }
        });
        TextView places2 = (TextView) findViewById(R.id.bars);
        places2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesintent2 = new Intent(MainActivity.this, eateries.class);
                startActivity(placesintent2);
            }
        });
        TextView places3 = (TextView) findViewById(R.id.hh);
        places3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesintent3 = new Intent(MainActivity.this, mall.class);
                startActivity(placesintent3);
            }
        });
    }
}