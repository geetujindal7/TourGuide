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
        place.add(new Word(getText(R.string.caramels).toString(),R.mipmap.caramels));
        place.add(new Word(getText(R.string.butter).toString(),R.mipmap.butter));
        place.add(new Word(getText(R.string.baguette).toString(),R.mipmap.pain));
        place.add(new Word(getText(R.string.chocolate).toString(),R.mipmap.chocolate));
        place.add(new Word(getText(R.string.cheese).toString(),R.mipmap.cheese));
        place.add(new Word(getText(R.string.wine).toString(),R.mipmap.wine));
        place.add(new Word(getText(R.string.macarons).toString(),R.mipmap.macarons));
        place.add(new Word(getText(R.string.dinner).toString(),R.mipmap.dinner));
        place.add(new Word(getText(R.string.falafel).toString(),R.mipmap.falafel));
        place.add(new Word(getText(R.string.dessert).toString(),R.mipmap.dessert));
        WordAdapter adapter = new WordAdapter(this, place);
        ListView listView = (ListView) findViewById(R.id.bars);
        listView.setAdapter(adapter);
    }
}