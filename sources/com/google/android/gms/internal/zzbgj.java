package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzbgj extends zzbfm implements zzbgp<String, Integer> {
    public static final Creator<zzbgj> CREATOR = new oy();
    private int zzeck;
    private final HashMap<String, Integer> zzgbz;
    private final SparseArray<String> zzgca;
    private final ArrayList<zzbgk> zzgcb;

    public zzbgj() {
        this.zzeck = 1;
        this.zzgbz = new HashMap();
        this.zzgca = new SparseArray();
        this.zzgcb = null;
    }

    zzbgj(int i, ArrayList<zzbgk> arrayList) {
        this.zzeck = i;
        this.zzgbz = new HashMap();
        this.zzgca = new SparseArray();
        this.zzgcb = null;
        zzd(arrayList);
    }

    private final void zzd(ArrayList<zzbgk> arrayList) {
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zzbgk zzbgk = (zzbgk) obj;
            zzi(zzbgk.zzgcc, zzbgk.zzgcd);
        }
    }

    public final /* synthetic */ Object convertBack(Object obj) {
        String str = (String) this.zzgca.get(((Integer) obj).intValue());
        return (str == null && this.zzgbz.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        List arrayList = new ArrayList();
        for (String str : this.zzgbz.keySet()) {
            arrayList.add(new zzbgk(str, ((Integer) this.zzgbz.get(str)).intValue()));
        }
        oj.m20112c(parcel, 2, arrayList, false);
        oj.m20088a(parcel, i);
    }

    public final zzbgj zzi(String str, int i) {
        this.zzgbz.put(str, Integer.valueOf(i));
        this.zzgca.put(i, str);
        return this;
    }
}
