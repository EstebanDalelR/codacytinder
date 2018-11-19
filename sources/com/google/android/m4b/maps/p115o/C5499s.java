package com.google.android.m4b.maps.p115o;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.s */
public final class C5499s implements Creator<C6746r> {
    /* renamed from: a */
    static void m23975a(C6746r c6746r, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23815b(parcel, 1, c6746r.m30060a(), false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6746r.m30061b());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6746r[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List list = C6746r.f25279a;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                list = C5466a.m23782c(parcel, readInt, Location.CREATOR);
            } else if (i2 != AdError.NETWORK_ERROR_CODE) {
                C5466a.m23780b(parcel, readInt);
            } else {
                i = C5466a.m23786f(parcel, readInt);
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6746r(i, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
