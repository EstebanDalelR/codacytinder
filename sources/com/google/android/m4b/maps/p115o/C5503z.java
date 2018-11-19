package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.o.z */
public final class C5503z implements Creator<C6750y> {
    /* renamed from: a */
    static void m23979a(C6750y c6750y, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23809a(parcel, 1, c6750y.m30072b());
        C5467b.m23809a(parcel, 2, c6750y.m30074d());
        C5467b.m23809a(parcel, 3, c6750y.m30076f());
        C5467b.m23809a(parcel, 4, c6750y.m30073c());
        C5467b.m23809a(parcel, 5, c6750y.m30075e());
        C5467b.m23809a(parcel, 6, c6750y.m30077g());
        C5467b.m23809a(parcel, 7, c6750y.m30078h());
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6750y.m30071a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6750y[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != AdError.NETWORK_ERROR_CODE) {
                switch (i2) {
                    case 1:
                        z = C5466a.m23783c(parcel, readInt);
                        break;
                    case 2:
                        z2 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 3:
                        z3 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 4:
                        z4 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 5:
                        z5 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 6:
                        z6 = C5466a.m23783c(parcel, readInt);
                        break;
                    case 7:
                        z7 = C5466a.m23783c(parcel, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6750y(i, z, z2, z3, z4, z5, z6, z7);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
