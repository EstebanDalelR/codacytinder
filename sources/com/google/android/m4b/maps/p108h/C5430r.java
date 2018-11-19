package com.google.android.m4b.maps.p108h;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.h.r */
public final class C5430r implements Creator<C6691q> {
    /* renamed from: a */
    static void m23648a(C6691q c6691q, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6691q.m29853e());
        C5467b.m23806a(parcel, 2, c6691q.m29850b(), false);
        C5467b.m23804a(parcel, 3, c6691q.m29849a(), i, false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6691q.m29851c());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6691q[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = str;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        i2 = C5466a.m23786f(parcel, readInt);
                        break;
                    case 2:
                        str = C5466a.m23791k(parcel, readInt);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) C5466a.m23778a(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6691q(i, i2, str, pendingIntent);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
