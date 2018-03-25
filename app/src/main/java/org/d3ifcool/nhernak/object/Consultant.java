package org.d3ifcool.nhernak.object;

/**
 * Created by Johan Sutrisno on 28/02/2018.
 */

public class Consultant {
    String mName;
    String mSpecialization;
    String mPrice;
    int mImageResourceId;

    public Consultant(String vName, String vSpecialization, String vPrice, int vImageResourceId) {
        mName = vName;
        mSpecialization = vSpecialization;
        mPrice = vPrice;
        mImageResourceId = vImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmSpecialization() {
        return mSpecialization;
    }

    public String getmPrice() {
        return mPrice;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
