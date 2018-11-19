package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;
import java.util.Map.Entry;

@zzzv
public final class zzrr extends zzbfm {
    public static final Creator<zzrr> CREATOR = new apa();
    private String url;
    private String[] zzbyo;
    private String[] zzbyp;

    zzrr(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzbyo = strArr;
        this.zzbyp = strArr2;
    }

    public static zzrr zzg(aom aom) throws zza {
        Map b = aom.mo6872b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzrr(aom.m19392e(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 1, this.url, false);
        oj.m20105a(parcel, 2, this.zzbyo, false);
        oj.m20105a(parcel, 3, this.zzbyp, false);
        oj.m20088a(parcel, i);
    }
}
