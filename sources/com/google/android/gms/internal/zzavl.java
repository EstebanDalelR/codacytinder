package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;

public final class zzavl extends zzbfm {
    public static final Creator<zzavl> CREATOR = new mn();
    private String accountType;
    private int zzeck;
    private PendingIntent zzeev;

    zzavl(int i, String str, PendingIntent pendingIntent) {
        this.zzeck = 1;
        this.accountType = (String) ad.a(str);
        this.zzeev = (PendingIntent) ad.a(pendingIntent);
    }

    public zzavl(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20098a(parcel, 2, this.accountType, false);
        oj.m20096a(parcel, 3, this.zzeev, i, false);
        oj.m20088a(parcel, a);
    }
}
