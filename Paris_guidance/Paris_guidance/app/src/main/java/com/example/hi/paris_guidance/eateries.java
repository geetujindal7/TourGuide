package com.example.hi.paris_guidance;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
public class eateries extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eateries);
        ArrayList<Word> place = new ArrayList<Word>();
        place.add(new Word(" CARAMELS",R.mipmap.caramels));
        place.add(new Word(" BORDIER BUTTER",R.mipmap.butter));
        place.add(new Word(" BAGUETTE, PAIN AU CHOCOLAT, AND PASTRIES",R.mipmap.pain));
        place.add(new Word(" CHOCOLATE ",R.mipmap.chocolate));
        place.add(new Word("CHEESE",R.mipmap.cheese));
        place.add(new Word(" L’AVANT COMPTOIR WINE BAR",R.mipmap.wine));
        place.add(new Word("MACARONS",R.mipmap.macarons));
        place.add(new Word("SPLURGE DINNER",R.mipmap.dinner));
        place.add(new Word(" FALAFEL @ L’AS DU FALLAFEL",R.mipmap.falafel));
        place.add(new Word(" DESSERT",R.mipmap.dessert));
        WordAdapter adapter = new WordAdapter(this, place);
        ListView listView = (ListView) findViewById(R.id.bars);
        listView.setAdapter(adapter);
    }
}