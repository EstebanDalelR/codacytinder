package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import java.util.ArrayList;

public final class ok {
    /* renamed from: a */
    public static <T extends zzbfq> T m20113a(Intent intent, String str, Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        return byteArrayExtra == null ? null : m20114a(byteArrayExtra, creator);
    }

    /* renamed from: a */
    public static <T extends zzbfq> T m20114a(byte[] bArr, Creator<T> creator) {
        ad.a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzbfq zzbfq = (zzbfq) creator.createFromParcel(obtain);
        obtain.recycle();
        return zzbfq;
    }

    /* renamed from: a */
    public static <T extends zzbfq> void m20115a(T t, Intent intent, String str) {
        intent.putExtra(str, m20116a(t));
    }

    /* renamed from: a */
    public static <T extends zzbfq> byte[] m20116a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: b */
    public static <T extends zzbfq> ArrayList<T> m20117b(Intent intent, String str, Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList(arrayList.size());
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(m20114a((byte[]) obj, creator));
        }
        return arrayList2;
    }
}
