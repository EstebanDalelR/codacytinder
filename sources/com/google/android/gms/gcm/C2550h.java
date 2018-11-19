package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.gcm.h */
final class C2550h implements Creator<PendingCallback> {
    C2550h() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingCallback[i];
    }
}
