package com.example.hi.paris_guidance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class church extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(" Cathédrale Saint-Alexandre-Nevsky", R.mipmap.alexender));
        place.add(new Word(" Chapelle de la Sorbonne", R.mipmap.chapelle));
        place.add(new Word(" Dôme des Invalides", R.mipmap.dome));
        place.add(new Word(" Madeleine ", R.mipmap.madaleine));
        place.add(new Word("Notre-Dame de l'Assomption", R.mipmap.assomption));
        place.add(new Word("Notre-Dame de la Croix", R.mipmap.croix));
        place.add(new Word("Notre-Dame de Paris", R.mipmap.paris));
        place.add(new Word("Notre-Dame des Victoires", R.mipmap.victories));
        place.add(new Word(" Notre-Dame du Travail", R.mipmap.travail));
        place.add(new Word(" Panthéon", R.mipmap.pantheonn));
        WordAdapter adapter = new WordAdapter(this, place);
        ListView listView = (ListView) findViewById(R.id.churches);
        listView.setAdapter(adapter);
    }
}