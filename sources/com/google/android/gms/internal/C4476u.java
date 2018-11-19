package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.u */
public final class C4476u implements Creator<zzaax> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        long j4 = j3;
        String str = null;
        String str2 = str;
        List list = str2;
        List list2 = list;
        List list3 = list2;
        String str3 = list3;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        zzabj zzabj = str6;
        String str7 = zzabj;
        String str8 = str7;
        zzaeq zzaeq = str8;
        List list4 = zzaeq;
        List list5 = list4;
        zzaaz zzaaz = list5;
        String str9 = zzaaz;
        List list6 = str9;
        String str10 = list6;
        zzaey zzaey = str10;
        String str11 = zzaey;
        Bundle bundle = str11;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                case 2:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 3:
                    str2 = oi.m20072l(parcel2, readInt);
                    break;
                case 4:
                    list = oi.m20084x(parcel2, readInt);
                    break;
                case 5:
                    i2 = oi.m20065e(parcel2, readInt);
                    break;
                case 6:
                    list2 = oi.m20084x(parcel2, readInt);
                    break;
                case 7:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 8:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 9:
                    j2 = oi.m20066f(parcel2, readInt);
                    break;
                case 10:
                    list3 = oi.m20084x(parcel2, readInt);
                    break;
                case 11:
                    j3 = oi.m20066f(parcel2, readInt);
                    break;
                case 12:
                    i3 = oi.m20065e(parcel2, readInt);
                    break;
                case 13:
                    str3 = oi.m20072l(parcel2, readInt);
                    break;
                case 14:
                    j4 = oi.m20066f(parcel2, readInt);
                    break;
                case 15:
                    str4 = oi.m20072l(parcel2, readInt);
                    break;
                case 18:
                    z2 = oi.m20063c(parcel2, readInt);
                    break;
                case 19:
                    str5 = oi.m20072l(parcel2, readInt);
                    break;
                case 21:
                    str6 = oi.m20072l(parcel2, readInt);
                    break;
                case 22:
                    z3 = oi.m20063c(parcel2, readInt);
                    break;
                case 23:
                    z4 = oi.m20063c(parcel2, readInt);
                    break;
                case 24:
                    z5 = oi.m20063c(parcel2, readInt);
                    break;
                case 25:
                    z6 = oi.m20063c(parcel2, readInt);
                    break;
                case 26:
                    z7 = oi.m20063c(parcel2, readInt);
                    break;
                case 28:
                    zzabj = (zzabj) oi.m20057a(parcel2, readInt, zzabj.CREATOR);
                    break;
                case 29:
                    str7 = oi.m20072l(parcel2, readInt);
                    break;
                case 30:
                    str8 = oi.m20072l(parcel2, readInt);
                    break;
                case 31:
                    z8 = oi.m20063c(parcel2, readInt);
                    break;
                case 32:
                    z9 = oi.m20063c(parcel2, readInt);
                    break;
                case 33:
                    zzaeq = (zzaeq) oi.m20057a(parcel2, readInt, zzaeq.CREATOR);
                    break;
                case 34:
                    list4 = oi.m20084x(parcel2, readInt);
                    break;
                case 35:
                    list5 = oi.m20084x(parcel2, readInt);
                    break;
                case 36:
                    z10 = oi.m20063c(parcel2, readInt);
                    break;
                case 37:
                    zzaaz = (zzaaz) oi.m20057a(parcel2, readInt, zzaaz.CREATOR);
                    break;
                case 38:
                    z11 = oi.m20063c(parcel2, readInt);
                    break;
                case 39:
                    str9 = oi.m20072l(parcel2, readInt);
                    break;
                case 40:
                    list6 = oi.m20084x(parcel2, readInt);
                    break;
                case 42:
                    z12 = oi.m20063c(parcel2, readInt);
                    break;
                case 43:
                    str10 = oi.m20072l(parcel2, readInt);
                    break;
                case 44:
                    zzaey = (zzaey) oi.m20057a(parcel2, readInt, zzaey.CREATOR);
                    break;
                case 45:
                    str11 = oi.m20072l(parcel2, readInt);
                    break;
                case 46:
                    z13 = oi.m20063c(parcel2, readInt);
                    break;
                case 47:
                    z14 = oi.m20063c(parcel2, readInt);
                    break;
                case 48:
                    bundle = oi.m20074n(parcel2, readInt);
                    break;
                case 49:
                    z15 = oi.m20063c(parcel2, readInt);
                    break;
                case 50:
                    i4 = oi.m20065e(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzaax(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, zzabj, str7, str8, z8, z9, zzaeq, list4, list5, z10, zzaaz, z11, str9, list6, z12, str10, zzaey, str11, z13, z14, bundle, z15, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaax[i];
    }
}
