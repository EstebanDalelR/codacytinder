package com.google.android.m4b.maps.p110j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

/* renamed from: com.google.android.m4b.maps.j.ab */
public final class ab implements Creator<aa> {
    /* renamed from: a */
    static void m23661a(aa aaVar, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, aaVar.f25058a);
        C5467b.m23800a(parcel, 2, aaVar.m29868a());
        C5467b.m23803a(parcel, 3, aaVar.f25059b, false);
        C5467b.m23811a(parcel, 4, aaVar.m29869b(), i, false);
        C5467b.m23802a(parcel, 5, aaVar.m29871d(), false);
        C5467b.m23806a(parcel, 6, aaVar.m29870c(), false);
        C5467b.m23796a(parcel, a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new aa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        IBinder iBinder = null;
        C6690o[] c6690oArr = iBinder;
        Bundle bundle = c6690oArr;
        String str = bundle;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 3:
                    iBinder = C5466a.m23792l(parcel, readInt);
                    break;
                case 4:
                    c6690oArr = (C6690o[]) C5466a.m23781b(parcel, readInt, C6690o.CREATOR);
                    break;
                case 5:
                    bundle = C5466a.m23793m(parcel, readInt);
                    break;
                case 6:
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new aa(i, i2, iBinder, c6690oArr, bundle, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }
}
