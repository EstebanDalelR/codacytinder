package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class zzceo extends zzbfm implements Result {
    public static final Creator<zzceo> CREATOR = new re();
    private static zzceo zzilj = new zzceo(Status.zzfni);
    private final Status mStatus;

    public zzceo(Status status) {
        this.mStatus = status;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 1, getStatus(), i, false);
        oj.m20088a(parcel, a);
    }
}
