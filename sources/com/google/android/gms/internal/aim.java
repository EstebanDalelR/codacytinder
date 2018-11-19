package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class aim implements Creator<zzjj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        Bundle bundle = null;
        List list = bundle;
        String str = list;
        zzmn zzmn = str;
        Location location = zzmn;
        String str2 = location;
        Bundle bundle2 = str2;
        Bundle bundle3 = bundle2;
        List list2 = bundle3;
        String str3 = list2;
        String str4 = str3;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                case 2:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 3:
                    bundle = oi.m20074n(parcel2, readInt);
                    break;
                case 4:
                    i2 = oi.m20065e(parcel2, readInt);
                    break;
                case 5:
                    list = oi.m20084x(parcel2, readInt);
                    break;
                case 6:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 7:
                    i3 = oi.m20065e(parcel2, readInt);
                    break;
                case 8:
                    z2 = oi.m20063c(parcel2, readInt);
                    break;
                case 9:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 10:
                    zzmn = (zzmn) oi.m20057a(parcel2, readInt, zzmn.CREATOR);
                    break;
                case 11:
                    location = (Location) oi.m20057a(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = oi.m20072l(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = oi.m20074n(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = oi.m20074n(parcel2, readInt);
                    break;
                case 15:
                    list2 = oi.m20084x(parcel2, readInt);
                    break;
                case 16:
                    str3 = oi.m20072l(parcel2, readInt);
                    break;
                case 17:
                    str4 = oi.m20072l(parcel2, readInt);
                    break;
                case 18:
                    z3 = oi.m20063c(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzjj(i, j, bundle, i2, list, z, i3, z2, str, zzmn, location, str2, bundle2, bundle3, list2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjj[i];
    }
}
