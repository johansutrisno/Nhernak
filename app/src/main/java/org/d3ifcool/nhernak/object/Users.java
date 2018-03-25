package org.d3ifcool.nhernak.object;

/**
 * Created by Faishal on 13/03/2018.
 */

public class Users {
    private String mName,mJob,mEmail,mContact,mAlamat;
    private int mImageResourceId;

    public Users(String mName, String mJob, String mEmail, String mContact, String mAlamat, int mImageResourceId) {
        this.mName = mName;
        this.mJob = mJob;
        this.mEmail = mEmail;
        this.mContact = mContact;
        this.mAlamat = mAlamat;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmJob() {
        return mJob;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmContact() {
        return mContact;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
