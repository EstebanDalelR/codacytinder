package com.google.android.m4b.maps.p122v;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.v.e */
public final class C5526e implements Creator<C6775d> {
    /* renamed from: a */
    static void m24035a(C6775d c6775d, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6775d.f25346a);
        C5467b.m23809a(parcel, 2, c6775d.f25347b);
        C5467b.m23815b(parcel, 3, c6775d.f25348c, false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6775d[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        List list = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 3:
                    list = C5466a.m23782c(parcel, readInt, C6690o.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6775d(i, z, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
