package com.example.hi.paris_guidance;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;
import static java.security.AccessController.getContext;


/**
 * Created by hi on 10-05-2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if(listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }
        Word Words = getItem(position);
        TextView nameTextView = (TextView) listView.findViewById(R.id.text);
        nameTextView.setText(Words.getTextName());
        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        imageView.setImageResource(Words.getImageResourceId());
        return listView;
    }
}