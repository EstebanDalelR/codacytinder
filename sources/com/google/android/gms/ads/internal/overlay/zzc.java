package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class zzc extends zzbfm {
    public static final Creator<zzc> CREATOR = new C2395b();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    private String zzcht;
    public final String zzchu;
    public final String zzchv;
    private String zzchw;

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.zzcht = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzchu = str5;
        this.zzchv = str6;
        this.zzchw = str7;
        this.intent = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 2, this.zzcht, false);
        oj.a(parcel, 3, this.url, false);
        oj.a(parcel, 4, this.mimeType, false);
        oj.a(parcel, 5, this.packageName, false);
        oj.a(parcel, 6, this.zzchu, false);
        oj.a(parcel, 7, this.zzchv, false);
        oj.a(parcel, 8, this.zzchw, false);
        oj.a(parcel, 9, this.intent, i, false);
        oj.a(parcel, a);
    }
}
