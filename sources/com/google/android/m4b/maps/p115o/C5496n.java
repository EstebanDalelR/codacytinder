package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.o.n */
public final class C5496n implements Creator<C6744m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5496n.m23970a(parcel);
    }

    /* renamed from: a */
    public static C6744m m23970a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        long j = 0;
        int i = 0;
        int i2 = AdError.NETWORK_ERROR_CODE;
        int i3 = 1;
        int i4 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 != AdError.NETWORK_ERROR_CODE) {
                switch (i5) {
                    case 1:
                        i3 = C5466a.m23786f(parcel, readInt);
                        break;
                    case 2:
                        i4 = C5466a.m23786f(parcel, readInt);
                        break;
                    case 3:
                        j = C5466a.m23788h(parcel, readInt);
                        break;
                    case 4:
                        i2 = C5466a.m23786f(parcel, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6744m(i, i2, i3, i4, j);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m23971a(C6744m c6744m, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6744m.f25265a);
        C5467b.m23800a(parcel, 2, c6744m.f25266b);
        C5467b.m23801a(parcel, 3, c6744m.f25267c);
        C5467b.m23800a(parcel, 4, c6744m.f25268d);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6744m.m30053a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6744m[i];
    }
}
