package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.o.d */
public final class C5489d implements Creator<C6737c> {
    /* renamed from: a */
    static void m23962a(C6737c c6737c, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6737c.f25251a);
        C5467b.m23800a(parcel, 2, c6737c.f25252b);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6737c.m30042b());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6737c[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 != AdError.NETWORK_ERROR_CODE) {
                switch (i4) {
                    case 1:
                        i2 = C5466a.m23786f(parcel, readInt);
                        break;
                    case 2:
                        i3 = C5466a.m23786f(parcel, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6737c(i, i2, i3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
