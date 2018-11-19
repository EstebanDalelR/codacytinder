package com.google.android.m4b.maps.p105e;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import com.google.android.m4b.maps.p120t.C6770a;

/* renamed from: com.google.android.m4b.maps.e.d */
public final class C5364d implements Creator<C6669c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5364d.m23561a(parcel);
    }

    /* renamed from: a */
    public static C6669c m23561a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        C6770a c6770a = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    c6770a = (C6770a) C5466a.m23778a(parcel, readInt, C6770a.CREATOR);
                    break;
                case 3:
                    bArr = C5466a.m23794n(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6669c(i, c6770a, bArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m23562a(C6669c c6669c, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6669c.f24954a);
        C5467b.m23804a(parcel, 2, c6669c.f24955b, i, false);
        C5467b.m23810a(parcel, 3, c6669c.f24956c, false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6669c[i];
    }
}
