package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.v */
public final class C5501v implements Creator<C6748u> {
    /* renamed from: a */
    static void m23977a(C6748u c6748u, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23815b(parcel, 1, c6748u.m30064b(), false);
        C5467b.m23809a(parcel, 2, c6748u.m30065c());
        C5467b.m23809a(parcel, 3, c6748u.m30066d());
        C5467b.m23809a(parcel, 4, c6748u.m30067e());
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6748u.m30063a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6748u[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List list = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != AdError.NETWORK_ERROR_CODE) {
                switch (i2) {
                    case 1:
                        list = C5466a.m23782c(parcel, readInt, C6745p.CREATOR);
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
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6748u(i, list, z, z2, z3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
