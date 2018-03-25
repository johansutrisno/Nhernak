package org.d3ifcool.nhernak.object;

/**
 * Created by Johan Sutrisno on 03/03/2018.
 */

public class Article {
    String mTitleArticle;
    String mCategory;
    int mImageResourceId;

    public Article(String vTitleArticle, String vCategory, int vImageResourceId) {
        mTitleArticle = vTitleArticle;
        mCategory = vCategory;
        mImageResourceId = vImageResourceId;
    }

    public String getmTitleArticle() {
        return mTitleArticle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
