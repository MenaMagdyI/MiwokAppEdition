package com.example.android.miwok;

/**
 * Created by Mena on 7/21/2017.
 */

public class Word {

    private String mDefualtTranslation;
    private String mMiwokTranslation;
    private int mImageId = no_image;
    private static final int no_image = -1;
    private int mAudioResourceId;

    public Word(String defualt,String miwok, int AudioId){
        mDefualtTranslation = defualt;
        mMiwokTranslation = miwok;
        mAudioResourceId = AudioId;
    }


    public Word(String defualt,String miwok ,int imageResourceId, int AudioId){
        mDefualtTranslation = defualt;
        mMiwokTranslation = miwok;
        mImageId = imageResourceId;
        mAudioResourceId = AudioId;
    }


    public String getmDefualtTranslation(){
        return mDefualtTranslation;
    }

    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }

    public int getmImageId(){
        return mImageId;
    }

    public boolean has_image(){
        return mImageId != no_image;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

}
