package com.google.android.m4b.maps.p120t;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.t.b */
public final class C5520b implements Creator<C6770a> {
    /* renamed from: a */
    static void m24028a(C6770a c6770a, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6770a.f25336a);
        C5467b.m23806a(parcel, 2, c6770a.f25337b, false);
        C5467b.m23800a(parcel, 3, c6770a.f25338c);
        C5467b.m23800a(parcel, 4, c6770a.f25339d);
        C5467b.m23806a(parcel, 5, c6770a.f25340e, false);
        C5467b.m23806a(parcel, 6, c6770a.f25341f, false);
        C5467b.m23809a(parcel, 7, c6770a.f25342g);
        C5467b.m23806a(parcel, 8, c6770a.f25343h, false);
        C5467b.m23809a(parcel, 9, c6770a.f25344i);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6770a[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                case 3:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 4:
                    i3 = C5466a.m23786f(parcel, readInt);
                    break;
                case 5:
                    str2 = C5466a.m23791k(parcel, readInt);
                    break;
                case 6:
                    str3 = C5466a.m23791k(parcel, readInt);
                    break;
                case 7:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 8:
                    str4 = C5466a.m23791k(parcel, readInt);
                    break;
                case 9:
                    z2 = C5466a.m23783c(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6770a(i, str, i2, i3, str2, str3, z, str4, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
