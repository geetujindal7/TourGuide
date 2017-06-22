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
        place.add(new Word(" FORUM DES HALLES",R.mipmap.pantheon));
        place.add(new Word(" CENTRE BEAUGRENELLE PARIS",R.mipmap.center));
        place.add(new Word(" VILLAGE ROYAL",R.mipmap.village));
        place.add(new Word(" MONTPARNASSE RIVE GAUCHE ",R.mipmap.rive));
        place.add(new Word("LA GALERIE DU CARROUSEL DU LOUVRE",R.mipmap.galeri));
        place.add(new Word("BERCY VILLAGE",R.mipmap.bercy));
        place.add(new Word("CHAMPS-ELYSÉES",R.mipmap.champ));
        place.add(new Word("BOUTIQUES DU PALAIS DES CONGRÈS",R.mipmap.boutique));
        place.add(new Word(" LE PASSAGE DU HAVRE",R.mipmap.passage));
        place.add(new Word(" LA VALLÉE VILLAGE",R.mipmap.vellee));
        WordAdapter adapter = new WordAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.hh);
        listView.setAdapter(adapter);

    }
}
