package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;

public final class ne implements Creator<zzawf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                oi.m20060b(parcel, readInt);
            } else {
                credential = (Credential) oi.m20057a(parcel, readInt, Credential.CREATOR);
            }
        }
        oi.m20054A(parcel, a);
        return new zzawf(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzawf[i];
    }
}
