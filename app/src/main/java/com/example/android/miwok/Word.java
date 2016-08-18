package com.example.android.miwok;

/**
 * Created by uzuri17 on 8/13/2016.
 */
public class Word {

    //English (host language) vocab word
    private String mDefaultTranslation;

    //Miwok translation
    private String mMiwokTranslation;

    //Image for words
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    //@param defaultTranslation is the parent language set on the device
    //@param miwokTranslation is the miwok term
    //@param imageResourceID is the image associated with the words
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }
    /*get default word
    */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    /*get miwok word
    */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
