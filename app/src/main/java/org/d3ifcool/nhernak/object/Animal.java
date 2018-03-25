package org.d3ifcool.nhernak.object;

/**
 * Created by Johan Sutrisno on 28/02/2018.
 */

public class Animal {
    String mAnimal;
    int mImageResource;
    String mDetail;

    public Animal(String vAnimal, int vImageResource, String vDetail) {
        mAnimal = vAnimal;
        mImageResource = vImageResource;
        mDetail = vDetail;
    }

    public String getmAnimal() {
        return mAnimal;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmDetail() {
        return mDetail;
    }
}
