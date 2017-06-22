package com.example.hi.paris_guidance;

/**
 * Created by hi on 10-05-2017.
 */

public class Word {
    private String text;
    private static final int NO_IMAGE = -1;
    private int imageResource = NO_IMAGE;
    public Word(String gotext,int image)
    {
        text = gotext;
        imageResource =image;
    }
    public String getTextName()
    {
        return text;
    }
    public int getImageResourceId()
    {
        return imageResource;
    }
}
