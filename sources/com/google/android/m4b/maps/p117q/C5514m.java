package com.google.android.m4b.maps.p117q;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.q.m */
public final class C5514m implements Creator<C6762l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C5514m.m24019a(parcel);
    }

    /* renamed from: a */
    public static C6762l m24019a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        C6761j c6761j = null;
        IBinder iBinder = c6761j;
        PendingIntent pendingIntent = iBinder;
        IBinder iBinder2 = pendingIntent;
        int i = 0;
        int i2 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        i2 = C5466a.m23786f(parcel, readInt);
                        break;
                    case 2:
                        c6761j = (C6761j) C5466a.m23778a(parcel, readInt, C6761j.CREATOR);
                        break;
                    case 3:
                        iBinder = C5466a.m23792l(parcel, readInt);
                        break;
                    case 4:
                        pendingIntent = (PendingIntent) C5466a.m23778a(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    case 5:
                        iBinder2 = C5466a.m23792l(parcel, readInt);
                        break;
                    default:
                        C5466a.m23780b(parcel, readInt);
                        break;
                }
            }
            i = C5466a.m23786f(parcel, readInt);
        }
        if (parcel.dataPosition() == a) {
            return new C6762l(i, i2, c6761j, iBinder, pendingIntent, iBinder2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    static void m24020a(C6762l c6762l, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6762l.f25317a);
        C5467b.m23804a(parcel, 2, c6762l.f25318b, i, false);
        IBinder iBinder = null;
        C5467b.m23803a(parcel, 3, c6762l.f25319c == null ? null : c6762l.f25319c.asBinder(), false);
        C5467b.m23804a(parcel, 4, c6762l.f25320d, i, false);
        if (c6762l.f25321e != null) {
            iBinder = c6762l.f25321e.asBinder();
        }
        C5467b.m23803a(parcel, 5, iBinder, false);
        C5467b.m23800a(parcel, (int) AdError.NETWORK_ERROR_CODE, c6762l.m30120a());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6762l[i];
    }
}
