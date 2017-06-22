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
        place.add(new Word(getText(R.string.alexender).toString(), R.mipmap.alexender));
        place.add(new Word(getText(R.string.chapelle).toString(), R.mipmap.chapelle));
        place.add(new Word(getText(R.string.dome).toString(), R.mipmap.dome));
        place.add(new Word(getText(R.string.madeleine).toString(), R.mipmap.madaleine));
        place.add(new Word(getText(R.string.assomption).toString(), R.mipmap.assomption));
        place.add(new Word(getText(R.string.croix).toString(), R.mipmap.croix));
        place.add(new Word(getText(R.string.paaris).toString(), R.mipmap.paris));
        place.add(new Word(getText(R.string.victories).toString(), R.mipmap.victories));
        place.add(new Word(getText(R.string.travail).toString(), R.mipmap.travail));
        place.add(new Word(getText(R.string.pantheon).toString(), R.mipmap.pantheonn));
        WordAdapter adapter = new WordAdapter(this, place);
        ListView listView = (ListView) findViewById(R.id.churches);
        listView.setAdapter(adapter);
    }
}