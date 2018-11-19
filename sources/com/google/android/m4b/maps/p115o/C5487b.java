package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.b */
public final class C5487b implements Creator<C6736a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5487b.m23960a(parcel);
    }

    /* renamed from: a */
    public static C6736a m23960a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        long j = 0;
        long j2 = j;
        List list = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        list = C5466a.m23782c(parcel, readInt, C6737c.CREATOR);
                        break;
                    case 2:
                        j = C5466a.m23788h(parcel, readInt);
                        break;
                    case 3:
                        j2 = C5466a.m23788h(parcel, readInt);
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
            return new C6736a(i, list, j, j2, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m23961a(C6736a c6736a, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23815b(parcel, 1, c6736a.f25245a, false);
        C5467b.m23801a(parcel, 2, c6736a.f25246b);
        C5467b.m23801a(parcel, 3, c6736a.f25247c);
        C5467b.m23800a(parcel, 4, c6736a.f25248d);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6736a.m30040a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6736a[i];
    }
}
