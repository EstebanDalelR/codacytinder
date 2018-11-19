package com.google.android.m4b.maps.p112l;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.l.b */
public final class C5469b implements Creator<C6714a> {
    /* renamed from: a */
    static void m23818a(C6714a c6714a, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6714a.f25115a);
        C5467b.m23801a(parcel, 2, c6714a.m29973a());
        C5467b.m23806a(parcel, 4, c6714a.m29975c(), false);
        C5467b.m23806a(parcel, 5, c6714a.m29976d(), false);
        C5467b.m23806a(parcel, 6, c6714a.m29977e(), false);
        C5467b.m23806a(parcel, 7, c6714a.m29978f(), false);
        C5467b.m23806a(parcel, 8, c6714a.m29979g(), false);
        C5467b.m23801a(parcel, 10, c6714a.m29982j());
        C5467b.m23801a(parcel, 11, c6714a.m29981i());
        C5467b.m23800a(parcel, 12, c6714a.m29974b());
        C5467b.m23806a(parcel, 13, c6714a.m29980h(), false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6714a[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel2, readInt);
                    break;
                case 2:
                    j = C5466a.m23788h(parcel2, readInt);
                    break;
                case 4:
                    str = C5466a.m23791k(parcel2, readInt);
                    break;
                case 5:
                    str2 = C5466a.m23791k(parcel2, readInt);
                    break;
                case 6:
                    str3 = C5466a.m23791k(parcel2, readInt);
                    break;
                case 7:
                    str4 = C5466a.m23791k(parcel2, readInt);
                    break;
                case 8:
                    str5 = C5466a.m23791k(parcel2, readInt);
                    break;
                case 10:
                    j2 = C5466a.m23788h(parcel2, readInt);
                    break;
                case 11:
                    j3 = C5466a.m23788h(parcel2, readInt);
                    break;
                case 12:
                    i2 = C5466a.m23786f(parcel2, readInt);
                    break;
                case 13:
                    str6 = C5466a.m23791k(parcel2, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6714a(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }
}
