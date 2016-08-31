package com.example.android.miwok;

/**
 * Created by okwy on 28/08/16.
 */
public class Word {
    // Member variables to hold the English and Miwork words as well as image resource ID
    private String mEnglishTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    //public constructor taking two strings
    public Word(String englishWord, String miworkWord)
    {
        mEnglishTranslation = englishWord;
        mDefaultTranslation = miworkWord;
    }

    // Constructor that takes 2 strings and 1 integer avribale
    public Word(String mEnglishTranslation, String mDefaultTranslation, int mImageResourceID)
    {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mImageResourceID = mImageResourceID;
    }
    //getters method
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmEnglishTranslation()
    {
        return mEnglishTranslation;
    }
    // Image ID getter
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    // Check whether the image resource is set
    public boolean hasImage()
    {
        return NO_IMAGE_PROVIDED != mImageResourceID;
    }

}
