package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;

public final class zzavz extends zzbfm {
    public static final Creator<zzavz> CREATOR = new nb();
    private final Credential zzegc;

    public zzavz(Credential credential) {
        this.zzegc = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 1, this.zzegc, i, false);
        oj.m20088a(parcel, a);
    }
}
