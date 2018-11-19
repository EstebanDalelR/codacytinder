package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class User$1 implements Creator<User> {
    User$1() {
    }

    public User createFromParcel(Parcel parcel) {
        return new User(parcel);
    }

    public User[] newArray(int i) {
        return new User[i];
    }
}
