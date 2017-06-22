package com.example.hi.paris_guidance;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class mall extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(getText(R.string.forum).toString(),R.mipmap.pantheon));
        place.add(new Word(getText(R.string.center).toString(),R.mipmap.center));
        place.add(new Word(getText(R.string.royal).toString(),R.mipmap.village));
        place.add(new Word(getText(R.string.rive).toString(),R.mipmap.rive));
        place.add(new Word(getText(R.string.lourve).toString(),R.mipmap.galeri));
        place.add(new Word(getText(R.string.bercy).toString(),R.mipmap.bercy));
        place.add(new Word(getText(R.string.champs).toString(),R.mipmap.champ));
        place.add(new Word(getText(R.string.boutique).toString(),R.mipmap.boutique));
        place.add(new Word(getText(R.string.passage).toString(),R.mipmap.passage));
        place.add(new Word(getText(R.string.vallee).toString(),R.mipmap.vellee));
        WordAdapter adapter = new WordAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.hh);
        listView.setAdapter(adapter);
    }
}
