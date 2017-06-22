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
        place.add(new Word(" THE EIFFEL TOWER",R.mipmap.eiffel));
        place.add(new Word(" THE CATACOMBS OF PARIS",R.mipmap.catacomb));
        place.add(new Word(" MUSEE DU LOUVRE",R.mipmap.musee));
        place.add(new Word(" THE PANTHEON - PARIS ",R.mipmap.pantheon));
        place.add(new Word("PALACE OF VERSAILLES",R.mipmap.palace));
        place.add(new Word("NOTRE DAME CATHEDRAL OF PARIS",R.mipmap.notre));
        place.add(new Word("PERE LACHAISE CEMETERY",R.mipmap.pere));
        place.add(new Word("CRYPTE ARCHEOLOGIQUE - PARIS",R.mipmap.crypty));
        place.add(new Word(" SAINTE CHAPELLE",R.mipmap.sainte));
        place.add(new Word(" MUSEE DE CLUNY",R.mipmap.museee));
        WordAdapter adapter = new WordAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.places);
        listView.setAdapter(adapter);
    }
}