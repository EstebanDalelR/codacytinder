package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2513p;

@zzzv
public final class zzakd extends zzbfm {
    public static final Creator<zzakd> CREATOR = new hz();
    public String zzcv;
    public int zzdej;
    public int zzdek;
    public boolean zzdel;
    public boolean zzdem;

    public zzakd(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzakd(int i, int i2, boolean z, boolean z2) {
        this((int) C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, false, z2);
    }

    private zzakd(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = "afma-sdk-a-v";
        String str2 = z ? "0" : "1";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        this(stringBuilder.toString(), i, i2, z, z3);
    }

    zzakd(String str, int i, int i2, boolean z, boolean z2) {
        this.zzcv = str;
        this.zzdej = i;
        this.zzdek = i2;
        this.zzdel = z;
        this.zzdem = z2;
    }

    public static zzakd zzrd() {
        return new zzakd(11910208, 11910208, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzcv, false);
        oj.m20091a(parcel, 3, this.zzdej);
        oj.m20091a(parcel, 4, this.zzdek);
        oj.m20101a(parcel, 5, this.zzdel);
        oj.m20101a(parcel, 6, this.zzdem);
        oj.m20088a(parcel, i);
    }
}
