package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public class DeviceMetaData extends zzbfm {
    public static final Creator<DeviceMetaData> CREATOR = new C2427e();
    private int zzeck;
    private boolean zzeeq;
    private long zzeer;
    private final boolean zzees;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.zzeck = i;
        this.zzeeq = z;
        this.zzeer = j;
        this.zzees = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzeer;
    }

    public boolean isChallengeAllowed() {
        return this.zzees;
    }

    public boolean isLockScreenSolved() {
        return this.zzeeq;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, isLockScreenSolved());
        oj.a(parcel, 3, getMinAgeOfLockScreen());
        oj.a(parcel, 4, isChallengeAllowed());
        oj.a(parcel, i);
    }
}
