package com.google.android.m4b.maps.p117q;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import com.google.android.m4b.maps.p115o.C6745p;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.q.k */
public final class C5513k implements Creator<C6761j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5513k.m24017a(parcel);
    }

    /* renamed from: a */
    public static C6761j m24017a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List list = C6761j.f25309a;
        C6745p c6745p = null;
        String str = c6745p;
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != AdError.NETWORK_ERROR_CODE) {
                switch (i2) {
                    case 1:
                        c6745p = (C6745p) C5466a.m23778a(parcel, readInt, C6745p.CREATOR);
                        break;
                    case 2:
                        z = C5466a.m23783c(parcel, readInt);
                        break;
                    case 3:
                        z2 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 4:
                        z3 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 5:
                        list = C5466a.m23782c(parcel, readInt, C6753b.CREATOR);
                        break;
                    case 6:
                        str = C5466a.m23791k(parcel, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6761j(i, c6745p, z, z2, z3, list, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m24018a(C6761j c6761j, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23804a(parcel, 1, c6761j.f25310b, i, false);
        C5467b.m23809a(parcel, 2, c6761j.f25311c);
        C5467b.m23809a(parcel, 3, c6761j.f25312d);
        C5467b.m23809a(parcel, 4, c6761j.f25313e);
        C5467b.m23815b(parcel, 5, c6761j.f25314f, false);
        C5467b.m23806a(parcel, 6, c6761j.f25315g, false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6761j.m30116a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6761j[i];
    }
}
