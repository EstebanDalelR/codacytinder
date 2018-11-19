package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.j */
public final class C5493j implements Creator<C6739i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5493j.m23965a(parcel);
    }

    /* renamed from: a */
    public static C6739i m23965a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                int a2 = C5466a.m23777a(parcel, readInt);
                readInt = parcel.dataPosition();
                if (a2 == 0) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int readInt2 = parcel.readInt();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(readInt + a2);
                    list = arrayList;
                }
            } else if (i2 != AdError.NETWORK_ERROR_CODE) {
                C5466a.m23780b(parcel, readInt);
            } else {
                i = C5466a.m23786f(parcel, readInt);
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6739i(i, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m23966a(C6739i c6739i, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23807a(parcel, 1, c6739i.m30047b(), false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6739i.m30046a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6739i[i];
    }
}
