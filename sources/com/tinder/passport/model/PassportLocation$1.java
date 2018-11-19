package com.tinder.passport.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PassportLocation$1 implements Creator<PassportLocation> {
    PassportLocation$1() {
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m41092a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m41093a(i);
    }

    /* renamed from: a */
    public PassportLocation m41092a(Parcel parcel) {
        return new PassportLocation(parcel, null);
    }

    /* renamed from: a */
    public PassportLocation[] m41093a(int i) {
        return new PassportLocation[i];
    }
}
