package com.google.android.m4b.maps.p110j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.j.z */
public final class C5464z implements Creator<C6713y> {
    /* renamed from: a */
    static void m23775a(C6713y c6713y, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6713y.f25110a);
        C5467b.m23803a(parcel, 2, c6713y.f25111b, false);
        C5467b.m23804a(parcel, 3, c6713y.m29970b(), i, false);
        C5467b.m23809a(parcel, 4, c6713y.m29971c());
        C5467b.m23809a(parcel, 5, c6713y.m29972d());
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6713y[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        IBinder iBinder = null;
        C6676a c6676a = iBinder;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    iBinder = C5466a.m23792l(parcel, readInt);
                    break;
                case 3:
                    c6676a = (C6676a) C5466a.m23778a(parcel, readInt, C6676a.CREATOR);
                    break;
                case 4:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 5:
                    z2 = C5466a.m23783c(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6713y(i, iBinder, c6676a, z, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
