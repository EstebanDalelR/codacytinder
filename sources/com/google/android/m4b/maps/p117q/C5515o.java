package com.google.android.m4b.maps.p117q;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.q.o */
public final class C5515o implements Creator<C6763n> {
    /* renamed from: a */
    static void m24021a(C6763n c6763n, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23806a(parcel, 1, c6763n.m30126f(), false);
        C5467b.m23801a(parcel, 2, c6763n.m30127g());
        C5467b.m23808a(parcel, 3, c6763n.m30122b());
        C5467b.m23798a(parcel, 4, c6763n.m30123c());
        C5467b.m23798a(parcel, 5, c6763n.m30124d());
        C5467b.m23799a(parcel, 6, c6763n.m30125e());
        C5467b.m23800a(parcel, 7, c6763n.m30128h());
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6763n.m30121a());
        C5467b.m23800a(parcel, 8, c6763n.m30129i());
        C5467b.m23800a(parcel, 9, c6763n.m30130j());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6763n[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        double d = 0.0d;
        double d2 = d;
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        short s = (short) 0;
        float f = 0.0f;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 != AdError.NETWORK_ERROR_CODE) {
                switch (i5) {
                    case 1:
                        str = C5466a.m23791k(parcel2, readInt);
                        break;
                    case 2:
                        j = C5466a.m23788h(parcel2, readInt);
                        break;
                    case 3:
                        s = C5466a.m23785e(parcel2, readInt);
                        break;
                    case 4:
                        d = C5466a.m23790j(parcel2, readInt);
                        break;
                    case 5:
                        d2 = C5466a.m23790j(parcel2, readInt);
                        break;
                    case 6:
                        f = C5466a.m23789i(parcel2, readInt);
                        break;
                    case 7:
                        i2 = C5466a.m23786f(parcel2, readInt);
                        break;
                    case 8:
                        i3 = C5466a.m23786f(parcel2, readInt);
                        break;
                    case 9:
                        i4 = C5466a.m23786f(parcel2, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel2, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel2, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6763n(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }
}
