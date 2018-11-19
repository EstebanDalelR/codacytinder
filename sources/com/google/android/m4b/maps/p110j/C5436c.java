package com.google.android.m4b.maps.p110j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.j.c */
public final class C5436c implements Creator<C6698b> {
    /* renamed from: a */
    static void m23662a(C6698b c6698b, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, c6698b.f25064a);
        C5467b.m23803a(parcel, 2, c6698b.f25065b, false);
        C5467b.m23811a(parcel, 3, c6698b.f25066c, i, false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6698b[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        IBinder iBinder = null;
        int i = 0;
        C6690o[] c6690oArr = null;
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
                    c6690oArr = (C6690o[]) C5466a.m23781b(parcel, readInt, C6690o.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new C6698b(i, iBinder, c6690oArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
