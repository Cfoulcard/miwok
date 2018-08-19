package com.example.android.miwok;

import android.view.View;

public class Word {

    /*This section is full of instance variables and define the state of our class
    //They are private because we only want this class to access these variables
    //For example, other classes can change the resource ID into something invalid
    //This would crash the app*/

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    /**Audio resource ID for the word */
    private int mAudioResourceId;


    //Store a resource id for the image to help lower the amount of memory needed
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Constant If no image is provided
    private static final int NO_IMAGE_PROVIDED = -1;

    //This is an object. Objects are invoke via their methods
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    //This will get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //This will get the Miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //This will push an image of what we want to reference
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns wheter or not there is an image for this word/phrase
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
         * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
