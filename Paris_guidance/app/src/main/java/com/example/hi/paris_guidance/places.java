package com.example.hi.paris_guidance;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class places extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(getText(R.string.eiffel).toString(),R.mipmap.eiffel));
        place.add(new Word(getText(R.string.catacomb).toString(),R.mipmap.catacomb));
        place.add(new Word(getText(R.string.musee).toString(),R.mipmap.musee));
        place.add(new Word(getText(R.string.pantheon).toString(),R.mipmap.pantheon));
        place.add(new Word(getText(R.string.palace).toString(),R.mipmap.palace));
        place.add(new Word(getText(R.string.notre).toString(),R.mipmap.notre));
        place.add(new Word(getText(R.string.pere).toString(),R.mipmap.pere));
        place.add(new Word(getText(R.string.crypty).toString(),R.mipmap.crypty));
        place.add(new Word(getText(R.string.sainte).toString(),R.mipmap.sainte));
        place.add(new Word(getText(R.string.museee).toString(),R.mipmap.museee));
        WordAdapter adapter = new WordAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.places);
        listView.setAdapter(adapter);
    }
}