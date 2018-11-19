package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbgt extends zzbfm {
    public static final Creator<zzbgt> CREATOR = new pd();
    private int zzeck;
    private final HashMap<String, Map<String, zzbgo<?, ?>>> zzgco;
    private final ArrayList<zzbgu> zzgcp = null;
    private final String zzgcq;

    zzbgt(int i, ArrayList<zzbgu> arrayList, String str) {
        this.zzeck = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzbgu zzbgu = (zzbgu) arrayList.get(i2);
            hashMap.put(zzbgu.className, zzbgu.zzama());
        }
        this.zzgco = hashMap;
        this.zzgcq = (String) ad.a(str);
        zzaly();
    }

    private final void zzaly() {
        for (String str : this.zzgco.keySet()) {
            Map map = (Map) this.zzgco.get(str);
            for (String str2 : map.keySet()) {
                ((zzbgo) map.get(str2)).zza(this);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.zzgco.keySet()) {
            stringBuilder.append(str);
            stringBuilder.append(":\n");
            Map map = (Map) this.zzgco.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ");
                stringBuilder.append(str2);
                stringBuilder.append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        List arrayList = new ArrayList();
        for (String str : this.zzgco.keySet()) {
            arrayList.add(new zzbgu(str, (Map) this.zzgco.get(str)));
        }
        oj.m20112c(parcel, 2, arrayList, false);
        oj.m20098a(parcel, 3, this.zzgcq, false);
        oj.m20088a(parcel, i);
    }

    public final String zzalz() {
        return this.zzgcq;
    }

    public final Map<String, zzbgo<?, ?>> zzgq(String str) {
        return (Map) this.zzgco.get(str);
    }
}
