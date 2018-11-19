package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p108h.C6691q;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.o.x */
public final class C5502x implements Creator<C6749w> {
    /* renamed from: a */
    static void m23978a(C6749w c6749w, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23804a(parcel, 1, c6749w.m30070c(), i, false);
        C5467b.m23804a(parcel, 2, c6749w.m30069b(), i, false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6749w.m30068a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6749w[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        C6691q c6691q = null;
        int i = 0;
        C6750y c6750y = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != AdError.NETWORK_ERROR_CODE) {
                switch (i2) {
                    case 1:
                        c6691q = (C6691q) C5466a.m23778a(parcel, readInt, C6691q.CREATOR);
                        break;
                    case 2:
                        c6750y = (C6750y) C5466a.m23778a(parcel, readInt, C6750y.CREATOR);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6749w(i, c6691q, c6750y);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
