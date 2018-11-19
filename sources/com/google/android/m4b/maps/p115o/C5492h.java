package com.google.android.m4b.maps.p115o;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import com.google.android.m4b.maps.p117q.C6763n;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.o.h */
public final class C5492h implements Creator<C6738g> {
    /* renamed from: a */
    static void m23964a(C6738g c6738g, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23815b(parcel, 1, c6738g.m30044b(), false);
        C5467b.m23800a(parcel, 2, c6738g.m30045c());
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6738g.m30043a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6738g[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        list = C5466a.m23782c(parcel, readInt, C6763n.CREATOR);
                        break;
                    case 2:
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
            return new C6738g(i, list, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
