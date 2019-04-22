package com.animeshroy.notekeeper.testapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Details implements Parcelable {

    private String name;
    private String age;
    private String phone;

    public Details(String name, String age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    protected Details(Parcel in) {
        name = in.readString();
        age = in.readString();
        phone = in.readString();
    }

    public static final Creator<Details> CREATOR = new Creator<Details>() {
        @Override
        public Details createFromParcel(Parcel in) {
            return new Details(in);
        }

        @Override
        public Details[] newArray(int size) {
            return new Details[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(phone);
    }
}
